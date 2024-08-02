package org.example.decorator.TextEditor;

public class ItalicTextEditor implements TextDecorator {
  private TextEditor textEditor;

  public ItalicTextEditor(TextEditor textEditor) {
    this.textEditor = textEditor;
  }

  @Override
  public String decorate() {
    return "<i>" + textEditor.getText() + "</i>";
  }
}
