package org.example.patterns.strategy;

public class OffRoadVehicle extends Vehicle {
  public OffRoadVehicle() {
    super(new NormalDrivingStrategy());
  }
}
