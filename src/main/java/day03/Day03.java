package day03;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Day03 {

    public static String[] wireAInstructions;
    public static String[] wireBInstructions;

    public static ArrayList<Coordinate> wireACoordinates = new ArrayList<Coordinate>();
    public static ArrayList<Coordinate> wireBCoordinates = new ArrayList<Coordinate>();

    //get wire A & B into separate arrays (split on \n)
    //split the wire on each instruction (R75, D3, U7, L31) (split on ,)
    public static void separateWires(String input) {
        String[] wires = input.split("\n");
        wireAInstructions = wires[0].split(",");
        wireBInstructions = wires[1].split(",");
     //   System.out.println("Wire A: " + wireAInstructions[0]+" , " + wireAInstructions[1] +" , " + wireAInstructions[2] +" , " +  wireAInstructions[3] );
     //   System.out.println("Wire B: " + wireBInstructions[0]+" , " + wireBInstructions[1] +" , " + wireBInstructions[2] +" , " +  wireBInstructions[3] );
    }

    //read instruction: R, D, U, L
    //add all inbetween coordinates per instruction (R75)
    public static ArrayList<Coordinate> readInstruction(String[] input) {
        int x = 0;
        int y = 0;
        ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
        for (String instructions : input) {
            int distance = Integer.valueOf(instructions.substring(1));

            switch (instructions.charAt(0)) {
                case 'R': { // do move right
                    for(int i=0;i<distance;i++) {
                        x++; //move right means x up
                        coordinates.add(new Coordinate(x,y));
                    }
                    break;
                }
                case 'U': { // do move upp
                    for(int i=0;i<distance;i++) {
                        y++; //move up means y up
                        coordinates.add(new Coordinate(x,y));
                    }
                    break;
                }
                case 'D': { // do move down
                    for(int i=0;i<distance;i++) {
                        y--; //move down means y down
                        coordinates.add(new Coordinate(x,y));
                    }
                    break;
                }
                case 'L': { // do move left
                    for(int i=0;i<distance;i++) {
                        x--; //move left means x down
                        coordinates.add(new Coordinate(x,y));
                    }
                    break;
                }
            }
        }
        return coordinates;
    }

    //get matching coordinates between wires
    public static ArrayList<Coordinate> getMatchingCoordinates(ArrayList<Coordinate> wireA, ArrayList<Coordinate> wireB) {
        //return all coordinates from wireA that are also in wireB
        ArrayList<Coordinate> matchingCoordinates = new ArrayList<Coordinate>();

        for (Coordinate c : wireA) {
            if (wireB.contains(c)) {
                matchingCoordinates.add(c);
            }
        }
        return matchingCoordinates;
    }
    //calculate absolute distance from 0.0
    //get distance of closest coordinate (lowest from row before)

    public static int getShortestDistance(ArrayList<Coordinate> matchingCoordinates) {
        int shortestDistance = Integer.MAX_VALUE;

        for (Coordinate coordinate : matchingCoordinates) {
            int distance = Math.abs(coordinate.getX()) + Math.abs(coordinate.getY());
            if (distance < shortestDistance) {
                shortestDistance = distance;
            }
        }
        return shortestDistance;
    }
}
