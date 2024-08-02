package org.example.factory;

public class AbstractFactoryPattern {
  public static void main(String[] args) {
    Factory factory = new Factory();
    VehicleFactoryType vehicleFactoryType = factory.getFactory(VehicleFacotryName.LUXURY);
    Vehicle vehicle = vehicleFactoryType.getVehicle(VehicleName.BMW);
    System.out.println(vehicle.getVehicleName());
  }
}
