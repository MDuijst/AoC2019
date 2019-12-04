package day04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Day04 {
    public static int startingValue = 278384;
    public static int finalValue = 824795;
//    int[] range = new int[];

//    It is a six-digit number.
//    The value is within the range given in your puzzle input.
//    Two adjacent digits are the same (like 22 in 122345).
//    Going from left to right, the digits never decrease; they only ever increase or stay the same (like 111123 or 135679).

    public static boolean validPassword(int[] input) {
//        String  password = input;
//        String[] passwordString = password.split("",1);
//        System.out.println("Current array: " + passwordString[0]+", " +passwordString[1]+", " +passwordString[2]+", " +passwordString[3]+", " +passwordString[4]+", " +passwordString[5]);
        //int[] passwordValues = new int[];

        //for(int i=0; i<password.length(); i++) {
        //    passwordValues[i] = password.split();
        //}

        int[] passwordValues = input;
        boolean isValid = false;
        if(passwordValues[0]==passwordValues[1] ||
                passwordValues[1]==passwordValues[2] ||
                passwordValues[2]==passwordValues[3] ||
                passwordValues[3]==passwordValues[4] ||
                passwordValues[4]==passwordValues[5] ) {
            if(passwordValues[0]<=passwordValues[1] &&
                    passwordValues[1]<=passwordValues[2] &&
                    passwordValues[2]<=passwordValues[3] &&
                    passwordValues[3]<=passwordValues[4] &&
                    passwordValues[4]<=passwordValues[5]) {
                isValid = true;
            }
        }
        return isValid;
    }

    public static ArrayList<Integer> getListOfValidPaswords() {
        ArrayList<Integer> range = new ArrayList<Integer>();
        for (int password = startingValue; password <= finalValue; password++) {
            String passwordAsString = String.valueOf(password);
            char[] passwordAsChar = passwordAsString.toCharArray();
            int[] passwordAsInt = new int[6];
            passwordAsInt[0] = Integer.valueOf(Character.toString(passwordAsChar[0]));
            passwordAsInt[1] = Integer.valueOf(Character.toString(passwordAsChar[1]));
            passwordAsInt[2] = Integer.valueOf(Character.toString(passwordAsChar[2]));
            passwordAsInt[3] = Integer.valueOf(Character.toString(passwordAsChar[3]));
            passwordAsInt[4] = Integer.valueOf(Character.toString(passwordAsChar[4]));
            passwordAsInt[5] = Integer.valueOf(Character.toString(passwordAsChar[5]));

            boolean isPasswordValid = validPassword(passwordAsInt);
            if (isPasswordValid) {
                range.add(password);
            }
        }
        return range;
    }

    public static int countNumberOfValidPasswords(ArrayList<Integer> input) {
        ArrayList<Integer> validPasswords = input;
        return validPasswords.size();
    }

    public static int puzzleA () {
        return countNumberOfValidPasswords(getListOfValidPaswords());
    }

}
