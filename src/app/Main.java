package app;

import company.Company;
import trains.Freight;
import trains.IC;
import trains.Passenger;
import trains.Train;

public class Main {
    public static void main(String[] args){
        Company company = new Company();
        Train train = new Passenger();
        Train train2 = new IC();
        Train train3 = new Freight();
        company.addTrain(train);
        company.addTrain(train3);
        company.addTrain(train2);
        System.out.println(train);
        System.out.println(train2);
        System.out.println(train3);
        System.out.println(company.calculateProfit());
    }
}
