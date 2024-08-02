package org.example.factory;

public class ClassicVehicle implements VehicleFactoryType {
  public Vehicle getVehicle(VehicleName vehicleName) {
    switch (vehicleName) {
      case HYUNDAI:
        return new Hyundai();
      case TOYOTA:
        return new Toyota();
    }
    return null;
  }
}
