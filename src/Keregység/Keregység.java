/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Keregység;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author hallgato
 */
public class Keregység {
    
    private String név;
    private String cím;
    private Date megnyitás;

    public Keregység(String név, String cím, Date megnyitás) {
        this.név = név;
        this.cím = cím;
        this.megnyitás = megnyitás;
    }

    public String getNév() {
        return név;
    }

    public String getCím() {
        return cím;
    }

    public Date getMegnyitás() {
        return megnyitás;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    @Override
    public String toString() {
        return "Keregys\u00e9g{" + "n\u00e9v=" + név + ", c\u00edm=" + cím + ", megnyit\u00e1s=" + megnyitás + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.név);
        hash = 29 * hash + Objects.hashCode(this.cím);
        hash = 29 * hash + Objects.hashCode(this.megnyitás);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Keregység)) //obj létezik és kereskedelmi egység is
            return false;
        
        Keregység k= (Keregység) obj;
        
        return this.cím.equals(k.getCím()) &&
        this.megnyitás==k.getMegnyitás();
        
    }
    
    
    
    
}
