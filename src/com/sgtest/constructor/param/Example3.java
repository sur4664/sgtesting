package com.sgtest.constructor.param;

public class Example3 {
    String wholeseller;
    String retailer;
    String purchaser;

    Example3(String shop, String purchase, String distributor) {
        this.wholeseller= "wholeseller";
        this.retailer= "retailer";
        this.purchaser = "purchaser";
        System.out.println(" in constructor");
        System.out.println(wholeseller);
        System.out.println(retailer);
        System.out.println(purchaser);

    }

    void display() {
        System.out.println(" in method");
        System.out.println("wholeseller" + wholeseller);
        System.out.println("retailer" +retailer);
        System.out.println("purchaser" + purchaser);
    }

}
class Parmeterized_this {
    public static void main (String[]args){
        Example3 e3= new Example3("arvind mills","ahmed&co","marycom co  pvtltd");
        e3.display();

    }
}



