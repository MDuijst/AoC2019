package day00;

public class AoC2015Day01 {

    final static int STARTINGFLOOR = 0;
    int currentFloor = STARTINGFLOOR;
    int position = 0;

    public static int getFloor(String in) {
        String input = in;
        AoC2015Day01 day01 = new AoC2015Day01();
        char[] inputArray = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            char value = inputArray[i];
            if (value == '(') {
                day01.currentFloor++;
            } else if (value == ')') {
                day01.currentFloor--;
            }
        }
        return day01.currentFloor;
    }

    public static int getPosition(String in) {
        String input = in;
        AoC2015Day01 day01 = new AoC2015Day01();
        char[] inputArray = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            char value = inputArray[i];
            if (value == '(') {
                day01.currentFloor++;
            } else if (value == ')') {
                day01.currentFloor--;
            }

            if (day01.currentFloor == -1) {
                day01.position = i+1;
                return day01.position;
            }
        }
        return -1;


    }
}
