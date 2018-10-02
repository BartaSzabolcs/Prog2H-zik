/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1;


public class RegualPolygon {
    int n;//sokszög olalait deffiniálja
    double side; // oldal hosszát
    private double x;  //a sokszög középpontját x kord
    private double y;  // sokszög középpontjának y kord
   
   public RegualPolygon(){
    this.n=3;
    this.side=1;
    this.x=0;
    this.y=0;
}

    public RegualPolygon(int n, double side){
        this.n = n;
        this.side = 1;
        this.x=0;
        this.y=0;
        
    }
   public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double Sokszog(int n,double side, double x, double y){
        return n*side*x*y;
        
    }

    public RegualPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    public double getPerimeter(int n,double side){
         return n*side;
    }
    public double getArea(int n, double side){
        return (0.25*n*side*side*(1/(Math.tan(Math.PI/n))));
    }

    
    public void String (int n, double side, double x, double y ){
        System.out.println("A Sokszög " + n +" oldalú " + " oldalai= " + side +" hosszúak " + ", x=" + x + ", y=" + y + '}');
    }

    
    

    
    
}
