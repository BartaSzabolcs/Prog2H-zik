/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi2;

import java.util.Date;
import java.util.Objects;


public class Auto {
    private String rendszam;
    private int motorTeljesitmény;
    private Date dateCreated=new Date();

    public Auto(String rendszam,int motorTeljesitmeny){
        this.rendszam=rendszam;
        this.motorTeljesitmény=motorTeljesitmeny;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getMotorTeljesitmény() {
        return motorTeljesitmény;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "Auto rendszama=" + rendszam + ", motorTeljesitménye= " + motorTeljesitmény + ", dateCreated=" + dateCreated;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.rendszam);
        hash = 53 * hash + this.motorTeljesitmény;
        hash = 53 * hash + Objects.hashCode(this.dateCreated);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auto other = (Auto) obj;
        if(!Objects.equals(this.rendszam, other.rendszam)){
            return false;
        }
        if(this.motorTeljesitmény != other.motorTeljesitmény){
            return false;
        }
        if(!Objects.equals(this.dateCreated, other.dateCreated)){
            return false;
        }
        return true;
    }
  
}
