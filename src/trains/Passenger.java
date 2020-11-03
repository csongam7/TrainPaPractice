package trains;

import util.RandomUtil;

public class Passenger extends PassengerTrain {
    public static final int CHANCE_OF_PUNISHMENT = 8;
    private final int MONTHLY_COST = 1200;
    private final double TICKET_COST = 1.50;

    public double getTICKET_COST() {
        return TICKET_COST;
    }

    public Passenger() {
        cost = MONTHLY_COST;
        ticketCost = TICKET_COST;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "MONTHLY_COST=" + MONTHLY_COST +
                ", TICKET_COST=" + TICKET_COST +
                ", ticketCost=" + ticketCost +
                ", id=" + id +
                ", cost=" + cost +
                '}';
    }

    public int getChanceOfPunishment() {
        return CHANCE_OF_PUNISHMENT;
    }
}
