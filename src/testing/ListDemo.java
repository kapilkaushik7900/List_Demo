package testing;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    static class Car{
        String Brand;
        int number;
        Car(String brand, int Number){
            this.Brand = Brand;
            this.number = number;
        }


    }
    static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        System.out.println("!!!!All Users!!!!");
        for(String user : users){
            System.out.println(user);
        }
        System.out.println("Element usint Index:- "+users.get(0));

        // Create objects
        Car car1 = new Car("Toyota",1900);
        Car car2 = new Car("Swift",3055);
        List<Car> Carlist = new ArrayList<>();
        Carlist.add(car1);
        Carlist.add(car2);


        System.out.println("!!!!All Cars!!!!");
        for(Car car : Carlist){
            System.out.println(car.Brand);
            System.out.println(car.number);
        }
    }
}
