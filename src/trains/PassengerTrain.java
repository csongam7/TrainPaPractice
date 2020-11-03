package trains;

import util.RandomUtil;

public abstract class PassengerTrain extends Train {
    protected double ticketCost;
    protected int passengerNumber;

    public boolean isPunishment() {
        return punishment;
    }

    protected boolean punishment;

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(){
        RandomUtil random = new RandomUtil();
        this.passengerNumber = random.estimatePassengers();
    }

    public void setPunishedPassengers(int CHANCE_OF_PUNISHMENT) {
        RandomUtil random = new RandomUtil();
        punishment = random.chanceCalculator(CHANCE_OF_PUNISHMENT);

    //public PassengerTrain() {
    //}
}
}
