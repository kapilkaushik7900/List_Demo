package testing;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    static void main(String[] args) {
        Map<Integer,String> usermap = new HashMap<>();
        usermap.put(1,"Alice");
        usermap.put(2,"Bob");
        usermap.put(3,"Charlie");
        usermap.put(4,"Chris");
        usermap.put(5,"lie");
        usermap.put(6,"Carlie");
        usermap.put(7,"Chaie");
        System.out.println("Users:"+usermap.get(1));
        for(Map.Entry<Integer,String> entry : usermap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
