/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

import java.util.Arrays;


public class Ora {
    
    private int kod;
    private String oraneve;
    private  int orakezdes;
    
    public Ora(int kod, String oraneve,int orakezdes){
        this.kod=kod;
        this.oraneve=oraneve;
        this.orakezdes=orakezdes;
    }
    
    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getOraneve() {
        return oraneve;
    }

    public void setOraneve(String oraneve) {
        this.oraneve = oraneve;
    }

    public int getOrakezdes() {
        return orakezdes;
    }

    public void setOrakezdes(int orakezes) {
        this.orakezdes = orakezes;
    }

    @Override
    public String toString() {
        return "Ora kod=" + kod + ", oraneve=" + oraneve + ", orakezes=" + orakezdes;
    }
    
    
  
}
