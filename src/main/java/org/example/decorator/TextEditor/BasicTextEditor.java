package org.example.decorator.TextEditor;

public class BasicTextEditor implements TextEditor {
  private String basicText;

  public BasicTextEditor(String basicText) {
    this.basicText = basicText;
  }

  @Override
  public String getText() {
    return basicText;
  }
}
