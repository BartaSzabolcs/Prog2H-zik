/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1;

public class Rectangle {
    
    public double width;   //téglalap szélessége
    public double height;  // téglalap magassága
    
    public Rectangle(){
        this.width=1.0;
        this.height=1.0;
    }
    
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    
    public double getArea(){  //téglalap területe
        return this.width*this.height;
    }
    
    public double getPerimeter(){ //téglalap kerülete
        return 2*(this.width*this.height);
    }

    @Override
    public String toString() {
        return "A téglalap szélessége= " + width + " , és magassága= " + height ;
    }
    
}
