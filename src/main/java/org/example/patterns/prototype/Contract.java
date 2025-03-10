package org.example.patterns.prototype;


public class Contract implements Document {
    private String clientName;
    private String terms;

    public Contract(String clientName, String terms) {
        this.clientName = clientName;
        this.terms = terms;
    }

    @Override
    public Document clone() throws CloneNotSupportedException{
        Object o = super.clone();
        return (Document) o;
    }

    @Override
    public void printContent() {
        System.out.println("Contract with " + clientName + " - Terms: " + terms);
    }
}
