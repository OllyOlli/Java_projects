package hw14filestructure;

import java.util.ArrayList;
import java.util.List;

//
// Třída reprezentující adresář v adresářové struktuře
public class Directory implements DirectoryComponent {
    private String name;
    private List<DirectoryComponent> components;

    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(DirectoryComponent component) {
        components.add(component);
    }

    public List<DirectoryComponent> getComponents() {
        return components;
    }

    @Override
    public String getName() {
        return name;
    }
}
