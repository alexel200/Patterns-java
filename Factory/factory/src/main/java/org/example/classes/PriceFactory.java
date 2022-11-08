package org.example.classes;

public class PriceFactory {
    Price price;

    public PriceFactory(String country){
        switch(country.toLowerCase()){
            case "cop":
                System.out.println("Requested COP price");
                price = new PriceCop();
                break;
            case "usd":
                System.out.println("Requested USD price");
                price = new PriceDollar();
                break;
            case "euro":
                System.out.println("Requested EURO price");
                price = new PriceEuro();
                break;
            default:
                System.out.println("Requested USD price");
                price = new PriceDollar();
        }
    }

    public double getPrice(){
        return price.getPrice();
    }
}
