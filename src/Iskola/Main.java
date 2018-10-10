/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

import java.util.Scanner;


public class Main {
    
    public static Ora ora[];
    
    private static void orak(Orarend o){
    
    String str=o.getNap();
    int oraszam=o.getSzamlalo();
    
        
    }
    public static void main(String[] args) {
        int n;
    Scanner sc = new Scanner(System.in);  
    n= Integer.parseInt(sc.nextLine());  
    ora= new Ora[n];
    
       
    for(int i=0;i<n;i++){
             String sor=sc.nextLine();    
             String st[]= sor.split(":");   
             ora[i]= new Ora(st[0], st[1]);
    }
}
}