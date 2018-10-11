package Keregység;

import java.util.Date;

public class Main {
    
    private static Pékség[] adottPékárutÁrusítóP(String psüti, Keregység[] ker){
        int count=0;
        
        for(int i=0;i<ker.length;i++){
            if(ker[i] instanceof Pékség){             //meg kell nézni hogy benne van-e az osztályba hogy pékség-e 
                Pékség p=(Pékség)ker[i];                //ezt kirakjuk egy változóba(kasztoljuk) és belerakjuk a p-be a pékségeket 
                for(int j=0;j<p.getPékÁruk().length;j++){   //végig megyünk a péksütik tömbjén
                    if(p.getPékÁruk()[j].equals(psüti)){    //metódus hivás és ez egy tömb ennek a helyén tömb van az elemére [j] az egész vissza ad egy stringet 
                                                            //és azt a sztringet hasonlitom a pékes stringel és ha megegyezik akkor növelem a db számát
                     count++;
                    }
                }
            }
        }
        int k=0;                                                            
        Pékség[] pékség = new Pékség[count];                   //itt a [count] megmondja hány eleme van és most már bele kell rakni az adott péksütit 
        for(int i=0;i<ker.length;i++){                        //ugyan azt kell        
            if(ker[i] instanceof Pékség){                               
                Pékség p=(Pékség)ker[i];                                    
                for(int j=0;j<p.getPékÁruk().length;j++){                   
                    if(p.getPékÁruk()[j].equals(psüti)){        //ha találtam              
                     pékség[k]=p;                               //belerakjuk    
                     k++;                                       //és növelem
                    }
                }
            }
        }
        return pékség;
    }
    
    public static void main(String[] args) {
        Keregység [] ker = new Keregység[] {
            new Pékség("Aranycipó", "Egy. 1", new Date(), new String[]{"kifli","pogácsa","kenyér"}),
            new Pékség("Spar", "Egy. 2", new Date(), new String[]{"kifli","pogácsa","Kakoscsiga"}),
            new Dohánybolt("Ronson","Egy. 3", new Date(), new String[]{"Kent","Bond"}),
            new Pékség("buci", "Egy. 4", new Date(), new String[]{"zsemle","pogácsa","kenyér"})
        };
        
        Pékség[] pék = adottPékárutÁrusítóP("kenyér", ker);             //meghivjuk és megkeressük 
        for(Pékség p:pék){                                              //objektum bejárásra  for(a bejárandó objektum tipus változó: bejárandó objektum) nem az indexetet nézi hanem belemászik a tömbbe és az okjektumokat veszi fel
            System.out.println(p);
        }
    }
}
