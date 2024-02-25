package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        this.setFlagCheese(true);
        this.setFlagToppings(true);
    }
}
