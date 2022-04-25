package Curso_Java.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        int i = 0;
        while (i < 10) {
            User actual = new User("Nome: " + i, "Sobrenome: " + i);
            users.add(actual);
            i++;
        }

//        System.out.println(users.get(0).getFirstName());
//        System.out.println(users.get(0).getLastName());

        User user11 = new User("Nome 11", "Sobrenome 11");
        users.add(user11);

        System.out.println(users.get(10).getFirstName());
        System.out.println(users.get(10).getLastName());

    }


}
