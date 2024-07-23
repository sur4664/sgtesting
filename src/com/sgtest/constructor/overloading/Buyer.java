package com.sgtest.constructor.overloading;

 class Buy
 {

    String item;
    int quantity;
    int price;
    Buy(String item, int quantity, int price)
    {
        System.out.println("product :" + item);
        System.out.println("Quantity :" + quantity);
        System.out.println("Price :" + price);
    }
    Buy(String name, int rate){
        System.out.println("name :"+name);
        System.out.println("rate :"+rate);
    }

}

public class Buyer
{
    public static void main(String[]args){
        prd p1 =new prd("soap",5,100);
        prd p2 =new prd("paste",150);
    }
}


