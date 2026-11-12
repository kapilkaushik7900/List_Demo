package testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterating {
    static void main(String[] args) {
        List<String> User = new ArrayList<>();
        User.add("alice");
        User.add("Bob");
        User.add("Charlie");
        User.add("Chris");
        User.get(0);

        System.out.println("~~~~~Using for each Loop~~~~~~");
        for (String Users : User) {
            // System.out.println(User.get(0));
////            System.out.println(User.get(1));
////            System.out.println(User.get(2));
////            System.out.println(User.get(3));
//        }
//        System.out.println("~~~~~Using For Loop~~~~~");
//        for (int i = 0; i < User.size(); i++) {
//            System.out.println(User.get(i));
//        }

                //Iterator
                Iterator<String> it = User.iterator();
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
                if (it.next().equals("Bob")) {
                    it.remove();
                }

            }
//                for (String Users : User) {
                    System.out.println(User);
                }
            }


