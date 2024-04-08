package cz.robodreams.javadeveloper.project;

public interface UserChannel<T extends Item> {
    void onItemBorrowed(T item);

    void onItemReturned(T item);

    void onItemReserved(T item);
}
