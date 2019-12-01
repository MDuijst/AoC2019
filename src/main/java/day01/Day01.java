package day01;


public class Day01 {


    public static int calculateIndividualModule(int mass) {
        int indMass = mass;
        int individualFuel = 0;
        //divide by 3
        int calc = indMass / 3; //needs to round down
        //subtract 2
        individualFuel = calc -2;
        if(individualFuel <0) {
            individualFuel = 0;
        }
        return individualFuel;
    }


    public static int calculateTotalFuel(String masslist) {
        String input = masslist;
        String[] inputArray = input.split("\n");
        int totalFuelRequirement = 0;


        for(String i : inputArray) {
            int mass = Integer.valueOf(i);
            totalFuelRequirement += calculateIndividualModule(mass);
        }

        return totalFuelRequirement;
    }

    public static int calculateTotalFuelInclAdditional(String masslist) {
        String input = masslist;
        String[] inputArray = input.split("\n");
        int totalFuelRequirement = 0;

        for(String i : inputArray) {
            int mass = Integer.valueOf(i);
            int moduleFuel = calculateIndividualModule(mass);
            totalFuelRequirement += moduleFuel;

            int additionalFuel = moduleFuel;
            while (additionalFuel > 0) {
                int newFuel = calculateIndividualModule(additionalFuel);
                //   System.out.println("Current total: " + totalFuelRequirement + " + new Fuel: " + newFuel);
                totalFuelRequirement += newFuel;
                additionalFuel = newFuel;
            }
        }
        return totalFuelRequirement;
    }

}
