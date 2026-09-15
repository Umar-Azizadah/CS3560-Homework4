package part5Composition;

import java.util.ArrayList;

public class Folder {
    // Instance vars
    private String name;
    private ArrayList<Folder> subFolders;
    private ArrayList<File> files;

    // Constructor
    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void addSubFolder(Folder subFolder) {
        subFolders.add(subFolder);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeSubFolder(Folder subFolder) {
        subFolders.remove(subFolder);
    }

    public void print() {
        print(0);
    }

    public void print(int depth) {
        String indent = "   ".repeat(depth);

        System.out.println(indent + "Folder: " + getName());
        for (File file : files) {
            System.out.println((indent + "   File: " + file.getName()));
        }
        for (Folder subFolder : subFolders) {
            subFolder.print(depth + 1);
        }
    }
}
