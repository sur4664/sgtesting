package com.sgtest.constructor.overloading;
class Name
{
    Name(String firstname,String middlename,String lastname)
    {
        System.out.println("Firstname: "+ firstname);
        System.out.println("middlename:"+middlename);
        System.out.println("lastname :"+lastname);
    }
    Name(int phonenumber,int dob){
        System.out.println("phonenumber :"+ phonenumber);
        System.out.println("date of birth :"+dob);
    }
}
public class Aadhar
{
    public static void main(String[] args)
    {
        Name adn = new Name("kuroop", "h","menon");
        Name ad = new Name(9990,04);
    }
}