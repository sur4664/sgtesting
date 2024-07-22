package com.sgtest.constructor.param;
public class Newspaper {
    String newspaper;
    String magazine;
    String comics;

    Newspaper(String newspaper, String purchase, String distributor) {
        this.newspaper = "newspaper";
        this.magazine= "magazine";
        this.comics = "comics";
        System.out.println(" in constructor");
        System.out.println(newspaper);
        System.out.println(magazine);
        System.out.println(comics);

    }

    void dis() {
        System.out.println(" in method");
        System.out.println("newspaper" + newspaper);
        System.out.println("magazine" + magazine);
        System.out.println("comics" + comics);
    }

}
class Nmc{
    public static void main (String[]args){
        Newspaper b = new Newspaper("the Hindu"," aryan","mehboob agencies");
        b.dis();

    }
}


