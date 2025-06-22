package Factery_Method_Example.factories;

import Factery_Method_Example.documents.Document;
import Factery_Method_Example.documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument(String name) {
        return new ExcelDocument(name);
    }
}