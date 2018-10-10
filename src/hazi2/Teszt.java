/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi2;





public class Teszt {
    private static Kocsma[] adottItaltKínálóKocsmák(String ital,VendeglatoipariEgyseg[] kocs){
        
        int count =0;
        
        for(int i=0;i<kocs.length;i++){                         
            if(kocs[i] instanceof Kocsma){
                Kocsma p=(Kocsma)kocs[i];
             for(int j=0;j<p.getSörlap().length;j++){           
                  if(p.getSörlap()[j].equals(ital)){
                    count++;  
             }
        }   
  }
}   

        Kocsma[] pub= new  Kocsma[count];
        int k=0;
        
        for(int i=0;i<kocs.length;i++){                         
            if(kocs[i] instanceof Kocsma){
                Kocsma p=(Kocsma)kocs[i];
              for(int j=0;j<p.getSörlap().length;j++){           
                  if(p.getSörlap()[j].equals(ital)){
                    pub[k]=p;
                      k++;
                  }
              }  
        }    
    }
        return pub;
        }
        
    
    
    public static void main(String[] args) {
        VendeglatoipariEgyseg[] kocs= new VendeglatoipariEgyseg[]{
            new Kocsma("Arany facan", 25, true, new String[]{"Borsodi", "Aranyászok", "Steffi"}),
            new Kocsma("Aranyos", 40, true, new String[]{"Borsodi","Aranyászok","Soproni"}),
            new Kocsma("Aranyos", 40, true, new String[]{"Borsodi","Kaisler","Soproni"}),
            new Kocsma("Aranyos", 40, true, new String[]{"Kaisler","Aranyászok","Soproni"}),
            new Kocsma("Aranyos", 40, true, new String[]{"Borsodi","Aranyászok","Kaisler"}),
            new Étterem("Egyed", 95, false, new String[]{"Gulyás leves","Paradicsom leves", "Hús leves"}),
            new Étterem("Fogyassz", 95, false, new String[]{"Gulyás leves","Spenót leves", "Hús leves"}),
            new Étterem("Borravalót nefeledd", 95, false, new String[]{"Csirke pörkölt","Paradicsom leves", "Hús leves"}),
            new Étterem("Nincs neve", 95, false, new String[]{"Gulyás leves","Marha pörkölt", "Hús leves"}),
            new Étterem("Van neve", 95, false, new String[]{"Gulyás leves","Sült burgonya", "Hús leves"})
    };
        Kocsma[] kiir=adottItaltKínálóKocsmák("Steffi",kocs);
        
        for(Kocsma kocsma:kiir)
                                               
            System.out.println(kocsma);
}
}
       