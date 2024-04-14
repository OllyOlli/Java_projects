package cz.robodreams.javadeveloper.homeworks.hw21junits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    private Item item;

    @BeforeEach
    public void setUp() {
        item = new Item("Test Item");
    }

    @Test
    public void testConstructor() {
        assertNotNull(item);
        assertEquals("Test Item", item.getTitle());
        assertTrue(item.isAvailable());
    }

    @Test
    public void testBorrowItem() throws ItemUnavailableException {
        item.borrowItem();
        assertFalse(item.isAvailable());
    }

    @Test
    public void testReturnItem() {
        item.returnItem();
        assertTrue(item.isAvailable());
    }

    @Test
    public void testBorrowUnavailableItem() {
        try {
            item.borrowItem();
            item.borrowItem(); // Should throw exception
            fail("Expected ItemUnavailableException was not thrown.");
        } catch (ItemUnavailableException e) {
            assertEquals("Item Test Item is not available.", e.getMessage());
        }
    }
}
