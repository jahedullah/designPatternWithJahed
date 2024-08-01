package org.example.strategy;

/**
 * The main goal of this pattern is to reduce the code duplication in the child level.
 * For example, you have  a class called Vehicle and have a default method drive.
 * You want to extend this capability to other different vehicle types and you observe that
 * in few of the child there are using same driving strategy and right there the code
 * duplication works. As the system will grow you have to carry out the code duplication in
 * incrementing manner. To reduce this we can use the strategy pattern, were we will use a
 * constructor in the vehicle class and we will use different driving strategy implementation
 * and whenever a child of vehicle class will be created we will tell them to invoke the
 * constructor with the parameter of the driving strategy object they want as per their
 * requirement.
 */
public class StrategyMain {
  public static void main(String[] args) {
    Vehicle sportyVehicle = new SportyVehicle();
    Vehicle offRoadVehicle = new OffRoadVehicle();

    sportyVehicle.drive();
    offRoadVehicle.drive();
  }
}
