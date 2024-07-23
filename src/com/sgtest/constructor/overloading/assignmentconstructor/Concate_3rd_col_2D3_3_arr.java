package com.sgtest.constructor.overloading.assignmentconstructor;
// for the given 3*3 2D char array concat 3rd column of the elements find the number of elements

class Colconcat{
    Colconcat(char arr[][]){
        String ele="" ;
        for(int r=0;r<=arr.length-1;r++){
            ele= ele + arr[r][2];
        }
        System.out.println(ele);
        System.out.println(ele.length());
    }
}
public class Concate_3rd_col_2D3_3_arr {
    public static void main(String[] args) {
        char arr[][]={{'A','s','d'},{'B','m','k'},{'c','i','d'}};
        Colconcat clcnt = new Colconcat(arr);
    }
}
