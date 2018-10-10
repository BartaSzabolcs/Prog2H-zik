/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

import java.util.Arrays;


public class Orarend {

    private String nap;
    private Ora or;
    private int szamlalo;
    private String []orakTombje;
    
    
    public Orarend(String[] orakTombje,int szamlalo){
    szamlalo=0;
    orakTombje = new String [12];
    }
    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora getOr() {
        return or;
    }

    public void setOr(Ora or) {
        this.or = or;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

    public String[] getOrakTombje() {
        return orakTombje;
    }

    public void setOrakTombje(String[] orakTombje) {
        this.orakTombje = orakTombje;
    }

    

    

    public boolean oratHozzaad(Ora or){
        if(this.szamlalo>=12){
            return false;
        }else{
             for(int i=0;i<=this.szamlalo;i++){
                 if(this.orakTombje[i].equals(or)){
                     return false;
                 }
            
             }
             this.orakTombje[this.szamlalo]=or; 
             this.szamlalo++; 
             return true; 
             
             }
    
     
     
        }
     
      
    }
    
    
    
