/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi3;

import java.util.Scanner;


public class Szotar {
    
    private String angol_szo;
    private String magyar_szo;

    public Szotar(String angol_szo, String magyar_szo) {
        this.angol_szo = angol_szo;
        this.magyar_szo = magyar_szo;
    }

    public String getAngol_szo() {
        return angol_szo;
    }

    public void setAngol_szo(String angol_szo) {
        this.angol_szo = angol_szo;
    }

    public String getMagyar_szo() {
        return magyar_szo;
    }

    public void setMagyar_szo(String magyar_szo) {
        this.magyar_szo = magyar_szo;
    }

    @Override
    public String toString() {
        return  angol_szo + ":" + magyar_szo;
    }
   
    public static void rendez(Szotar[] t){
        
        for(int i=0;i<t.length-1;i++){
            for(int j=i+1;j<t.length;j++){
                if(t[i].getAngol_szo().compareTo(t[j].getAngol_szo())>0){
                    Szotar tmp= t[i];
                    t[i]=t[j];
                    t[j]=tmp;
                }else if(t[i].getAngol_szo().compareTo(t[j].getAngol_szo())==0){
                  if(t[i].getMagyar_szo().compareTo(t[j].getMagyar_szo())>0){
                    Szotar tmp= t[i];
                    t[i]=t[j];
                    t[j]=tmp;
                }
                }
            }
        }
      
    }
    public static void kiir(Szotar[] t){
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]);
        }
    }
   
    
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        Szotar []tomb = new Szotar[n];
        
        for(int i=0;i<n;i++){
            String sor= sc.nextLine();
            String st[]= sor.split(":");
            tomb[i]= new Szotar(st[0],st[1]);
            
        }
        System.out.println("\n");
        rendez(tomb);
        kiir(tomb);
       
        
        
    }
    
}
