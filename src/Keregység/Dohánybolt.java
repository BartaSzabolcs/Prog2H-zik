/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Keregység;

import java.util.Arrays;
import java.util.Date;

public class Dohánybolt extends Keregység{
    
    private String [] cigaretták;
    
    public Dohánybolt(String név, String cím, Date megnyitás, String[] c){
        super (név, cím, megnyitás);
        this.cigaretták=c;
        
    }

    public String[] getCigaretták() {
        return cigaretták;
    }

    @Override
    public String toString() {
        return super.toString() + "cigarett\u00e1k=" + cigaretták;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Arrays.deepHashCode(this.cigaretták);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Dohánybolt))
            return false;
        Dohánybolt d=(Dohánybolt)obj;
        
        return super.equals(d) && Arrays.equals(this.cigaretták, d.getCigaretták()) ;
        
    }
    
}
