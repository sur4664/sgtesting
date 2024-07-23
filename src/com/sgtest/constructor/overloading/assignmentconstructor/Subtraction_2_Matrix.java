package com.sgtest.constructor.overloading.assignmentconstructor;
//wap to perform subtraction of 2matrix
class Sub
{
    Sub(int a[][],int b[][])
    {
        for(int i = 0;i<=a.length-1;i++)
        {
            for(int j =0;j<=a[i].length-1;j++)
            {
                int res =  a[i][j]- b[i][j];
                System.out.print(res + " ");
            }
            System.out.println();
        }

    }
}
public class Subtraction_2_Matrix
{
    public static void main(String[] args)
    {
        int a[][]={{10,20,30},{10,20,30},{10,20,30}};
        int b[][]={{1,2,3},{1,2,3},{1,2,3}};
        Sub s = new Sub(a,b);
    }
}
