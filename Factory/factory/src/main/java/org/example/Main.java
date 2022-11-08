package org.example;

import org.example.classes.PriceFactory;

public class Main {
    public static void main(String[] args) {
        PriceFactory price = new PriceFactory("cop");
        System.out.println( price.getPrice() );
        PriceFactory price2 = new PriceFactory("USD");
        System.out.println(  price2.getPrice());
        PriceFactory price3 = new PriceFactory("EURO");
        System.out.println( price3.getPrice());
    }
}