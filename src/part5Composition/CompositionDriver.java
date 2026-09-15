package part5Composition;

public class CompositionDriver {

    public static void main(String[] args) {

        // Root folder
        Folder phpDemo1 = new Folder("php_demo1");

        // Folders directly inside php_demo1
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        phpDemo1.addSubFolder(sourceFiles);
        phpDemo1.addSubFolder(includePath);
        phpDemo1.addSubFolder(remoteFiles);

        // Folders inside Source Files
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        // Folders inside app
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);

        // Files inside public
        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index = new File("index.html");

        publicFolder.addFile(htaccess);
        publicFolder.addFile(htrouter);
        publicFolder.addFile(index);

        // Print full structure
        System.out.println("Original structure:");
        phpDemo1.print();

        // Delete app
        sourceFiles.removeSubFolder(app);

        System.out.println("\nAfter deleting app:");
        phpDemo1.print();

        // Delete public
        sourceFiles.removeSubFolder(publicFolder);

        System.out.println("\nAfter deleting public:");
        phpDemo1.print();
    }
}