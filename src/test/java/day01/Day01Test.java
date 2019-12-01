package day01;

import org.junit.jupiter.api.Test;

import static day01.Day01.*;
import static org.junit.jupiter.api.Assertions.*;

public class Day01Test {

    @Test
    void testExampleOne() {
        int input = 12;
        assertEquals(2,calculateIndividualModule(input));
    }
    @Test
    void testExampleTwo() {
        int input = 12;
        assertEquals(2,calculateIndividualModule(input));
    }
    @Test
    void testExampleThree() {
        int input = 1969;
        assertEquals(654,calculateIndividualModule(input));
    }
    @Test
    void testExampleFour() {
        int input = 100756;
        assertEquals(33583,calculateIndividualModule(input));
    }

    @Test
    void testExampleFive() {
        String input = "100756\n" +
                "1969";
        assertEquals(34237,calculateTotalFuel(input));
    }
    @Test
    void testExampleSix() {
        String input = "100756";
        assertEquals(50346,calculateTotalFuelInclAdditional(input));
    }
    @Test
    void testExampleSeven() {
        String input = "1969";
        assertEquals(966,calculateTotalFuelInclAdditional(input));
    }
    @Test
    void testExampleEight() {
        int input = 2;
        assertEquals(0,calculateIndividualModule(input));
    }
    @Test
    void testExampleNine() {
        String input = "14";
        assertEquals(2,calculateTotalFuelInclAdditional(input));
    }


    @Test
    void puzzle() {
        String input="108546\n" +
                "76196\n" +
                "144412\n" +
                "100530\n" +
                "143908\n" +
                "79763\n" +
                "109927\n" +
                "53656\n" +
                "82633\n" +
                "103781\n" +
                "97202\n" +
                "81600\n" +
                "115278\n" +
                "90095\n" +
                "85533\n" +
                "58230\n" +
                "142490\n" +
                "65176\n" +
                "132915\n" +
                "82319\n" +
                "148743\n" +
                "91444\n" +
                "145760\n" +
                "78002\n" +
                "127484\n" +
                "67225\n" +
                "74721\n" +
                "145620\n" +
                "146254\n" +
                "135544\n" +
                "74198\n" +
                "88015\n" +
                "53595\n" +
                "142036\n" +
                "113928\n" +
                "65217\n" +
                "56126\n" +
                "110117\n" +
                "57729\n" +
                "99052\n" +
                "89262\n" +
                "141540\n" +
                "70472\n" +
                "145271\n" +
                "81548\n" +
                "68065\n" +
                "93431\n" +
                "125210\n" +
                "66454\n" +
                "67709\n" +
                "149409\n" +
                "101787\n" +
                "130111\n" +
                "60569\n" +
                "131869\n" +
                "149702\n" +
                "135564\n" +
                "135094\n" +
                "71358\n" +
                "100169\n" +
                "127644\n" +
                "147741\n" +
                "102918\n" +
                "93503\n" +
                "74752\n" +
                "135883\n" +
                "120158\n" +
                "94570\n" +
                "129517\n" +
                "85602\n" +
                "55921\n" +
                "76746\n" +
                "107055\n" +
                "79320\n" +
                "81991\n" +
                "58982\n" +
                "63009\n" +
                "91360\n" +
                "147253\n" +
                "51139\n" +
                "61871\n" +
                "107140\n" +
                "146767\n" +
                "77441\n" +
                "125533\n" +
                "70317\n" +
                "125271\n" +
                "73189\n" +
                "141359\n" +
                "144549\n" +
                "104812\n" +
                "91315\n" +
                "145163\n" +
                "147202\n" +
                "95111\n" +
                "82628\n" +
                "116839\n" +
                "132358\n" +
                "99704\n" +
                "85305";
        System.out.println("Day01(a): " + calculateTotalFuel(input));
        System.out.println("Day01(b): " + calculateTotalFuelInclAdditional(input));
    }


}
