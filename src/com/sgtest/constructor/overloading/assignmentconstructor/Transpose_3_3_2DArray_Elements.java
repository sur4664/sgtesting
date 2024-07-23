package com.sgtest.constructor.overloading.assignmentconstructor;
// transpose the elements in the given 3*3 2D array
class Transpose2D {
    Transpose2D(int arr[][]) {

        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                int trans =  arr [j][i];
                System.out.print(trans+ "  ");
            }
        } System.out.println();

    }
}
public class Transpose_3_3_2DArray_Elements {
    public static void main(String[] args) {
        int arr[][]={{10,20,30},{100,200,300},{1000,2000,3000}};

        Transpose2D t2d = new Transpose2D(arr);
    }
}
