package com.sgtest.constructor;
class Param{
    String university;
    String college;
    String student;
    Param(String university,String college,String student){
        System.out.println("in constructor !!!");
        this.university="university";
        this.college="college";
        this.student="student";
        System.out.println(university);
        System.out.println(college);
        System.out.println(student);

    }

}
public class Parmeterized_this {



    public static void main (String[]args){
       Param p =new Param("bangalore","bgs","pramod");
    }
}


