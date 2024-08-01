package org.example.strategy;

public class OffRoadVehicle extends Vehicle {
  public OffRoadVehicle() {
    super(new NormalDrivingStrategy());
  }
}
