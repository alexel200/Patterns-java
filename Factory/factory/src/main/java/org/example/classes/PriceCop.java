package org.example.classes;

public class PriceCop implements Price{
    double price = 5000;
    @Override
    public double getPrice() {
        return price;
    }
}
