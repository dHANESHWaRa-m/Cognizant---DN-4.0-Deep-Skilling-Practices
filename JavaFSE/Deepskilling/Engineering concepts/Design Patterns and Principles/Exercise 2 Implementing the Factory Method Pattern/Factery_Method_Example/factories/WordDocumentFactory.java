package Factery_Method_Example.factories;

import Factery_Method_Example.documents.Document;
import Factery_Method_Example.documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument(String name) {
        return new WordDocument(name);
    }
}