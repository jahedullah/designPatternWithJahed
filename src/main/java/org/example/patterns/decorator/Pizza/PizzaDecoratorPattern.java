package org.example.patterns.decorator.Pizza;

/**
 * The motivation of this pattern is that you do not end up with too many classes having a lot of combinations in your
 * system. Which will make it really difficult to make your code very difficult to maintain later on. You just now
 * wrap up the functionality that you need.
 */
public class PizzaDecoratorPattern {
  public static void main(String[] args) {
    BasePizza pizza1 = new ChickenDominatorPizza();
    Mushroom mushroom = new Mushroom(pizza1);

    System.out.println("Price of the pizza1 is " + mushroom.getPrice());
  }
}
