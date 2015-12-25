package org.bhi.q3;

import java.util.Random;

/**
 *
 * @author carlo nino mabalatan
 */
public class Coin {

    private char coinface;
    private int valueofface;

    public Coin() {

    }

    public void tossCoin() {
        // create random number 1 for heads
        // 0 for tails
        Random rand = new Random();

        // Get a random value, 0 or 1.
        int number = rand.nextInt(2);

        if (number == 0) {
            this.coinface = 'H';
        } else {
            this.coinface = 'T';
        }

    }

    public char getShowface() {
        return coinface;
    }
}
