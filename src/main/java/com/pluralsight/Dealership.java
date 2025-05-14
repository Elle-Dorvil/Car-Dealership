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

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        ArrayList<Vehicle> matches = new ArrayList<>();
        for (Vehicle v : vehicles)
            if (v.getPrice() >= min && v.getPrice() <= max) {
                matches.add(v);
            }
        return matches;
    }



    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        ArrayList<Vehicle> matches = new ArrayList<>();
        for (Vehicle v : vehicles)
            if (v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
                matches.add(v);
            }
        return matches;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        ArrayList<Vehicle> matches = new ArrayList<>();
        for (Vehicle v : vehicles)
            if (v.getYear() >= min && v.getYear() <= max) {
                matches.add(v);
            }
        return matches;

    }

   public ArrayList<Vehicle> getVehiclesByColor(String color){
        ArrayList<Vehicle> matches = new ArrayList<>();
        for (Vehicle v : vehicles)
            if (v.getColor().equalsIgnoreCase(color)) {
                matches.add(v);
            }
        return matches;

    }
   public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        ArrayList<Vehicle> matches = new ArrayList<>();
        for (Vehicle v : vehicles)
            if (v.getOdometer() >= min && v.getOdometer() <= max) {
                matches.add(v);
            }
        return matches;

    }
   public ArrayList<Vehicle> getVehiclesByType(String type){
        ArrayList<Vehicle> matches = new ArrayList<>();
        for (Vehicle v : vehicles)
            if (v.getVehicleType().equalsIgnoreCase(type)) {
                matches.add(v);
            }
        return matches;
    }
    public ArrayList<Vehicle> getAllVehiclesRequest() {
        return vehicles;
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}
