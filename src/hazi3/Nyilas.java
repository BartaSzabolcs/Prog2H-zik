/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi3;


    public class Nyilas extends Katona {
 
    private int lotav;
    
    public int getLotav() {
        return lotav;
    }
 
    public void setLotav(int lotav) {
        this.lotav = lotav;
    }
 
    @Override
    public int getTámadóerő(){
        return super.getTámadóerő() + lotav;
    }
 
    public Nyilas(int Támadóerő, int Védelem, int lotav) {
        super(Támadóerő, Védelem);
        this.lotav = lotav;
    }
 
    @Override
    public String toString() {
        return "Nyilas: TE: [" + (super.getTámadóerő()+lotav) +"], VE: [" + super.getVédelem() + "]";
    }
 
    @Override
    public boolean equals(Object o) {
        
        if (o==null ||!(o instanceof Nyilas)) 
         return false;
        if (!super.equals(o))
            return false;
        Nyilas nyilas = (Nyilas) o;
        return Integer.compare(nyilas.getLotav(), getLotav()) == 0;
    }
}

