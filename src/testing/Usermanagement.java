package testing;

import java.util.*;
import java.util.List;

public class Usermanagement {

    static void main(String[] args) {
        List<Users> users = new ArrayList<>();
        users.add(new Users(true,"Alice",
                new HashSet<>(Arrays.asList("Admin","USERS"))));

        users.add(new Users(false, "Bob",
                new HashSet<>(List.of("USERS"))));

        users.add(new Users(false, "Charlie",
                new HashSet<>(List.of("USERS"))));
        users.add(new Users(false, "Chris",
                new HashSet<>(List.of("Manager"))));

        Iterator<Users> iterator = users.iterator();
        while(iterator.hasNext()){
            if(!iterator.next().isActive()){
                iterator.remove();
            }
            System.out.println("~~~~~Active Users~~~~~~");
            for(Users users1 : users)
                System.out.println(users1.getName());

            Map<String,Integer> rolecount = new HashMap<>();
            for(Users user : users){
                for(String role : user.getRoles()){
                    rolecount.put(role,rolecount.getOrDefault(role,0)+1);

                }
                System.out.println("ALL roles : Count");
                for(Map.Entry<String, Integer> entry : rolecount.entrySet()){
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            }


        }

    }
    //Remove

}
