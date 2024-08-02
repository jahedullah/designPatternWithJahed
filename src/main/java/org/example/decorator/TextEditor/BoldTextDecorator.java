package org.example.decorator.TextEditor;

public class BoldTextDecorator implements TextDecorator {
  private TextEditor textEditor;

  public BoldTextDecorator(TextEditor textEditor) {
    this.textEditor = textEditor;
  }

  @Override
  public String decorate() {
    return "<b>" + textEditor.getText() + "</b>";
  }
}
