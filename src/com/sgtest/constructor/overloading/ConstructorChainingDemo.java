package com.sgtest.constructor.overloading;

// constructor chaining is achived using  this operator
//rule 1 must always be the first statement in the body of the constructor
//rule 2 must be the only statement  inside the body of the constructor(multiple this operator not allowed
class Product1{
    Product1(String name){
        System.out.println("Product name :"+ name);
    }
    Product1(double price){
        this("Lenova Head phone");
        System.out.println("Price of the product:"+ price);
    }
}
public class ConstructorChainingDemo {
    public static void main(String[]args){
        Product1 p1 =new Product1(500.125);
    }
}
