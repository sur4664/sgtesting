package com.sgtest.constructor.overloading.assignmentconstructor;
//for the given 2D integer array assign all the elements of 2D array into 1D array,
// read the elements from 1D array
class Two2D_1D{
    Two2D_1D(int[][] a, int[] b){
        int x=0;
        for(int i=0;i<=a.length-1;i++) {
            for (int y = 0; y <= a[i].length - 1; y++) {
                b[x] = a[i][y];
                x++;
            }
        }
        for(int i :b)
        System.out.print(i+" ");
        }
    }

public class Assign2D_1D {
    public static void main(String[] args) {
        int a[][]={{100,200,300},{1000,2000,3000},{400,500,600},{4000,5000,6000}};
        int b[]=new int [a.length*a[0].length];
        Two2D_1D t21 = new Two2D_1D(a,b);
    }
}
