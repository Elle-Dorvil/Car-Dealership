package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    ArrayList<Vehicle> vehicles;

    ArrayList<Vehicle> getAllVehicles() {
        return vehicles;
    }

    public Dealership(String name, String address, String phone, ArrayList<Vehicle> vehicles) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        return null;

    }

   public ArrayList<Vehicle> getVehiclesByColor(String color){
        return null;

    }
   public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        return null;

    }
   public ArrayList<Vehicle> getVehiclesByType(String type){
        return null;

    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}
