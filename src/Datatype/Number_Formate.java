package Datatype;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;

public class Number_Formate {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //Switch statement
        switch (str){
            case "G":
                System.out.println("You are a Gay");
                break;
            case "L":
                    System.out.println("You are a Lesbian");
                    break;
            case "S":
                System.out.println("You are a Straight");
                break;
            default:
                System.out.println("Other, that not be mentioned");
        }
    }


    }

