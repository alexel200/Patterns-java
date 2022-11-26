package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       int type = 0;
        Users users;
       if(type == 1 ){
            users = new UsersMemory();
       }else{
            users = new UsersFile();
       }
       create(users, "user1");
       create(users, "user2");
       create(users,"user3");
       create(users, "user4");
       create(users,"user5");

       for(String user: users.list()){
           System.out.println(user);
       }
    }


    public static void create(Users user, String name ){
        user.create(name);
    }

    public ArrayList<String> list(Users users){
        return users.list();
    }
}