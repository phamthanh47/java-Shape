package com.company;

public class Square extends Rectangle {

    public Square(){
    }
    public Square(String color, boolean filled,double side){
        super(color,filled,side,side);

    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double side) {
       setWidth(side);
       setLength(side);
    }
    public double getArea()
    {
        return getSize()*getSize();
    }
    public double getPrimeter(){
        return getSize()*4;
    }
     public String toString(){
        return  "color: "+ getColor()+"filled: "+isFilled()+"side: "+getSize();
     }
}
