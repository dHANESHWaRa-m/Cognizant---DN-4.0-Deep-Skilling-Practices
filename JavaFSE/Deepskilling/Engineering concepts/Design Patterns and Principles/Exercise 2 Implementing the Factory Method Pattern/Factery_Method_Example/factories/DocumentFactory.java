package Factery_Method_Example.factories;

import Factery_Method_Example.documents.Document;

public abstract class DocumentFactory {

    public abstract Document createDocument(String name);

    public void printDocumentDetails(String name) {
        Document doc = createDocument(name);
        System.out.println("--- Document Details ---");
        doc.open();
        doc.save();
        doc.close();
        System.out.println("------------------------");
    }
}
