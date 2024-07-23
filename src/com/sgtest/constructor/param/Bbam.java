package com.sgtest.constructor.param;

public class Bbam {
    String shop;
    String purchase;
    String distributor;

    Bbam(String shop, String purchase, String distributor) {
        this.shop = "shop";
        this.purchase = "purchase";
        this.distributor = "distributor";
        System.out.println(" in constructor");
        System.out.println(shop);
        System.out.println(distributor);
        System.out.println(purchase);

    }

     void display() {
        System.out.println(" in method");
        System.out.println("shop" + shop);
        System.out.println("purchase" + purchase);
        System.out.println("distributor" + distributor);
    }

}
 class Wrp {
     public static void main(String[] args) {
         Bbam b = new Bbam("abc", "materials", "albert");
         b.display();

     }
 }




