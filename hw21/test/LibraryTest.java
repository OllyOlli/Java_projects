package project;

import static org.junit.jupiter.api.Assertions.*;

import cz.robodreams.javadeveloper.project.exceptions.ItemAlreadyBorrowedException;
import cz.robodreams.javadeveloper.project.exceptions.ItemDoesNotExistException;
import cz.robodreams.javadeveloper.project.exceptions.UserNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.mockito.Mockito.*;

class LibraryTest {
    private Library<Item> library;
    private User<Item> user;
    private Item item;
    private UserChannel<Item> channel;

    @BeforeEach
    void setUp() {
        user = mock(User.class);
        item = mock(Item.class);
        channel = mock(UserChannel.class);
        library = new Library<>("Test Library", Collections.singletonList(item), Collections.singletonList(user));
    }


    @Test
    void testAddUserChannel() {
        library.addUserChannel(item, channel);
        assertTrue(library.getObservers().get(item).contains(channel));
    }

    @Test
    void testRemoveUserChannel() {
        library.addUserChannel(item, channel);
        library.removeUserChannel(item, channel);
        assertFalse(library.getObservers().get(item).contains(channel));
    }

    @Test
    void testAddItem() {
        Item newItem = mock(Item.class);
        library.addItem(newItem);
        assertTrue(library.getAllItems().contains(newItem));
        assertTrue(library.getAvailableItems().contains(newItem));
    }

    @Test
    void testBorrowItem() throws UserNotFoundException, ItemDoesNotExistException, ItemAlreadyBorrowedException {
        when(item.isAvailable()).thenReturn(true);
        when(user.borrowItem(item)).thenReturn(true);
        library.borrowItem(item, user);
        verify(user, times(1)).borrowItem(item);
        assertFalse(library.getAvailableItems().contains(item));
    }

    @Test
    void testReserveItem() {
        when(item.isAvailable()).thenReturn(true);
        when(user.reserveItem(item)).thenReturn(true);
        library.reserveItem(item, user);
        verify(user, times(1)).reserveItem(item);
        assertFalse(library.getAvailableItems().contains(item));
    }
}
