package cz.robodreams.javadeveloper.homeworks.hw21junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ItemTest {

    @Test
    public void testGetTitle() {
        // Arrange
        String title = "Test Title";
        Item item = new Item(title);

        // Act
        String retrievedTitle = item.getTitle();

        // Assert
        assertEquals(title, retrievedTitle);
    }
}
