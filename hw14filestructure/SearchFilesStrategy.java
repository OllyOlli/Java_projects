package hw14filestructure;
//
// Třída pro strategii vyhledávání souborů v adresářové struktuře
public class SearchFilesStrategy implements DirectoryStrategy {
    private String fileName;

    public SearchFilesStrategy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute(DirectoryComponent component) {
        if (component instanceof File) {
            if (((File) component).getName().equals(fileName)) {
                System.out.println("File found: " + fileName);
                return;
            }
        } else if (component instanceof Directory) {
            for (DirectoryComponent comp : ((Directory) component).getComponents()) {
                execute(comp);
            }
        }
    }
}
