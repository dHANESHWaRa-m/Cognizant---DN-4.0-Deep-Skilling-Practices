package Factery_Method_Example;

import Factery_Method_Example.documents.Document;
import Factery_Method_Example.factories.DocumentFactory;
import Factery_Method_Example.factories.ExcelDocumentFactory;
import Factery_Method_Example.factories.PdfDocumentFactory;
import Factery_Method_Example.factories.WordDocumentFactory;

public class test {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Factory Method Pattern ---");

        // Create a Word Document using its factory
        System.out.println("\nCreating Word Document:");
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document myWordDoc = wordFactory.createDocument("MyProject.docx");
        myWordDoc.open();
        myWordDoc.save();
        myWordDoc.close();

        // Create a PDF Document using its factory
        System.out.println("\nCreating PDF Document:");
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document myPdfDoc = pdfFactory.createDocument("Digital Content.pdf");
        myPdfDoc.open();
        myPdfDoc.save();
        myPdfDoc.close();

        // Create an Excel Document using its factory
        System.out.println("\nCreating Excel Document:");
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document myExcelDoc = excelFactory.createDocument("CollegeMarksheet.xlsx");
        myExcelDoc.open();
        myExcelDoc.save();
        myExcelDoc.close();

        System.out.println("\n--- Using Factory Helper Method ---");
        wordFactory.printDocumentDetails("AnotherProject.docx");
        pdfFactory.printDocumentDetails("UserGuide.pdf");
    }
}