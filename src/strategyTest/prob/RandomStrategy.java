package strategyTest.prob;

import java.util.Random;

public class RandomStrategy implements Strategy {
    private Random random;
    private int handvalue = 0;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nexthand() {
        handvalue = random.nextInt(2);
        return Hand.getHand(handvalue);
    }

    @Override
    public void study(boolean win) {
    }


}
