package hw21junits;

import java.time.LocalDateTime;

public class Reservation {
    private final User user;
    private final Item item;
    private final LocalDateTime reservationTime;

    public Reservation(User user, Item item) {
        this.user = user;
        this.item = item;
        this.reservationTime = LocalDateTime.now();
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }
}
