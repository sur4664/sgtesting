package com.sgtest.constructor.overloading.assignmentconstructor;
//for the given 2D double array display all elements in reverse order
class Reverse2D{
    Reverse2D(double array[][]){
         int lng = array.length;
         for(int r =lng-1;r>=0;r--){
             for(int c=lng-1;c>=0;c--){
                 System.out.print(array[r][c]+" ");
             }
             System.out.println();
         }
    }
}

public class Rev_2D_Arr {
    public static void main(String[] args) {
        double array[][]={{15.25,16.75,17.98},{15.25,16.99,17.98},{16.89,18.98,19.97}};
      Reverse2D r2d = new Reverse2D(array);
    }
}
