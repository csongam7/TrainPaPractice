package company;

import trains.*;

import java.util.HashSet;
import java.util.Set;

public class Company {
    private double income = 0;
    private double expenditure = 0;
    private Set<Train> trains = new HashSet<>();


    public double calculateProfit(){
        for (int i = 0; i < 730; i++) {
            for (Train train : trains) {
                if (train.getClass().equals(Freight.class)) {
                    ((Freight) train).calculateRevenue();
                    income += ((Freight) train).getRevenue();
                    expenditure += train.getCost()/730;
                } else if (train.getClass().equals(Passenger.class)){
                    ((Passenger) train).setPassengerNumber();
                    ((Passenger) train).setPunishedPassengers(((Passenger) train).getChanceOfPunishment());
                    if (((Passenger) train).isPunishment()){
                        income += ((Passenger) train).getPassengerNumber() * 6.0;
                    }
                    income += ((Passenger) train).getPassengerNumber() * ((Passenger) train).getTICKET_COST();
                    expenditure += train.getCost()/730;
                }
                else if (train.getClass().equals(IC.class)){
                    ((IC) train).setPassengerNumber();
                    ((IC) train).setPunishedPassengers(((IC) train).getChanceOfPunishment());
                    if (((IC) train).isPunishment()){
                        income += ((IC) train).getPassengerNumber() * 6.0;
                    }
                    income += ((IC) train).getPassengerNumber() * ((IC) train).getTICKET_COST();
                    expenditure += train.getCost()/730;
                }

            }
        }
        return income - expenditure;
    }


    public void addTrain(Train train){
        trains.add(train);
    }
}
