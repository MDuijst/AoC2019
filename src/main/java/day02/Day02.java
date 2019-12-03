package day02;


public class Day02 {

    public static int getPositionZero(int[] input) {
        int[] inputArray = input;
     // inputArray[1] = 12;
     // inputArray[2] = 2;
        int[] finalArray = calculateIntcode(inputArray);
        return finalArray[0];
    }

    public static int getNounAndVerb (int[] input) {
        int[] inputArray = input;
        int[] calculatingArray = inputArray;
        int noun;
        int verb;
        for(int i=0; i<100; i++) {
            for (int j = 0; j < 100; j++) {
                calculatingArray = input.clone();
                calculatingArray[1] = i;
                calculatingArray[2] = j;
                int[] resultingArray = calculateIntcode(calculatingArray);
                int positionZero = resultingArray[0];
                //System.out.println("value noun: " + i + " value verb: " + j + "position zero: " + positionZero + " value of noun: " + calculatingArray[1] + " value of verb: " + calculatingArray[2]);
                if (positionZero == 19690720) {
                    noun = calculatingArray[1];
                    verb = calculatingArray[2];
                    int nounAndVerb = (100*noun) + verb;
                    return nounAndVerb;
                } else {
                    calculatingArray = inputArray;
                }
            }
        } return -1;
    }

    public static int[] calculateIntcode(int[] input) {
        int[] startingIntCode = input;
        int[] inProgressIncode = startingIntCode;
        //System.out.println("array: "+ startingIntCode + " length of array: " + startingIntCode.length);

        // per 4 codes
        for (int i = 0; i < startingIntCode.length-1; i = i + 4) {
            int opcode = inProgressIncode[i];

            if (opcode == 99) {
                System.out.println("Program successfully completed!");
                return inProgressIncode;
            } else {
                int position1 = inProgressIncode[i + 1];
                int position2 = inProgressIncode[i + 2];
                int outputPosition = inProgressIncode[i + 3];

                if (opcode == 1) {
                    inProgressIncode[outputPosition] = inProgressIncode[position1] + inProgressIncode[position2];
                } else if (opcode == 2) {
                    inProgressIncode[outputPosition] = inProgressIncode[position1] * inProgressIncode[position2];
                } else {
                    System.out.println("we encountered a wrong OpCode.... :-( " + opcode);
                    return startingIntCode; //something went wrong
            }
            }
        }
        return inProgressIncode; // something went wrong
    }
}
