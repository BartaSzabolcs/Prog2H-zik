/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi3;

/**
 *
 * @author Yeti
 */
public class Teszt {
    
    public static Katona megkuzd(Katona a, Katona b){
        System.out.println("Első katona: " + a.toString() + " vs Második katona: " + b.toString());
        if(a.getTámadóerő()-b.getVédelem()==b.getTámadóerő()-a.getVédelem()){
                    System.out.println("Első katona nyert");
            return a;
        }
        if(a.getTámadóerő()-b.getVédelem()>b.getTámadóerő()-a.getVédelem()){
                    System.out.println("Első katona nyert");
            return a;
        }
                else{
                        System.out.println("Második katona nyert");
            return b;
        }
    }
    
    public static void main(String[] args) {
        
        Landzsas Arni = new Landzsas(150, 150);
        Landzsas Bobi = new Landzsas(125,50);
        Nyilas RobinHood =new Nyilas(250,100,120);
        
        megkuzd(megkuzd(Arni,Bobi),RobinHood);
    }
    
}
