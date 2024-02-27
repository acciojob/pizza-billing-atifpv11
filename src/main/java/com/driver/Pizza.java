package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean flagCheese;
    private Boolean flagToppings;
    private Boolean flagTakeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.flagCheese=false;
        this.flagToppings=false;
        this.flagTakeaway=false;
        // your code goes here
        if(isVeg)
        {
            this.price=300;
        }
        else
        {
            this.price=400;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!flagCheese)
            this.price+=80;
        flagCheese=true;

    }

    public void addExtraToppings(){
        // your code goes here
        if(!flagToppings)
        {
            if(isVeg)
            {
                this.price+=70;
            }
            else
            {
                this.price+=120;
            }
        }
        flagToppings=true;
    }

    public void addTakeaway(){
        if(!flagTakeaway)
            this.price+=20;
        flagTakeaway=true;
    }

    public String getBill(){
        // your code goes here
        if(flagCheese)
        {
            this.bill+="Extra Cheese Added: 80\n";
        }
        if(flagToppings)
        {
            if(isVeg)
            {
                this.bill+="Extra Toppings Added: 70\n";
            }
            else
            {
                this.bill+="Extra Toppings Added: 120\n";
            }
        }
        if(flagTakeaway)
        {
            this.bill+="Paperbag Added: 20\n";
        }
        this.bill+="Total Price: "+this.price;
        return this.bill;
    }

    public void setFlagCheese(Boolean flagCheese) {
        this.flagCheese = flagCheese;
    }

    public void setFlagToppings(Boolean flagToppings) {
        this.flagToppings = flagToppings;
    }
}
