package com.sgtest.constructor.overloading;

//write a constructor to find the factoral of a given number
 class Maths1{
     Maths1(int num){
         int fact =1;
         for(int i=num; i >= 1;i--){
             fact= fact*i;
         }
             System.out.println("Factoral of "+num+"is "+ fact);
         }
     }

public class CalculationDemo1 {
    public static void main(String[]args){
        Maths1 o1 = new Maths1(4);
        Maths1 o2 = new Maths1(5);
        Maths1 o3 = new Maths1(8);
        Maths1 o4 = new Maths1(9);
    }
}
