/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1;

import java.util.Date;


public class Ital {
 protected String név;
 protected String kiszerelés;
 private static int ár=10;
 protected Date gyártásiDátum;

        public Ital(String név,String kiszerelés){
            this.név=név;
            this.kiszerelés=kiszerelés;
            this.gyártásiDátum= new Date();
        }

    public void setNév(String név) {
        this.név = név;
    }

    public void setKiszerelés(String kiszerelés) {
        this.kiszerelés = kiszerelés;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    public void setGyártásiDátum(Date gyártásiDátum) {
        this.gyártásiDátum = gyártásiDátum;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }
    
    @Override
    public String toString() {
        return "A termnék neve: " + név + " kiszerelése " + kiszerelés +" ennyibe kerül: "  + ár +"Ft";
    }

    public boolean equals(String név ,String kiszerelés, int ár) {
        return super.equals(true); 
    }
    
    public static int getÁrEuróban(){
        return ár*324;                        //2018.09.25 én
    }
        
    }
        



