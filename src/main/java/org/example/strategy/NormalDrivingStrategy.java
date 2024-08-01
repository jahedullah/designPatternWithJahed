package org.example.strategy;

public class NormalDrivingStrategy implements DrivingStrategy{
  @Override
  public void drive() {
    System.out.println("I have normal driving strategy.");
  }
}
