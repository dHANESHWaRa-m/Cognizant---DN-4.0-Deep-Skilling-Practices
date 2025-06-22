package Factery_Method_Example.factories;

import Factery_Method_Example.documents.Document;
import Factery_Method_Example.documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument(String name) {
        return new PdfDocument(name);
    }
}