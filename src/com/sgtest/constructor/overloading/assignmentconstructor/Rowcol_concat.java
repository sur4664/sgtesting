package com.sgtest.constructor.overloading.assignmentconstructor;
//for the given 2D string array concatinate only 1st and 2nd column elements
class RcConcat{
    RcConcat(String arr[][]){
        String elements = "";
        for(int i=0;i<= arr.length-1;i++){
            for(int y=0;y<=1;y++){
                elements +=arr[i][y];
            }
        }
        System.out.println(elements);
    }
}
public class Rowcol_concat {
    public static void main(String[] args) {
        String arr[][]={{"one","two","three"},{"food","for","everyone"},{"Proud","to be an","Indian"}};
        RcConcat rcc = new RcConcat(arr);
    }
}
