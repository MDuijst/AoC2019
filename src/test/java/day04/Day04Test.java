package day04;

import org.junit.jupiter.api.Test;

import static day04.Day04.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day04Test {

    @Test
    void testExampleOne() {
        String password = "122345";
        int[] input = new int[] {1,2,2,3,4,5};
//        System.out.println("password "+ password + " is valid is " + validPasswordA(input));
        assertTrue(validPasswordA(input));
//        assertEquals(2,//);
    }
    @Test
    void testExampleTwo() {
        String password = "111123";
        int[] input = new int[] {1,1,1,1,2,3};
//        System.out.println("password "+ password + " is valid is " + validPasswordA(input));
        assertTrue(validPasswordA(input));
//        assertEquals(2,//);
    }
    @Test
    void testExampleThree() {
        String password = "111111";
        int[] input = new int[] {1,1,1,1,1,1};
//        System.out.println("password "+ password + " is valid is " + validPasswordA(input));
        assertTrue(validPasswordA(input));
//        assertEquals(2,//);
    }
    @Test
    void testExampleFour() {
        String password = "223450";
        int[] input = new int[] {2,2,3,4,5,0};
//        System.out.println("password "+ password + " is valid is " + validPasswordA(input));
//        assertEquals(2,//);
        assertFalse(validPasswordA(input));
    }
    @Test
    void testExampleFive() {
        String password = "123789";
        int[] input = new int[] {1,2,3,7,8,9};
//        System.out.println("password "+ password + " is valid is " + validPasswordA(input));
//        assertEquals(2,//);
        assertFalse(validPasswordA(input));
    }

    @Test
    void testExampleSix() {
        String password = "123444";
        int[] input = new int[] {1,2,3,4,4,4};
//        System.out.println("password "+ password + " is valid is " + validPasswordA(input));
//        assertEquals(2,//);
        assertFalse(validPasswordB(input));
    }
    @Test
    void testExampleSeven() {
        String password = "111122";
        int[] input = new int[] {1,1,1,1,2,2};
//        System.out.println("password "+ password + " is valid is " + validPasswordA(input));
//        assertEquals(2,//);
        assertTrue(validPasswordB(input));
    }

    @Test
    void puzzle() {
        //String input="";
        System.out.println("Day01(a): " + puzzleA());
        System.out.println("Day01(b): " + puzzleB());
    }


}
