package org.example.classes;

import org.example.models.User;

import java.util.ArrayList;

public class UsersImpl implements UsersIterator{
    private ArrayList<User> users = new ArrayList<User>();
    private int index = 0;

    public void create(User user){
        users.add(user);
    }
    @Override
    public User next() {
        User user = users.get(index);
        index +=1;
        return user;
    }

    @Override
    public boolean hasNext() {
        return index < users.size() ;
    }

    @Override
    public void reset() {
     index = 0;
    }


}
