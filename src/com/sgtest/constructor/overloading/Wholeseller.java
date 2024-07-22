package com.sgtest.constructor.overloading;

class Whole {

    String company;
    int phonenumber;
    String manager;
    Whole(String company , int phonenumber, String manager) {
        System.out.println("Company :" +company );
        System.out.println("Phoneno :" + phonenumber);
        System.out.println("Manager:" + manager);
    }
    Whole(String Branch,int mobile ){
        System.out.println("Branch :"+Branch);
        System.out.println("Mobile :"+mobile);
    }

}

public class Wholeseller {
    public static void main(String[]args){
        Whole p1 = new Whole(" indian pvt ltd", 21987,"Sharma");
        Whole p2 =new Whole("mangalore",9880685);
    }
}


