package com.company;

import javax.xml.crypto.dom.DOMCryptoContext;

public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle()
    {
    }
    public Rectangle(String color, boolean filled, double width,double length)
    {
        super(color,filled);
        setWidthLength(width,length);
    }
    public void setWidthLength(double width,double length)
    {
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPrimeter(){
        return (width+length)*2;
    }
    public String toString()
    {
        return super.toString()+ "Rectangle: "+"width= "+width+"length= "+length;
    }
}
