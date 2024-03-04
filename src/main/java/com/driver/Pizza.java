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
            this.price+=300;
        }
        else
        {
            this.price+=400;
        }
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
        if(isVeg=true)
            bill="Base Price Of The Pizza:300\n";
        else
            bill="Base Price Of The Pizza:300\n";
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

        String totalPrice= Integer.toString(price);
        this.bill+="Total Price: "+totalPrice+"\n";
        return this.bill;
    }
}
