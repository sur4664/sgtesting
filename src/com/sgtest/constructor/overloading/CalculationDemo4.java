package com.sgtest.constructor.overloading;
//using constructor overloading perform all basic mathematical operations with the given two integer values
class BasicMaths{
    BasicMaths(int x,int y,String scenario){
        int res =0;
        switch (scenario){
            case "add":
                res =(x+y);
                System.out.println("addition of two integer :"+ res);break;
            case "sub":res=(x-y);
                System.out.println("subtraction of two integer :"+ res);break;
            case "mult":res=(x*y);
                System.out.println("multiplication of two integer :"+ res);break;
            case "div":res=(x/y);
                System.out.println("division of two integer :"+ res);break;
            default:
                System.out.println("invalid scenario");
        }
    }
}
public class CalculationDemo4 {
    public static void main(String[] args) {
        BasicMaths bm1 = new BasicMaths(20,30,"add");
        BasicMaths bm2 = new BasicMaths(20,30,"sub");
        BasicMaths bm3 = new BasicMaths(20,30,"mult");
        BasicMaths bm4 = new BasicMaths(20,30,"div");

    }
}
