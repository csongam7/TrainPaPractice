package trains;

import util.RandomUtil;

public class IC extends PassengerTrain{
    public static final int CHANCE_OF_PUNISHMENT = 10;
    private final int MONTHLY_COST = 1200;
    private final double TICKET_COST = 2.0;

    public int getChanceOfPunishment() {
        return CHANCE_OF_PUNISHMENT;
    }

    @Override
    public String toString() {
        return "IC{" +
                "MONTHLY_COST=" + MONTHLY_COST +
                ", ticketCost=" + ticketCost +
                ", id=" + id +
                ", cost=" + cost +
                '}';
    }

    public IC() {
        cost = MONTHLY_COST;
        ticketCost = TICKET_COST;
    }

    public double getTICKET_COST() {
        return TICKET_COST;
    }

}
