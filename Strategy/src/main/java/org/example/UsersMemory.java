package org.example;

import java.util.ArrayList;

public class UsersMemory implements Users{
    private ArrayList<String> users = new ArrayList<String>();

    @Override
    public void create( String name ){
        users.add(name);
    }

    @Override
    public ArrayList<String> list(){
        return users;
    }
}
