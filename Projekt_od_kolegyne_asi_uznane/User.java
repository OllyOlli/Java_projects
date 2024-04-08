package cz.robodreams.javadeveloper.project;

import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
public class User<T extends Item> {
    private String name;
    private String address;
    private String mobileNumber;
    private Set<T> borrowedItems;
    private Set<T> reservedItems;

    User(Builder<T> builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.mobileNumber = builder.mobileNumber;
        this.borrowedItems = new HashSet<>();
        this.reservedItems = new HashSet<>();
    }

    public static class Builder<T extends Item> {
        private final String name;
        private String address;
        private String mobileNumber;

        public Builder(String name) {
            this.name = name;
        }

        public Builder<T> address(String address) {
            this.address = address;
            return this;
        }

        public Builder<T> mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public User<T> build() {
            return new User<>(this);
        }
    }

    public boolean borrowItem(T item) {
        if (item.isAvailable() || this.equals(item.getUser()) && !borrowedItems.contains(item)) {
            reservedItems.remove(item);
            borrowedItems.add(item);
            return true;
        } else {
            return false;
        }
    }

    public boolean returnOrUnreservedItem(T item) {
        if (borrowedItems.contains(item) || reservedItems.contains(item)) {
            reservedItems.remove(item);
            borrowedItems.remove(item);
            return true;
        } else {
            return false;
        }
    }

    public boolean reserveItem(T item) {
        if (item.isAvailable() && !reservedItems.contains(item)) {
            reservedItems.add(item);
            return true;
        } else {
            return false;
        }
    }

    public List<T> getBorrowedItemsList() {
        return new ArrayList<>(borrowedItems);
    }

    public List<T> getReservedItemsList() {
        return new ArrayList<>(reservedItems);
    }

    public boolean hasBorrowedItems() {
        return borrowedItems.stream().anyMatch(Objects::nonNull);
    }

    public boolean hasReservedItems() {
        return reservedItems.stream().anyMatch(Objects::nonNull);
    }

    public long countBorrowedItems() {
        return borrowedItems.stream().count();
    }

    public long countReservedItems() {
        return reservedItems.stream().count();
    }
}