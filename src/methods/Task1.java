package methods;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task1 {
    static int notePad;
    static double weight;
    static double totalWeight;

    public static void main(String[] args) {
        enterData();
        totalWeight = roundTotalWeight(calculTotalWeight(notePad, weight));
        System.out.println("Total weight is:" + totalWeight);
    }

    private static void enterData() {
        System.out.println("Enter quantity of goods: ");
        Scanner scQuon = new Scanner(System.in);
        notePad = scQuon.nextInt();

        System.out.println("Enter weight of unit:");
        Scanner scWeight = new Scanner(System.in);
        weight = scQuon.nextDouble();

    }

    private static double calculTotalWeight(int quantity, double weight) {
// Повернення результату методу
        return quantity * weight;
    }

    public static double roundTotalWeight(double value) {
        return new BigDecimal(value).setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
