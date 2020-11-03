package trains;

import util.RandomUtil;

public class Freight extends Train {
    public final int CHANCE_TO_GO_ABROAD = 35;
    private final int MONTHLY_COST = 1000;
    private boolean isGoingAbroad;
    private int revenue;

    public int getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return "Freight{" +
                "MONTHLY_COST=" + MONTHLY_COST +
                ", isGoingAbroad=" + isGoingAbroad +
                ", revenue=" + revenue +
                ", id=" + id +
                ", cost=" + cost +
                '}';
    }

    public Freight() {
        cost = MONTHLY_COST;
    }

    public void isAbroad(){
        RandomUtil random = new RandomUtil();
        isGoingAbroad = random.chanceCalculator(CHANCE_TO_GO_ABROAD);
    }

    public void calculateRevenue(){
        isAbroad();
        if (isGoingAbroad){
            revenue = 550 + 110;
        }
        else{
            revenue = 550;
        }
    }
}
