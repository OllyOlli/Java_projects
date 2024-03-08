package cz.robodreams.javadeveloper.homeworks.hw14filestructure;
//
// Třída reprezentující soubor v adresářové struktuře
public class File implements DirectoryComponent {
    private String name;
    private String data;

    public File(String name, String data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public String getName() {
        return name;
    }

    public String readData() {
        return data;
    }

    public void writeData(String data) {
        this.data = data;
    }
}