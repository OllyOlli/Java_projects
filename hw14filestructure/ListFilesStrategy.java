package hw14filestructure;
//
// Třída pro strategii výpisu souborů v adresářové struktuře
public class ListFilesStrategy implements DirectoryStrategy {
    @Override
    public void execute(DirectoryComponent component) {
        if (component instanceof File) {
            System.out.println(((File) component).getName());
        } else if (component instanceof Directory) {
            for (DirectoryComponent comp : ((Directory) component).getComponents()) {
                execute(comp);
            }
        }
    }
}
