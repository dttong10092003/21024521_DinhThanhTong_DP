package dp_composite;

public class File implements FileSystemComponent {
    private String name;
    private int size; 

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + " (" + size + " KB)");
    }
}

