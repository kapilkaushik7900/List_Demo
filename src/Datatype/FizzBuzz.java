package Datatype;

import java.util.Scanner;

public class FizzBuzz {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           String counting = "";
           while(!counting.equals("stop")){
               System.out.println("Count:-");
               counting = sc.next().toLowerCase();
               System.out.println(counting);


           }
    }
}
