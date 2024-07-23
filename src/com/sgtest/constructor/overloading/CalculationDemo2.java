package com.sgtest.constructor.overloading;
// for the given 1D int array read second hal of the elements in reverse order

class Maths2{
    Maths2(int arr[]){
        for(int i=arr.length-1;i>=arr.length/2;i--){
            System.out.println(arr[i]);
        }
    }
}
public class CalculationDemo2 {
    public static void main(String[]args){
        int b[]={10,20,30,40,50,60};
        Maths2 m2 =new Maths2(b);

        Maths2 m3 = new Maths2(new int[] {10,20,30,40,50,60});
    }
}
