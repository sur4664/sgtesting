package com.sgtest.constructor.overloading.assignmentconstructor;
// for the given 2D byte array find the sum of all elements
class Sumbyte{
    Sumbyte(byte arr[]){
        int sum =0;
        for(int i:arr){
            sum +=i;
        }
        System.out.println(sum);
    }
}
public class Sum_2DbyteArr {
    public static void main(String[] args) {
        byte arr[]={1,2,3,4,5,6,7};
        Sumbyte sb = new Sumbyte(arr);
    }
}
