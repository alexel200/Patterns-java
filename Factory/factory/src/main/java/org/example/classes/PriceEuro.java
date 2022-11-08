package org.example.classes;

public class PriceEuro implements Price {
    double price = 1.21;
    @Override
    public double getPrice() {
        return price;
    }
}
