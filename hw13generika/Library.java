
///
import java.util.ArrayList;
import java.util.List;

public class Library<T> {

    private List<T> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item.toString());
        }
    }
}