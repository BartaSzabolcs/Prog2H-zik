/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi2;

import java.util.Date;

public class GeometricShape {

    private String color;
    private boolean filled;
    private Date dateCreated=new Date();
    
    public GeometricShape(){  
    }

    public GeometricShape(String color,boolean filled){
        this.color=color;
        this.filled=false;
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
            
    @Override
    public String toString() {
        return "created on "+ dateCreated + "\ncolor=" + color + " and filled=" + filled;
    }

    
    
    
    
    
}
