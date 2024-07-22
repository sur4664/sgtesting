package com.sgtest.constructor.overloading;
class prd {
    String item;
    int quantity;
    int price;
     prd(String item, int quantity, int price) {
         System.out.println("product :" + item);
         System.out.println("Quantity :" + quantity);
         System.out.println("Price :" + price);
     }
     prd(String name,int rate){
         System.out.println("name :"+name);
         System.out.println("rate :"+rate);
     }

    }

public class Product {
    public static void main(String[]args){
        prd p1 =new prd("soap",5,100);
        prd p2 =new prd("paste",150);
    }
}
