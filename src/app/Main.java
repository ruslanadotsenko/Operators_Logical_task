package app;

import java.util.Scanner;

public class Main {
static double revenue;
static double taxAmount;
static double tax;


    public static void main(String[] args) {
        getRevenue();
        tax = getTax(revenue);
        taxAmount = getTaxAmount(revenue, tax);
        getResult(taxAmount);
    }
    private static void getRevenue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your revenue in UAH: ");
        revenue = sc.nextDouble();
        sc.close();
    }
    private static double getTax(double revenue) {
        if (revenue > 0 && revenue <= 10000) {
            tax = 2.5;
        } else if (revenue > 10000 && revenue <= 25001) {
            tax = 4.3;
        } else if (revenue > 25001) {
            tax = 6.7;
        } else {
            System.out.print("Tax cannot be calculated, revenue is less than 0.");
        }
        return tax;
    }

    private static double getTaxAmount(double revenue, double tax){
        return revenue / 100 * tax;
    }

    private static void getResult(double taxAmount){
        System.out.printf("%nThe tax amount is: UAH %.2f%n", taxAmount);
    }

}

