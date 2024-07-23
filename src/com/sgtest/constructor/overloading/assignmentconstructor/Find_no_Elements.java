package com.sgtest.constructor.overloading.assignmentconstructor;
// for the given 2D integer array by using for each loop find the number of elements
class NumofEle{
    NumofEle(int array[][]){
        for(int arr[]:array){
            for(int x:arr ){
               int  num =array.length+array[x].length;
                System.out.print(array);
            }
        }
    }
}
public class Find_no_Elements {
    public static void main(String[] args) {
        int array[][]={{10,20,30,40},{50,60,70,80},{100,200,300,400},{500,600,700,800}};

        NumofEle noe =new NumofEle(array) ;
    }
}
