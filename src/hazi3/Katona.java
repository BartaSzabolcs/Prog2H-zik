/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi3;


public class Katona {

    private int támadóerő;
    private int védelem;
    
    public Katona(){
        this.támadóerő=5;
        this.védelem=5;
        
        
    }
    public Katona(int támadóerő, int védelem){
        this.támadóerő=támadóerő;
        this.védelem=védelem;
    }
    
    public int getTámadóerő(){
        return támadóerő;
    }

    public int getVédelem() {
        return védelem;
    }
   

    public void setVédelem(int védelem) {
        this.védelem = védelem;
    }

    public void setTámadóerő(int támadóerő) {
        this.támadóerő = támadóerő;
    }

    @Override
    public String toString() {
        return "TE[támadó erő]: "+ támadóerő+"VE[védelmi erő]: "+védelem;
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.támadóerő;
        hash = 73 * hash + this.védelem;
        return hash;
    }

    

   
//Felulirjuk az osszehasonlito fuggvenyt.
    @Override
    public boolean equals(Object obj) {
        // Ha a jelenlegi objektum amit hasznalunk es az osszehasonlitani valo objektum megegyezik akkor true, ez easy.
        if (obj == null || !(obj instanceof Katona)) return false;
        // az instanceof operatorral megtudjuk nezni hogy egy objektum az adott osztalyba tartozik-e
        // itt azt vizsgaljuk hogyha nem ebbe az osztalyba tartozik akkor mar alapbol hamis.
        //!(obj instanceof Katona)
        // Itt letrehozunk egy katona objektumot az osszehasonlitani kivant objektumbol
        // mivel mar elotte megneztuk hogy ebbe az oszalyba tartozik
        Katona katona = (Katona) obj;
        // Itt pedig a compare fuggvennyel osszehasonlitjuk az a ket objektum tamado es vedekezoerejet,
        // ami majd visszaad egy boolean erteket vagyis vagy igazt, vagy hamist.
        return Integer.compare(katona.getTámadóerő(), getTámadóerő()) == 0 &&
                Integer.compare(katona.getVédelem(), getVédelem()) == 0;
    }
    
    
    
}
