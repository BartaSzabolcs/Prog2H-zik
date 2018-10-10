/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi2;

import java.util.Arrays;

public class Kocsma extends VendeglatoipariEgyseg{
    
    private String[] sörlap;
    
    public Kocsma(String nev, int ferohelyekszama, boolean dohanyzo,String[] sörlap) {
        super(nev, ferohelyekszama, true);
        this.sörlap=sörlap;
    }
    
    public String[] getSörlap(){
        return sörlap;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Arrays.deepHashCode(this.sörlap);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Kocsma)){
               return false;
    }
      Kocsma k=(Kocsma)obj;
      
      return super.equals(k) && Arrays.equals(this.sörlap, k.getSörlap());
    }

    @Override
    public String toString() {
        return "Kocsma sörlapja=" + Arrays.toString(sörlap);
    }
    
    
    
}
