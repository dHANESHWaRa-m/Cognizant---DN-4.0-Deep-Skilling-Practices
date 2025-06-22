package Factery_Method_Example.documents;

public class WordDocument implements Document {
    private String name;

    public WordDocument(String name) {
        this.name = name;
        System.out.println("Creating Word Document: " + name);
    }

    @Override
    public void open() {
        System.out.println("Opening Word Document: " + name);
    }

    @Override
    public void save() {
        System.out.println("Saving Word Document: " + name);
    }

    @Override
    public void close() {
        System.out.println("Closing Word Document: " + name);
    }
}
