/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi2;


public class VendeglatoipariEgyseg {

    private String nev;
    private int ferohelyekszama;
    private boolean dohanyzo;

    public VendeglatoipariEgyseg(String nev,int ferohelyekszama,boolean dohanyzo){
        this.nev=nev;
        this.ferohelyekszama=ferohelyekszama;
        
    }

    public String getNev() {
        return nev;
    }

    public int getFerohelyekszama() {
        return ferohelyekszama;
    }
    
    public void setDohanyzo(boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }
   
    public boolean isDohanyzo() {
        return dohanyzo;
    }

    @Override
    public String toString() {
        return "VendeglatoipariEgyseg neve: " + nev + ", ferohelyekszama=" + ferohelyekszama + ", dohanyzo-e " + dohanyzo;
    }
    
    
    
}
