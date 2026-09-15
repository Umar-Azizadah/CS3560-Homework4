package part5Composition;

public class File {

    // Instance variable
    private String name;

    // Constructor
    public File(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Print method
    public void print() {
        System.out.println(name);
    }
}