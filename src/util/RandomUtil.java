package util;

import java.util.Random;

public class RandomUtil {
    private final int MIN_PASSENGERS = 115;
    private final int MAX_PASSENGERS = 250;

    Random random = new Random();

    public boolean chanceCalculator(int chance){
        return random.nextInt(101) <= chance;
    }

    public int estimatePassengers(){
        return random.nextInt(MAX_PASSENGERS - MIN_PASSENGERS) + 115;
    }
}
