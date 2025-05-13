package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private void innit () {
        DealershipFileManager fileManager = new DealershipFileManager();
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
                case "7": processAddVehicle();
                break;
                case "8": processRemoveVehicle();
                break;
                case "99": loadOptions = false;

                default:
                    System.out.println("Invalid Choice, Please select another option. ");
                    return;
            }
        }
        scanner.close();

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

    }
    public void processRemoveVehicle() {

    }
}
