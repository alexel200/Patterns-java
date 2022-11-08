package org.example.classes;

public class PriceDollar implements Price{
    double price = 1;
    @Override
    public double getPrice() {
        return price;
    }
}
