/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi3;

import java.util.Scanner;


public class Varos {
 
    public String nev;
    public int hofok;
 
    public Varos(String nev, int hofok) {
        this.nev = nev;
        this.hofok = hofok;
    }
 
    public String getNev() {
        return nev;
    }
 
    public void setNev(String nev) {
        this.nev = nev;
    }
 
    public int getHofok() {
        return hofok;
    }
 
    public void setHofok(int hofok) {
        this.hofok = hofok;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        String kvaros;
        
        String sor = sc.nextLine();
        
        String st[] = sor.split(" ");
        
        n= Integer.parseInt(st[0]);
       
        kvaros = st[1];
        
        int talaltvaros = 0;
        int talaltvarosho = 0;
 
        Varos varosok[] = new Varos[n];
        for(int i =0; i<n;i++){
            sor = sc.nextLine();
            st = sor.split(":");
            
            varosok[i]=new Varos(st[0],Integer.parseInt(st[1]));
            
            if(st[0].equals(kvaros)) {
                talaltvaros = 1;
                talaltvarosho = Integer.parseInt(st[1]);
            }
        }
 
       
        if(talaltvaros == 1){
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(varosok[i].getHofok() < varosok[j].getHofok()){
                        Varos tmp = varosok[i];
                        varosok[i] = varosok[j];
                        varosok[j] = tmp;
                    }
                }
            }
            
            for(int i=0;i<n;i++){
                
                if(varosok[i].getHofok()>talaltvarosho && !varosok[i].getNev().equals(kvaros)){
                    System.out.println(varosok[i].getNev() + " (" + varosok[i].getHofok() + ")");
                }
            }
           
        }else{
            System.out.println("Nincs adat\n");
        }
    }
}