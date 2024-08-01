package org.example.strategy;

public class SportyVehicle extends Vehicle {
  public SportyVehicle() {
    super(new SpecialDrivingStrategy());
  }
}
