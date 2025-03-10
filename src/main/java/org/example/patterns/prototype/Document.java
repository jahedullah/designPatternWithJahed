package org.example.patterns.prototype;

public interface Document extends Cloneable{
    Document bitWiseClone() throws CloneNotSupportedException;
    Document newClone();
    void printContent();
}
