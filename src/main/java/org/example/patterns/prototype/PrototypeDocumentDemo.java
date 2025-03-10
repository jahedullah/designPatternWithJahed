package org.example.patterns.prototype;

import java.util.Objects;

public class PrototypeDocumentDemo {
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();
        documentManager.addTemplate(DocType.CONTRACT, new Contract("Acme Corp", "Standard Terms"));
        documentManager.addTemplate(DocType.RESUME, new Resume("John Doe", "Java, Spring Boot"));

        Document contractClone = documentManager.createDocument(DocType.CONTRACT);
        Document contractClone1 = documentManager.createDocument(DocType.CONTRACT);

        Document resumeClone = documentManager.createDocument(DocType.RESUME);
        Document resumeClone1 = documentManager.createDocument(DocType.RESUME);


        contractClone.printContent();
        contractClone1.printContent();

        resumeClone.printContent();
        resumeClone1.printContent();
    }
}
