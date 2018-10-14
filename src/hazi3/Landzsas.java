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
public class Landzsas extends Katona {

   public Landzsas(int Támadóerő, int Védelem) {
        super(Támadóerő, Védelem);
    }
       @Override
    public String toString() {
        return "Landzsas: TE: [" + super.getTámadóerő() +"], VE: [" + super.getVédelem() + "]";
    }
    
    
}
