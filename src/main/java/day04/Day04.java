package day04;

import java.util.ArrayList;

public class Day04 {
    public static int startingValue = 278384;
    public static int finalValue = 824795;
    public static boolean puzzleA = false;
    public static boolean puzzleB = false;
//    int[] range = new int[];

//    It is a six-digit number.
//    The value is within the range given in your puzzle input.
//    Two adjacent digits are the same (like 22 in 122345).
//    Going from left to right, the digits never decrease; they only ever increase or stay the same (like 111123 or 135679).

    public static boolean validPasswordA(int[] input) {
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
    public static boolean validPasswordB(int[] input) {
        int[] passwordValues = input;
        boolean isValid = false;
        if((passwordValues[0]==passwordValues[1] && passwordValues[1] != passwordValues[2]) ||
                (passwordValues[0] != passwordValues[1] && passwordValues[1]==passwordValues[2] && passwordValues[2] != passwordValues[3]) ||
                (passwordValues[1] != passwordValues[2] && passwordValues[2]==passwordValues[3]  && passwordValues[3] != passwordValues[4]) ||
                (passwordValues[2] != passwordValues[3] && passwordValues[3]==passwordValues[4]  && passwordValues[4] != passwordValues[5]) ||
                (passwordValues[3] != passwordValues[4] && passwordValues[4]==passwordValues[5]) ) {
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

    public static ArrayList<Integer> getListOfValidPasswords() {
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

            boolean isPasswordValid = false;
            if(puzzleA) {
                isPasswordValid = validPasswordA(passwordAsInt);
            } else if (puzzleB) {
                    isPasswordValid = validPasswordB(passwordAsInt);
            }
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
        puzzleA = true;
        int solution = countNumberOfValidPasswords(getListOfValidPasswords());
        puzzleA = false;
        return solution;
    }
    public static int puzzleB () {
        puzzleB = true;
        int solution = countNumberOfValidPasswords(getListOfValidPasswords());
        puzzleB = false;
        return solution;
    }

}
