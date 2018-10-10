/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi2;

import java.util.Arrays;

public class Étterem extends VendeglatoipariEgyseg{

    private String étlap[];
    
    public Étterem(String nev, int ferohelyekszama,boolean dohanyzo, String étlap[]) {
        super(nev, ferohelyekszama, false);
        this.étlap=étlap;
    }
    
    public String[] getÉtlap(String étlap[]){
        return étlap;
    }

    @Override
    public String toString() {
        return "étterem étlap= " + étlap;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Arrays.deepHashCode(this.étlap);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
         return super.equals(obj) && Arrays.equals(this.étlap, ((Étterem)obj).getÉtlap(étlap));
           
 }  
    
    
}
