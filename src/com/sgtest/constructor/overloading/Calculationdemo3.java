package com.sgtest.constructor.overloading;

//perform addition of two given matrix
class Maths3{
    Maths3(int x[][],int y[][]){
        for(int i =0;i<=x.length-1;i++){
            for( int j =0;j<=x[i].length-1;j++){
                int res =x[i][j]+y[i][j];
                System.out.print(res + "  ");
            }
            System.out.println();
        }
    }
}
public class Calculationdemo3 {
    public static void main(String[]args){
        int a[][]={{10,20,30},{40,50,60}};
        int b[][]={{1,2,3},{4,5,6}};
        Maths3 mt1 =new  Maths3(a,b);
        System.out.println("-----------------------");

        Maths3 mt6= new  Maths3(new int[][] {{1,2},{4,5}},new int[][] {{100,200},{300,400}});
    }
}
