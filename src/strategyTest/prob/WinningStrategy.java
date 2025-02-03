package strategyTest.prob;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }


    @Override
    public Hand nexthand() {
        if(!won){
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
