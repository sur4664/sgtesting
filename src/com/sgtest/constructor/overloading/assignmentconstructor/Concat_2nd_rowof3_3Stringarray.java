package com.sgtest.constructor.overloading.assignmentconstructor;
// for the given 3*3 String array concatinate 2nd row of the elements
class Concat{
    Concat(String arr [][]){
        String ele="" ;
        for(int c=0;c<=arr[0].length-1;c++){
            ele= ele + arr[1][c];
        }
        System.out.println(ele+ " ");
    }
}
public class Concat_2nd_rowof3_3Stringarray {
    public static void main(String[] args) {
        String arr[][]={{"India ","America ","Australia"},{"Cricket","Baseball","Foodball"},{"worldcup","won","game"}};
        Concat ct = new Concat(arr);
    }
}
