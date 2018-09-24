/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Main {
    
    public static int lnko(int a,int b){
        int r;
        do{
            r=a%b;
            a=b;
            b=r;
            
        }while(r!=0);
        
        return a;
    
    }
    
    public static boolean palszam(int szam){
        int masolat=szam;
        int újszam=0;
        while(szam>0){
            int szj=szam%10;
            újszam=újszam*10+szj;
            szam=szam/10;
        }
        return újszam==masolat;
    }
    
    
    
    
    public static void main(String[] args) {
        
      /*  //1. feladat Rectangle.java
        
        Rectangle defRect = new Rectangle();    //default konstruktor = nem kap parametereket
        Rectangle newRect = new Rectangle(2, 3.5);    // nem default, kap parametereket
        
        System.out.println(defRect);
        System.out.println("A teglalap terulete = " + newRect.getArea());
        System.out.println("A teglalap kerulete = " + newRect.getPerimeter());
        System.out.println(newRect.getHeight());
        newRect.setHeight(7);
        System.out.println(newRect.getHeight());       
        
        //2. feladat QEquation.java
        
        QEquation first = new QEquation(1, 2, 3);
        QEquation second = new QEquation(2, 4, 1);
        
        System.out.println("First root of first equation " + first.getRoot1());
        System.out.println("Second root of first equation " + first.getRoot2());
        System.out.println("First root of second equation " + second.getRoot1());
        System.out.println("Second root of second equation " + second.getRoot2());
        
        //3. feladat Account.java
        
        //Account ac;
        System.out.println(Account.getAnnualIR()); //osztályszintű változó, nincs példányosítva mégis létezik ez a változó
     
        
        
        Account egye1 = new Account();
        Account egye2 = new Account(1,10000);
        Account egye3 = new Account(2,20000);
        */
        
        final double pi=3.14;
        
        Fan f=new Fan();
        System.out.println(f);
        f.setOn(true);
        f.setSpeed(Fan.fast);
        System.out.println(f);
        System.out.println(Math.PI);
        
        System.out.println(lnko(360,225));
        
        System.out.println(palszam(121));      
                
                
                
        
        
        
    }
    
}
