/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi2;


public class Rectangle extends GeometricShape{
    
    private double width;
    private double height;
    
 public Rectangle(double width,double height){
     this.height=height;
     this.width=width;
 }
    
    public Rectangle(String color, boolean filled, double width,double height) {
        super(color, filled);
        this.width=width;
        this.height=height;
    }
    
    
    public double getWidth(){
        return width;
    }
    public void setWidth(){
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(){
        this.height=height;
    }
    
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width*height);
    }
    
    
}
