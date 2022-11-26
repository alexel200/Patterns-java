package org.example;

import org.example.classes.UsersImpl;
import org.example.classes.UsersIterator;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {
        UsersImpl user1 = new UsersImpl();

        user1.create( new User("user1", 10) );
        user1.create( new User("user2", 15) );
        user1.create( new User("user3", 40) );
        user1.create( new User("user4", 32) );

        while(user1.hasNext()){
            System.out.println(user1.next().getName());
        }
    }
}