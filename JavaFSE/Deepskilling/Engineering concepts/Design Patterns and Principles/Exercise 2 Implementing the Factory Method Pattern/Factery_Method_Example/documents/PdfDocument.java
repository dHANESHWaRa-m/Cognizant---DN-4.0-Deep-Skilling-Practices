package Factery_Method_Example.documents;

public class PdfDocument implements Document {
    private String name;

    public PdfDocument(String name) {
        this.name = name;
        System.out.println("Creating PDF Document: " + name);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + name);
    }

    @Override
    public void save() {
        System.out.println("Saving PDF Document: " + name);
    }

    @Override
    public void close() {
        System.out.println("Closing PDF Document: " + name);
    }
}
