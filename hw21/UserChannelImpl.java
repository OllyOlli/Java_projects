package cz.robodreams.javadeveloper.project;

public class UserChannelImpl<T extends Item> implements UserChannel<T> {

    private User<T> user;

    public UserChannelImpl(User<T> user) {
        this.user = user;
    }

    @Override
    public void onItemBorrowed(T item) {
        System.out.printf("Message to %s: Item %s was borrowed.\n", user.getName(), item.getTitle());
    }

    @Override
    public void onItemReturned(T item) {
        System.out.printf("Message to %s: Item %s was returned.\n", user.getName(), item.getTitle());
    }

    @Override
    public void onItemReserved(T item) {
        System.out.printf("Message to %s: Item %s was reserved.\n", user.getName(), item.getTitle());
    }
}
