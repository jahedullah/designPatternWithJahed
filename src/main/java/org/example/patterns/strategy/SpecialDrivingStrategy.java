package org.example.patterns.strategy;

public class SpecialDrivingStrategy implements DrivingStrategy {
  @Override
  public void drive() {
    System.out.println("I have Special Driving Strategy.");
  }
}
