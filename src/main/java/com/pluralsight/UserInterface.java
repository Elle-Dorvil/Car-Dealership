package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class UserInterface {
  private Dealership dealership;
    private void innit () {
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();
    }
    public void display() {
        innit();

        Scanner scanner = new Scanner(System.in);
        boolean loadOptions = true;
        while(loadOptions){
            System.out.println();
            System.out.println("Welcome to the Car Dealership!");
            System.out.println("Choose an option:");
            System.out.println(" 1) Look up by Price Range: ");
            System.out.println(" 2) Look up by Make Model: ");
            System.out.println(" 3) Look up by Year: ");
            System.out.println(" 4) Look up by Color: ");
            System.out.println(" 5) Look up by Mile Range: ");
            System.out.println(" 6) Look up by Vehicle Type: ");
            System.out.println(" 7) List all Vehicles: ");
            System.out.println(" 8) Add Vehicle: ");
            System.out.println(" 9) Remove Vehicle: ");
            System.out.println(" 99) Quit");
            System.out.print("Your choice: ");

            String input = scanner.nextLine();

            switch(input) {
                case "1": processGetByPrice();
                break;
                case "2": processGetByMakeModel();
                break;
                case "3": processGetByYear();
                break;
                case "4": processGetByColor();
                break;
                case "5": processGetByMileage();
                break;
                case "6": processGetByType();
                break;
                case "7": processGetAllVehicles();
                break;
                case "8": processAddVehicle();
                break;
                case "9": processRemoveVehicle();
                break;
                case "99": loadOptions = false;

                default:
                    System.out.println("Invalid Choice, Please select another option. ");
                    return;
            }
        }
        scanner.close();
    }
    public void displayVehicles(ArrayList<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No results found.");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }
    public void processGetByPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimum price: ");
        double min = scanner.nextDouble();
        System.out.println("Emter maximum price: ");
        double max = scanner.nextDouble();

        ArrayList<Vehicle> priceList = dealership.getVehiclesByPrice(min, max);
        displayVehicles(priceList);
    }
    public void processGetByMakeModel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter make: ");
        String make = scanner.nextLine();

        System.out.println("Enter model: ");
        String model = scanner.nextLine();

        ArrayList<Vehicle> makeModel = dealership.getVehiclesByMakeModel(make, model);
        displayVehicles(makeModel);
    }
    public void processGetByYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimum year: ");
        int min = scanner.nextInt();

        System.out.println("Enter maximum year: ");
        int max = scanner.nextInt();

        ArrayList<Vehicle> year = dealership.getVehiclesByYear(min, max);
        displayVehicles(year);

    }
    public void processGetByColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color: ");
        String color = scanner.nextLine();

        ArrayList<Vehicle> findColor = dealership.getVehiclesByColor(color);
        displayVehicles(findColor);
    }
    public void processGetByMileage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimum mileage: ");
        int min = scanner.nextInt();

        System.out.println("Enter maximum mileage: ");
        int max = scanner.nextInt();

        ArrayList<Vehicle> mileage = dealership.getVehiclesByMileage(min, max);
        displayVehicles(mileage);
    }
    public void processGetByType () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Vehicle type: ");
        String type = scanner.nextLine();

        ArrayList<Vehicle> findType = dealership.getVehiclesByType(type);
        displayVehicles(findType);

    }
    public void processGetAllVehicles() {
        displayVehicles(dealership.getAllVehicles());

    }
    public void processAddVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vin: ");
        int vin = scanner.nextInt();
        System.out.println("Enter year of the Vehicle: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter make of the Vehicle: ");
        String make = scanner.nextLine();
        System.out.println("Enter model of the Vehicle: ");
        String model = scanner.nextLine();
        System.out.println("Enter the type of Vehicle: ");
        String type = scanner.nextLine();
        System.out.println("Enter the color of the Vehicle: ");
        String color = scanner.nextLine();
        System.out.println("Enter the odometer of the Vehicle: ");
        int odometer = scanner.nextInt();
        System.out.println("Enter the price of the Vehicle: ");
        double price = scanner.nextDouble();

        dealership.addVehicle(new Vehicle(vin, year, make, model, type, color, odometer, price));
        new DealershipFileManager().saveDealership(dealership);

        System.out.println("Your Vehicle has been added successfully! ");

    }
    public void processRemoveVehicle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vin number of the vehicle you'd like to remove: ");
        int vin = input.nextInt();

        boolean removed = dealership.removeVehicle(vin);
            if (removed) {
                System.out.println("Your Vehicle has been successfully removed! ");
                new DealershipFileManager().saveDealership(dealership);
            } else {
                System.out.println("No Vehicles found with that VIN. ");
            }




    }
}
