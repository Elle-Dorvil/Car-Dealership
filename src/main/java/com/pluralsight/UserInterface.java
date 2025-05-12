package com.pluralsight;

public class UserInterface {
    public void display() {
        private void innit () {

        }

    }
    public void processGetByPrice() {

    }
    public void processGetByMakeModel() {

    }
    public void processGetByYear() {

    }
    public void processGetByColor() {

    }
    public void processGetByMileage() {

    }
    public void processGetByType () {

    }
    public void processAddVehicle() {



        Vehicle addVehicle = new Vehicle(vin, year, make, model, vehicleType, color,odometer, price);
        dealership.addVehicle(newVehicle);

        System.out.println("Vehicle successfully added");

        DealershipFileManager fileManager = new DealershipFileManager();
        fileManager.saveDealership(dealership);

    }
    public void processRemoveVehicle() {

    }
}
