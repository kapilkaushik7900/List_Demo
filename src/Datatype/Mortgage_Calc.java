package Datatype;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage_Calc {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal:-");
        int Principal = sc.nextInt();
        System.out.println("Enter the Rate:-");
        float Rate = sc.nextFloat();
        System.out.println("Enter the period(Years):-");
        int period = sc.nextInt();

        float monthlyInterest = Rate / 12 / 100;
        float Monthly_pay = period * 12;
        double mortgage =  (Principal * (monthlyInterest*Math.pow(1 + monthlyInterest,Monthly_pay)/Math.pow(1+monthlyInterest,Monthly_pay)-1));
        NumberFormat India = NumberFormat.getCurrencyInstance(new Locale("en","IN"));

        NumberFormat us= NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Mortgage in dollars:-"+us.format(mortgage));

        System.out.println("Mortgage in rupees:-"+India.format(mortgage));




    }
}
