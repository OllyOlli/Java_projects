package cz.robodreams.javadeveloper.project;

import lombok.Getter;

import java.util.*;
import java.util.function.Predicate;

@Getter
public class Library<T extends Item> {
    private final String nameOfLibrary;
    private Set<T> allItems;
    private Set<T> availableItems;
    private Set<User<T>> users;
    private final Map<T, List<UserChannel<T>>> observers = new HashMap<>();

    Predicate<User<T>> isUserValid = u -> u != null && users.contains(u);


    public Library(String nameOfLibrary, List<T> items, List<User<T>> users) {
        this.nameOfLibrary = String.valueOf(nameOfLibrary);
        this.allItems = new HashSet<>(items);
        this.availableItems = new HashSet<>(items);
        this.users = new HashSet<>(users);
    }

    public void addUserChannel(T item, UserChannel<T> channel) {
        if (!observers.containsKey(item)) {
            observers.put(item, new ArrayList<>());
        }
        List<UserChannel<T>> itemChannels = observers.get(item);
        if (!itemChannels.contains(channel)) {
            itemChannels.add(channel);
        }
    }

    public void removeUserChannel(T item, UserChannel<T> channel) {
        if (observers.containsKey(item)) {
            List<UserChannel<T>> itemChannels = observers.get(item);
            if (itemChannels != null) {
                itemChannels.remove(channel);
            }
        }
    }

    public void addItem(T item) {
        allItems.add(item);
        availableItems.add(item);
    }

    public void borrowItem(T item, User<T> user) {
        if (item.isAvailable() && availableItems.contains(item) && isUserValid.test(user)) {
            availableItems.remove(item);
            user.borrowItem(item);
            item.borrowToUser((User<Item>) user);
            notifyObservers(item, "borrowed");
        }
    }

    public void returnOrUnreservedItem(T item, User<T> user) {
        if (!item.isAvailable() && !availableItems.contains(item) && isUserValid.test(user)) {
            availableItems.add(item);
            user.returnOrUnreservedItem(item);
            item.returnToLibrary();
            notifyObservers(item, "returned");
        }
    }

    public Set<T> getBorrowedItems(User<T> user) {
        return user.getBorrowedItems();
    }

    public void reserveItem(T item, User<T> user) {
        if (item.isAvailable() && availableItems.contains(item) && isUserValid.test(user)) {
            availableItems.remove(item);
            user.reserveItem(item);
            item.reserveToUser((User<Item>) user);
            notifyObservers(item, "reserved");
        }
    }

    public void printAvailableItems() {
        availableItems.stream()
                .filter(Item::isAvailable)
                .forEach(System.out::println);
    }

    private void notifyObservers(T item, String action) {
        observers.getOrDefault(item, new ArrayList<>()).forEach(channel -> {
            switch (action) {
                case "borrowed" -> channel.onItemBorrowed(item);
                case "returned" -> channel.onItemReturned(item);
                case "reserved" -> channel.onItemReserved(item);
            }
        });
    }

    public Item findItemById(Long id) {
        return allItems.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
