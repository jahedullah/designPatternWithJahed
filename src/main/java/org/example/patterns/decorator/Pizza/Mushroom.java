package org.example.patterns.decorator.Pizza;

public class Mushroom extends ToppingDecorator {
  private BasePizza basePizza;

  public Mushroom(BasePizza basePizza) {
    this.basePizza = basePizza;
  }

  @Override
  int getPrice() {
    return basePizza.getPrice() + 5;
  }
}
