package cz.robodreams.javadeveloper.homeworks.hw14filestructure;
//
// Třída pro strategii odstranění souboru v adresářové struktuře
public class DeleteFileStrategy implements DirectoryStrategy {
    private String fileName;

    public DeleteFileStrategy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute(DirectoryComponent component) {
        if (component instanceof Directory) {
            for (DirectoryComponent comp : ((Directory) component).getComponents()) {
                if (comp instanceof File && ((File) comp).getName().equals(fileName)) {
                    ((Directory) component).getComponents().remove(comp);
                    System.out.println("File deleted: " + fileName);
                    return;
                }
            }
            System.out.println("File not found.");
        }
    }
}