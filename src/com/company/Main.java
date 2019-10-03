package com.company;

public class Main {

    public static void main(String[] args) {
        Shape rectangle= new Rectangle("red",true,5,7);
        Shape circle=new Circle("blue",false,9);
        Shape square=new Square("white",true,3);
        System.out.println(rectangle.toString());
        System.out.println(circle.toString());
        System.out.println(square.toString());
    }
}
