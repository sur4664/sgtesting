package com.sgtest.constructor.overloading;

class Insure{
    String policy;
    int noofyears;
    int premium;
    Insure(String policy, int noofyears, int premium) {
        System.out.println("policy name :" + policy);
        System.out.println("Policy Term :" + noofyears);
        System.out.println("Premium :" + premium);
    }
    Insure(String policyprovider,int maturityvalue){
        System.out.println("policyprovider :"+policyprovider);
        System.out.println("maturityvalue :"+maturityvalue);
    }
}
public class Insurance {
    public static void main(String[]args){
        Insure p1 =new Insure("jeevanbhima",5,10000);
        Insure p2 =new Insure("Lic of india",1500000);
    }
}


