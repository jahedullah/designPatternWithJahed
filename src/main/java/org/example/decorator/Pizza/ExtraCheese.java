package org.example.decorator.Pizza;

public class ExtraCheese extends ToppingDecorator {
  private BasePizza basePizza;

  public ExtraCheese(BasePizza basePizza) {
    this.basePizza = basePizza;
  }

  @Override
  int getPrice() {
    return this.basePizza.getPrice() + 10;
  }
}
