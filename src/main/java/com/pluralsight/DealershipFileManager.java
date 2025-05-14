package com.pluralsight;

import java.io.*;

public class DealershipFileManager {
    public Dealership getDealership() {
        Dealership dealership = null;
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader("dealership.csv"));
            if ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                String name = parts[0];
                String address = parts[1];
                String phone = parts[2];
                dealership = new Dealership(name, address, phone);
            }
            while ((line = br.readLine()) != null) {
                String[] fields = line.split("\\|");
                int vin = Integer.parseInt(fields[0]);
                int year = Integer.parseInt(fields[1]);
                String make = fields[2];
                String model = fields[3];
                String vehicleType = fields[4];
                String color = fields[5];
                int odometer = Integer.parseInt(fields[6]);
                double price = Double.parseDouble(fields[7]);
                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                dealership.addVehicle(vehicle);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("dealership.csv"));
            String header = dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone();
            bw.write(header);
            bw.newLine();

            for (Vehicle v : dealership.getVehicles()) {
                String vehicleLine = v.getVin() + "|" + v.getYear() + "|" + v.getMake() + "|" + v.getModel() + "|" + v.getVehicleType()
                        + "|" + v.getColor() + "|" + v.getOdometer() + "|" + v.getPrice();
                bw.write(vehicleLine);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

