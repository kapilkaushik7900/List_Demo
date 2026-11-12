package Datatype;

public class TestString {
   public static void main(String[] args) {
       String strformatted = String.format("This car name is %s and their number is %d","WalksWagon",333);
       System.out.println(strformatted);
       //Substring
       String name = "Harshit";
       System.out.println(name.substring(1,3));
       System.out.println(name.subSequence(1,3));

        }
}
