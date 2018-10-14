/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi3;

import java.util.Scanner;

/**
 *
 * @author Yeti
 */
public class Hullamvasutak {
    
    private static  Hullamvasutseged tomb[];
    
    public static void varakozasrendez(Hullamvasutseged a[]){
        
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
            if(a[j].getVarakozasi_ido()<a[i].getVarakozasi_ido()){
                Hullamvasutseged tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
                
            }else if(a[i].getVarakozasi_ido()==a[j].getVarakozasi_ido()){
                if(a[j].getLegkisebb_magassag()>a[i].getLegkisebb_magassag()){
                    Hullamvasutseged tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
                
                }else if(a[i].getHullamvasut_neve().compareTo(a[j].getHullamvasut_neve())>0){
                    Hullamvasutseged tmp=a[j];
                a[j]=a[i];
                a[i]=tmp;
                }
            }
        }
    }       
  }
    public static void kiir(Hullamvasutseged t[]){
            for(int i=0;i<t.length;i++){
                System.out.println(t[i]);
           }
            
        }
    public static void main(String[] args) {
       
    
    int n;
    
    Scanner sc = new Scanner(System.in);
    n= Integer.parseInt(sc.nextLine());    
    tomb = new Hullamvasutseged[n];
    
    for(int i=0;i<n;i++){
        String sor = sc.nextLine();
        String st[]= sor.split(";");
        int k= Integer.parseInt(st[2]);
        int j= Integer.parseInt(st[3]);
        tomb[i]= new Hullamvasutseged(st[0], st[1], k, j);
    }
        varakozasrendez(tomb);
        System.out.println("\n");
    kiir(tomb);
        
}
    
}