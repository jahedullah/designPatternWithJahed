package org.example.patterns.strategy;

public class Vehicle {
  private final DrivingStrategy drivingStrategy;

  public Vehicle(DrivingStrategy drivingStrategy) {
    this.drivingStrategy = drivingStrategy;
  }

  public void drive() {
    drivingStrategy.drive();
  }
}
