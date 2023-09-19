package methods;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task2 {
    static int butter;
    static double weight;
    static double totalWeight;
    static double pc;
    static double koef;
    private static final String WEIGHT = "kg";

    public static void main(String[] args) {
        //відсоток природних втрат
        pc = 20.5;
        koef = pc / 100;

        enterData();

        //розрахунок
        totalWeight = roundTotalWeight(calculTotalWeight(butter, weight, koef));
        System.out.println("Total weight is: " + totalWeight + " " + WEIGHT);
    }

    private static void enterData() {
        System.out.println("Enter quantity of goods: ");
        Scanner scQuon = new Scanner(System.in);
        butter = scQuon.nextInt();

        System.out.println("Enter weight of unit:");
        Scanner scWeight = new Scanner(System.in);
        weight = scQuon.nextDouble();

    }

    private static double calculTotalWeight(int quantity, double weight, double percentLost) {
        // Повернення результату методу
        return quantity * weight * percentLost;
    }

    public static double roundTotalWeight(double value) {
        return new BigDecimal(value).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
