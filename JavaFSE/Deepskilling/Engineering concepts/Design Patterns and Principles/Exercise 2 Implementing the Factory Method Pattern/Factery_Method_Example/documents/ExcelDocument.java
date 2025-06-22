package Factery_Method_Example.documents;

public class ExcelDocument implements Document {
    private String name;

    public ExcelDocument(String name) {
        this.name = name;
        System.out.println("Creating Excel Document: " + name);
    }

    @Override
    public void open() {
        System.out.println("Opening Excel Document: " + name);
    }

    @Override
    public void save() {
        System.out.println("Saving Excel Document: " + name);
    }

    @Override
    public void close() {
        System.out.println("Closing Excel Document: " + name);
    }
}
