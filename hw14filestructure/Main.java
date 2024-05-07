package hw14filestructure;
//
// Třída pro demonstraci použití
public class Main {
    public static void main(String[] args) {
        // Vytvoření adresářové struktury
        Directory root = new Directory("Root");
        Directory documents = new Directory("Documents");
        Directory pictures = new Directory("Pictures");
        File resume = new File("Resume.txt", "...");
        File photo1 = new File("Photo1.jpg", "...");
        File photo2 = new File("Photo2.jpg", "...");

        root.addComponent(documents);
        root.addComponent(pictures);
        documents.addComponent(resume);
        pictures.addComponent(photo1);
        pictures.addComponent(photo2);

        // Vytvoření strategií
        DirectoryStrategy listStrategy = new ListFilesStrategy();
        DirectoryStrategy searchStrategy = new SearchFilesStrategy("Photo1.jpg");
        DirectoryStrategy deleteStrategy = new DeleteFileStrategy("Resume.txt");

        // Provedení strategií
        listStrategy.execute(root);
        searchStrategy.execute(root);
        deleteStrategy.execute(root);
        listStrategy.execute(root);
    }
}
