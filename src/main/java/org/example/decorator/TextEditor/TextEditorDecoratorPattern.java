package org.example.decorator.TextEditor;

public class TextEditorDecoratorPattern {
  public static void main(String[] args) {

    TextEditor textEditor = new BasicTextEditor("My text that should be decorated.");
    BoldTextDecorator boldTextDecorator = new BoldTextDecorator(textEditor);

    System.out.println(boldTextDecorator.decorate());

    ItalicTextEditor italicTextEditor = new ItalicTextEditor(textEditor);
    System.out.println(italicTextEditor.decorate());
  }
}
