package org.bhi.q3;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestCoinToss {

    public static void main(String[] args) {

        Coin c1 = new Coin();
        Coin c2 = new Coin();

        final int NUMBER_OF_TOSSES = 100;
        int heads = 0;
        int tails = 0;
        int odds = 0;
        //always us constants? number of tosses
        for (int i = 0; i < NUMBER_OF_TOSSES; i++) {

            c1.tossCoin();
            c2.tossCoin();

            if (c1.getShowface() == 'H' && c2.getShowface() == 'H') {
                heads++;
            } else if (c1.getShowface() == 'T' && c2.getShowface() == 'T') {
                tails++;
            } else {
                odds++;
            }
        }
        System.out.println("The Number of Heads: " + heads);
        System.out.println("The Number of Tails: " + tails);
        System.out.println("The Number of Odds:  " + odds);

    }

}
