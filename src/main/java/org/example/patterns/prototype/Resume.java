package org.example.patterns.prototype;

public class Resume implements Document {
    private String clientName;
    private String terms;

    public Resume(String clientName, String terms) {
        this.clientName = clientName;
        this.terms = terms;
    }

    @Override
    public Document bitWiseClone() throws CloneNotSupportedException {
        Object o = super.clone();
        return (Document) o;
    }

    @Override
    public Document newClone() {
        return new Resume(this.clientName, this.terms);
    }

    @Override
    public void printContent() {
        System.out.println("Contract with " + clientName + " - Terms: " + terms);
    }
}
