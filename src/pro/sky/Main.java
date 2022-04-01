package pro.sky;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // this is my code regarding variables
        // Task1. Variable declarations and initializations

        byte byteValue = 8;
        short shortValue = 63;
        int intVariable = 167;
        long longVar = 3_456_567_913_768L;

        float floatV = 3.1415927f;
        double doubleVar = 3.1415926535897932;

        char characterValue = 'c';

        boolean boolVar = true;

        // Task 2. Boxer weights

        float firstBoxerWeight = 78.2f, secondBoxerWeight = 82.7f; // Boxer weights in kilograms
        System.out.println("Total weights of meat bags on arena: " + (firstBoxerWeight + secondBoxerWeight)
                + " kilograms"
                + "\nThe difference in meat bags weight: " + Math.abs(firstBoxerWeight-secondBoxerWeight)
                + " kilograms");

        // Task 3. Sportsmen weight control
        // Task conditions
        int bananaNumber = 5, bananaWeightInGrams = 80, milkVolumeInMilliliters = 200,
                milkDensity100Milliliters = 105, iceCreamPackageNumber = 2, iceCreamPackageWeight = 100,
                eggNumber = 4, eggWeightInGrams = 70;


        // Breakfast total weight in grams
        int breakfastTotalWeightInGrams = bananaNumber * bananaWeightInGrams +
                milkVolumeInMilliliters / 100 * milkDensity100Milliliters +
                iceCreamPackageNumber * iceCreamPackageWeight +
                eggNumber * eggWeightInGrams;
        // Breakfast total weight in kilograms
        float breakfastTotalWeightInKilograms = ((float) breakfastTotalWeightInGrams) / 1000f;

        System.out.println("Breakfast total weight in grams: " + breakfastTotalWeightInGrams +
                "\nBreakfast total weight in kilograms: " + breakfastTotalWeightInKilograms);

        // Task 4. Weight loss
        // Task conditions
        int weightDifferenceInGrams = 7000, minimumWeightLossPerDay = 250, maximumWeightLossPerDay = 500;

        // Task results in float, but this is not only one possibility
        float maxDaysOfWeightLoss = ((float) weightDifferenceInGrams) / ((float) minimumWeightLossPerDay);
        float minDaysOfWeightLoss = ((float) weightDifferenceInGrams) / ((float) maximumWeightLossPerDay);
        float averageDaysOfWeightLoss = (maxDaysOfWeightLoss + minDaysOfWeightLoss) / 2;

        System.out.println("Maximum days of loosing weight: " + ((int) Math.ceil(maxDaysOfWeightLoss)));
        System.out.println("Minimum days of loosing weight: " + ((int) Math.ceil(minDaysOfWeightLoss)));
        System.out.println("Average number of loosing weight days: "
                + ((int) Math.ceil(averageDaysOfWeightLoss)));

        // Task 5.
        // Task conditions
        // I choose float/double variables, because salary is float value normally (with pennies)
        // and within float range :)
        float mashaMonthSalary = 67760f, denisMonthSalary = 83690f, kristinaMonthSalary = 76230f;

        float mashaOldAnnualSalary = mashaMonthSalary * 12, denisOldAnnualSalary = denisMonthSalary * 12,
                kristinaOldAnnualSalary = kristinaMonthSalary * 12;

        double mashaNewAnnualSalary = mashaOldAnnualSalary * 1.1,
                denisNewAnnualSalary = denisOldAnnualSalary * 1.1,
                kristinaNewAnnualSalary = kristinaOldAnnualSalary * 1.1;
        int roublesNewAnnual = (int) Math.floor(mashaNewAnnualSalary);
        int penniesNewAnnual = (int) Math.round((mashaNewAnnualSalary - roublesNewAnnual) * 100);
        int roublesDiffAnnual = (int) Math.floor(mashaNewAnnualSalary - mashaOldAnnualSalary);
        int penniesDiffAnnual = (int) Math.round((mashaNewAnnualSalary - mashaOldAnnualSalary
                - roublesDiffAnnual) * 100);
        System.out.println("Маша теперь получает " + roublesNewAnnual + " рублей, " +
                penniesNewAnnual + " копеек. Годовой доход вырос на " + roublesDiffAnnual + " рублей, "
                + penniesDiffAnnual + " копеек");

        roublesNewAnnual = (int) Math.floor(denisNewAnnualSalary);
        penniesNewAnnual = (int) Math.round((denisNewAnnualSalary - roublesNewAnnual) * 100);
        roublesDiffAnnual = (int) Math.floor(denisNewAnnualSalary - denisOldAnnualSalary);
        penniesDiffAnnual = (int) Math.round((denisNewAnnualSalary - denisOldAnnualSalary
                - roublesDiffAnnual) * 100);
        System.out.println("Денис теперь получает " + roublesNewAnnual + " рублей, " +
                penniesNewAnnual + " копеек. Годовой доход вырос на " + roublesDiffAnnual + " рублей, "
                + penniesDiffAnnual + " копеек");

        roublesNewAnnual = (int) Math.floor(kristinaNewAnnualSalary);
        penniesNewAnnual = (int) Math.round((kristinaNewAnnualSalary - roublesNewAnnual) * 100);
        roublesDiffAnnual = (int) Math.floor(kristinaNewAnnualSalary - kristinaOldAnnualSalary);
        penniesDiffAnnual = (int) Math.round((kristinaNewAnnualSalary - kristinaOldAnnualSalary
                - roublesDiffAnnual) * 100);
        System.out.println("Кристина теперь получает " + roublesNewAnnual + " рублей, " +
                penniesNewAnnual + " копеек. Годовой доход вырос на " + roublesDiffAnnual + " рублей, "
                + penniesDiffAnnual + " копеек");

        // Well, this task is for arrays lesson, I think :)

        // Task 6. Calculations

        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * (b + (c - d * e));

        System.out.println("Result = " + result + "\nOpposite result = " + (-result));

        // Are you sure that it is a difficult task? :)

        // Task 7. Changing numbers

        a = 5;
        b = 7;

        System.out.println("initial values: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Result: a = " + a + ", b = " + b);

        // Task 8. Middle figure
        // I wrote decimal expansion algorithm for any int variable

        // int intVar = 2_567_732;
        // int intVar = 0;
        // int intVar = Integer.MAX_VALUE;
        // int intVar = Integer.MIN_VALUE;
        // int intVar = 256;
        int intVar = 256;

        int intVarTemp = intVar, divRemainder;
        ArrayList<Integer> figures = new ArrayList<>();

        do {
            divRemainder = intVarTemp % 10;
            figures.add(Math.abs(divRemainder));
            intVarTemp = (intVarTemp - divRemainder) / 10;
        } while(intVarTemp / 10 != 0);
        if(intVarTemp != 0) {
            figures.add(Math.abs(intVarTemp));
        }

        System.out.println("Decimal expansion of intVar = " + intVar);
        for(int i = 0; i < figures.size(); i++) {
            System.out.println("Figure #" + (i+1) + " (10 in power " + i + ") - " + figures.get(i));
        }

        if(figures.size() > 1){
            System.out.println("\nSecond figure - " + figures.get(1));
        }


    }
}
