package org.example.patterns.prototype;


public class PrototypeDocumentDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
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

        compareDifferentCloningStrategies();
    }

    private static void compareDifferentCloningStrategies() throws CloneNotSupportedException {
        int iterations = 1_000_00000;

        Contract c = new Contract("test", "test");
        // Using new
        long startNew = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            c = new Contract("test", "test");  // Constructor call
        }
        long endNew = System.nanoTime();
        System.out.println("Time using new: " + (endNew - startNew) / 1_000_000 + " ms");

        // Using new
        startNew = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            c.bitWiseClone();  // super.clone()
        }
        endNew = System.nanoTime();
        System.out.println("Time using super.clone(): " + (endNew - startNew) / 1_000_000 + " ms");
    }
}
