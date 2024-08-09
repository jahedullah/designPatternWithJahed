package org.example.patterns.strategy;

public class NormalDrivingStrategy implements DrivingStrategy{
  @Override
  public void drive() {
    System.out.println("I have normal driving strategy.");
  }
}
