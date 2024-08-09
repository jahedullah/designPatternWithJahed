package org.example.patterns.factory;

public class LuxuryVehicle implements VehicleFactoryType {
  public Vehicle getVehicle(VehicleName vehicleName) {
    switch (vehicleName) {
      case BMW:
        return new BMW();
      case MERCEDES:
        return new Mercedes();
    }
    return null;
  }
}
