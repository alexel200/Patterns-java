package org.example;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsersFile implements Users {
    private String usersFile = "users.txt";
    private PrintStream file;
    public UsersFile(){
        try{
            file = new PrintStream(usersFile);
        }catch(Exception e){
            System.out.println("The file cannot be opened or does not exit");
        }
    }

    @Override
    public void create(String name){
        file.println(name +"\r\n");
    }
    @Override
    public ArrayList<String> list(){
        ArrayList<String> users = new ArrayList<String>();
        try{
            Scanner scanner = new Scanner( new File(usersFile) );
            while( scanner.hasNext() ){
                users.add(scanner.next());
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage() );
        }
        return users;
    }
}
