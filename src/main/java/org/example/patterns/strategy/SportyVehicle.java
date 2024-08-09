package org.example.patterns.strategy;

public class SportyVehicle extends Vehicle {
  public SportyVehicle() {
    super(new SpecialDrivingStrategy());
  }
}
