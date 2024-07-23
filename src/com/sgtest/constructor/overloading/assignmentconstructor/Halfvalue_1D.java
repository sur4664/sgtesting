package com.sgtest.constructor.overloading.assignmentconstructor;
// for the given 1D integer array display half of the value of each element
class HalfElement{
    HalfElement(int array[]){
        for(int x:array){
            System.out.print(x/2+ " ");
        }
    }
}
public class Halfvalue_1D {
    public static void main(String[] args) {
        int array[]={10,20,30,40,50,60,70,80,90,100};
        HalfElement He = new HalfElement(array);
    }
}
