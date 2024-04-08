package cz.robodreams.javadeveloper.project;

import cz.robodreams.javadeveloper.project.exceptions.ItemAlreadyBorrowedException;
import cz.robodreams.javadeveloper.project.exceptions.UserNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    private Item item;
    private User<Item> user;

    public static class TestItem extends Item {}

    @BeforeEach
    public void setUp() {
        item = new TestItem();
        user = new User.Builder<>("User name").build();
    }
    @Test
    void testBorrowToUser() throws Exception {
        assertTrue(item.isAvailable());
        assertNull(item.getUser());

        item.borrowToUser(user);

        assertFalse(item.isAvailable());
        assertNotNull(item.getBorrowedFrom());
        assertNotNull(item.getBorrowedTo());
        assertEquals(user, item.getUser());
    }

    @Test
    void testReturnToLibrary() throws Exception {
        item.borrowToUser(user);
        item.returnToLibrary();

        assertTrue(item.isAvailable());
        assertNull(item.getBorrowedFrom());
        assertNull(item.getBorrowedTo());
        assertNull(item.getUser());
    }

    @Test
    void testReserveToUser() throws Exception {
        assertTrue(item.isAvailable());
        assertNull(item.getUser());

        item.reserveToUser(user);

        assertFalse(item.isAvailable());
        assertEquals(user, item.getUser());
    }

    @Test
    void testBorrowToUserWhenItemIsNotAvailable() throws Exception {
        item.borrowToUser(user);

        assertThrows(ItemAlreadyBorrowedException.class, () -> item.borrowToUser(user));
    }

    @Test
    void testReserveToUserWhenItemIsNotAvailable() throws Exception {
        item.reserveToUser(user);
        assertFalse(item.isAvailable());

        assertThrows(ItemAlreadyBorrowedException.class, () -> item.reserveToUser(user));
    }

    @Test
    void testBorrowToUserWhenUserIsNull() {
        assertThrows(UserNotFoundException.class, () -> item.borrowToUser(null));
    }

    @Test
    void testReserveToUserWhenUserIsNull() {
        assertThrows(UserNotFoundException.class, () -> item.reserveToUser(null));
    }
}