package fénykép;

import java.util.Scanner;

public class Test {
        
    private static fényképezőgép fnyg[];           //legyen a tömb az Test osztály statikus adat tadja, ez egy változó deklaráció
    
    private static int hegyekSzáma(fényképezőgép fg){                                   
                String findString="/\\";                                                //amit keresünk /\
                int firstIndex=0;                                                           
                String str=fg.getFénykép();                                             //kinyerem a felvételt és tárolom az str be    
                int count=0;                                                            
                                                                                        ///\__/\_/\
                while (firstIndex!=-1){                                                                  
                    firstIndex=str.indexOf(findString, firstIndex);                     //indexof ami 2 paraméteres vár vissza adja az első előrodulásá
                                                                                        // 1. meghivom a felvételt vissza adja a 0                
                    if (firstIndex!=-1){                                                        
                        count++;                                                                    
                        firstIndex=firstIndex+findString.length();                       //hozzáadom a findStringet mert igy amit már találtunk a következőtől (/\) fogja inditani               
                    }
                }
                return count;
    }
    
    private static void rendez(fényképezőgép[] t){                                          
        for(int i=0;i<t.length-1;i++){                                                         //itt bejárjuok  
            for (int j=i+1;j<t.length;j++){                                                     
                if(t[i].getFénykép().length()<t[j].getFénykép().length()){                      //ha az i. elem kisebb mint a j edik akkor cseréljenek (felvételének a hossza)
                    fényképezőgép tmp =t[i];                                                    //
                    t[i]=t[j];                                                                      
                    t[j]=tmp;                                                                       
                }
                else if(t[i].getFénykép().length()==t[j].getFénykép().length()){                //ha a felvétel hossza egyenlő akkor /\ dönt
                    if (hegyekSzáma(t[i])==hegyekSzáma(t[j])){                                  //ha a hegyek száma is megegyezik
                        if (t[i].getMárka().compareTo(t[j].getMárka())>0){                      //comareTo össze hasonlítjuk ha > 0 akkor csere
                            fényképezőgép tmp =t[i];
                            t[i]=t[j];
                            t[j]=tmp;
                        }
                    } else if(hegyekSzáma(t[i])<hegyekSzáma(t[j])){
                            fényképezőgép tmp =t[i];
                            t[i]=t[j];
                            t[j]=tmp;
                    }
                  
                }
            }
        }
    }
    
    private static void kiir(fényképezőgép[] t){
        for (int i=0; i<t.length;i++){
            System.out.println(t[i]);
        }
    }
    
    public static void main(String[] args) {                    //először ezt irtuk meg
        
        int n;
        Scanner sc= new Scanner (System.in);            //olvasáshoz in nevesitett konstans
        n = Integer.parseInt(sc.nextLine());            //mérete a tömbnek ,nextLine metódus vissza adja a soron következő sort Stringbe 
                                                        //Integer az egész szám osztálya parseInt String argumentumot vissza adja 10 es számrendszerbeli szám ként
        fnyg = new fényképezőgép[n];                    //és amit a testben megadtuk itt használjuk  ami n elemű fényképezőgépeket tartalmazó tömb 
        
        for (int i=0; i<n; i++){                          //n darab sor beolvasása
            String sor = sc.nextLine();                   //beolvassuk a soron köetkező sor (beolvastuk a számot jöhet a következő)
            String st[] = sor.split(":");                 //sor ra meghivjuk a split metódus és mi mentén szeletelje szét a stringet vissza adja a string tömbt
            fnyg[i] = new fényképezőgép(st[0], st[1]);    //és ezt behelyezük a fényképezőgépbe s[0] tipus s[1] felvéte  ezt belerakjuka fnyg[i] elemére
        }
        rendez(fnyg);
            kiir(fnyg);    
        
            
    }
}