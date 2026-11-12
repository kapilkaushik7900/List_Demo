package testing;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    static void main(String[] args) {
        Set<String> roles = new HashSet <>();
        roles.add("Admin");
        roles.add("Executive");
        roles.add("Manager");
        roles.add("Salesman");
        roles.add("Managing Director");
        for(String role:roles){
            System.out.println("Roles:"+role);
        }
    }
}
