package org.example.patterns.prototype;

public interface Document extends Cloneable{
    Document clone() throws CloneNotSupportedException;
    void printContent();
}
