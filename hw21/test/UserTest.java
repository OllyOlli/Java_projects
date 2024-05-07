package project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserTest {
    private User<Item> user;
    private Item item;

    @BeforeEach
    void setUp() {
        user = new User.Builder<>("Test User").build();
        item = mock(Item.class);
    }

    @Test
    void testBorrowItem() {
        when(item.isAvailable()).thenReturn(true);
        assertTrue(user.borrowItem(item));
        assertTrue(user.getBorrowedItems().contains(item));
    }

    @Test
    void testReturnItem() {
        user.getBorrowedItems().add(item);
        assertTrue(user.returnOrUnreservedItem(item));
        assertFalse(user.getBorrowedItems().contains(item));
    }

    @Test
    void testReserveItem() {
        when(item.isAvailable()).thenReturn(true);
        assertTrue(user.reserveItem(item));
        assertTrue(user.getReservedItems().contains(item));
    }
}
