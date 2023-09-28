package Ejercicios01;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce a product price without taxes:");
        float taxBase = scanner.nextFloat();
        System.out.println("Please introduce the type of tax to apply (general reduced or superreduced)");
        String taxType = scanner.next().toLowerCase();
        float taxesPercent = 21F;
        System.out.println("Please introduce your promotion code (nopro, half, minus5, 5perc)");
        String promoCode = scanner.next().toLowerCase();
        switch (taxType){
            case "general":
                break;
            case "reduced":
                taxesPercent = 10F;
                break;
            case "supereduced":
                taxesPercent = 4F;
                break;
            default:
                System.out.println("The tax oiption introduced it's not valid, general taxes would be applied.");
        }
        float taxesToAdd = taxBase * (taxesPercent / 100);
        float priceWithTaxes = taxBase + taxesToAdd;
        float promoToRest = 0;
        switch (promoCode){
            case "nopro":
                break;
            case "half":
                promoToRest = priceWithTaxes - (priceWithTaxes / 2);
                break;
            case "minus5":
                promoToRest = 5;
                break;
            case "5perc":
                promoToRest = priceWithTaxes * 0.05F;
                break;
        }
        float finalPrice = priceWithTaxes - promoToRest;
        System.out.println("Product price with no taxes\n" + taxBase +
                "\nTaxes to apply(" + taxesPercent + "%)\n" + taxesToAdd +
                "\nPrice with taxes\n" + priceWithTaxes +
                "\nPromo code(" + promoCode + "): -" + promoToRest +
                "\nTOTAL\n" + finalPrice);
    }
}