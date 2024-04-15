package cz.robodreams.javadeveloper.project;

import cz.robodreams.javadeveloper.project.exceptions.ItemAlreadyBorrowedException;
import cz.robodreams.javadeveloper.project.exceptions.UserNotFoundException;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
public abstract class Item {

    private long id;
    private boolean isAvailable = true;
    private LocalDateTime borrowedFrom = null;
    private LocalDateTime borrowedTo = null;
    private User<Item> user = null;

    protected Item() {
    }

    public abstract String getTitle();

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowToUser(User<Item> user) throws UserNotFoundException, ItemAlreadyBorrowedException {
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        if (!this.isAvailable) {
            throw new ItemAlreadyBorrowedException("Item is already borrowed");
        }

        this.isAvailable = false;
        this.borrowedFrom = LocalDateTime.now();
        this.borrowedTo = this.borrowedFrom.plusMonths(1);
        this.user = user;
    }

    public void returnToLibrary() {
        this.isAvailable = true;
        this.borrowedFrom = null;
        this.borrowedTo = null;
        this.user = null;
    }

    public void reserveToUser(User<Item> user) throws UserNotFoundException, ItemAlreadyBorrowedException {
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        if (!this.isAvailable) {
            throw new ItemAlreadyBorrowedException("Item is already borrowed");
        }
        this.isAvailable = false;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Item{" +
                "isAvailable=" + isAvailable +
                ", borrowedFrom=" + borrowedFrom +
                ", borrowedTo=" + borrowedTo +
                ", user=" + user +
                '}';
    }
}
