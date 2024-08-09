package org.example.patterns.factory;

public class Factory {

  public VehicleFactoryType getFactory(VehicleFacotryName factoryName) {
    switch (factoryName) {
      case LUXURY:
        return new LuxuryVehicle();
      case CLASSIC:
        return new ClassicVehicle();
    }
    return null;
  }
}
