/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fénykép;

public class fényképezőgép {
    
    private String márka;
    private String fénykép;
    

    public fényképezőgép(String mérka, String fénykép) {
        this.márka = márka;
        this.fénykép = fénykép;
    }

    public String getMárka() {
        return márka;
    }

    public String getFénykép() {
        return fénykép;
    }

    @Override
    public String toString() {
        return "f\u00e9nyk\u00e9pez\u0151g\u00e9p{" + "m\u00e9rka=" + márka + ", f\u00e9nyk\u00e9p=" + fénykép + '}';
    }
    
    
}
