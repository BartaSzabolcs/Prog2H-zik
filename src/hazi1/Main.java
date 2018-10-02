/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1;

import com.sun.javafx.PlatformUtil;



public class Main{
    
    public static void elso(double a, double b, double c){
        double t[]={a,b,c};
        int i,j;
        
        for(i=0;i<t.length;i++){
            for(j=i+1;j<t.length;j++){
                if(t[i]>t[j]){
                    double tmp=t[i];
                    t[i]=t[j];
                    t[j]=tmp;
                }
            }
        }
        System.out.println(t[0]+" "+t[1]+" "+t[2]);
    }
    public static void masodik(double a,double b, double c){
        double t[]={a,b,c};
        double min=1000;
        double tmp=0;
        int i;
       for(i=0;i<t.length;i++){

              if(t[i]<min){
                  min=t[i];
        }}
        for(i=0; i<t.length; i++){    
        if(t[i]<0){
            t[i]=t[i]*-1;
        }}
        for(i=0;i<t.length; i++){  
        if(t[i]>tmp){
            tmp=t[i];
        }}
        
        System.out.println("Legkisebb szám: "+min);
        System.out.println("Az abszolutertekek maximuma: "+tmp); 
        
        
    }
    public static void harmadik(double a,double b,double c, double d){
        double t[]={a,b,c,d};
        System.out.println(a+" "+ b+ " "+ c+ " " +d);
        if(d>=0){
            System.out.println(a+" "+ c +" "+ b+" "+d);
        }else{
            System.out.println(a+" "+ b +" "+ d + " "+c);
        }
       
        
    }
    public static boolean negyedik(double a, double b, double c) {
       if(a+b>c && a+c>b && b+c>a && a>0 && b>0 && c>0){
           return true;
    } else{
           return false;
       }
         
    }
    public static int otodik(int a,int b){
        int i,db=0;
        if(a>b){
            for(i=b;i<a;i++){
                if(i%4==0 && i%100!=0 || i%400==0){
                    db++;
                }
            }
        }else{
            for(i=a;i<b;i++){
                if(i%4==0 && i%100!=0 || i%400==0){
                    db++;
                }
            }
        }
        return db;
    }
    public static void hatodik(int a) {
        switch(a){
            case 1:
                System.out.println("Elégtelen");
                break;
            case 2:
                System.out.println("Elégséges");
                break;
            case 3:
                System.out.println("Közepes");
                break;
            case 4:
                System.out.println("Jó");
                break;
            case 5:
                System.out.println("Jeles");
                break;
        }
       
    }
    public static int Osztas(int a,int b, int hanyados){
        hanyados=0;
         while(a>=b){
             hanyados++;
             a=a-b;
         }
      return hanyados;
    }
    public static boolean Prim_1(int n) {
        int osztok_sz=0;  
        int i;
        for(i=1;i<n;i++){
        if(n%i==0){
            osztok_sz++;
           
        }
        } 
        if(osztok_sz==2){
            return true;
        }else{
            return false;
        }
        
    }
    
    public static boolean Prim_2(int n, boolean valasz){
        valasz=true;
        int i;
        for(i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                valasz=false;
            }
        }
        
        return valasz;
    }
    public static void Fibonacci(int n) {
        int a= 0;
        int b= 1;
        int c=a+b;
        int k;
        if(n==1){
            System.out.println(a+" ");
        }
        else if(n==2){
            System.out.println(a+" "+b);
        }   
            System.out.println(a+" "+b+" "+c);
            k = 3;
        while(k<n){
            a=b;
            b=c;
            c=a+b;
            System.out.println(c+" ");
            k++;
        }
    }
    public static void Fibanacci2(int n) {
        int a=1;
        int b=0;
       int k;
       for(k=1;k<n;k++){
           System.out.println(b+" ");
           b=a+b;
           a=b-a;
       }
    }
    public static int Forditott_szam(int n){
        int ujszam=0;
        while(n!=0){
            int maradek=n%10;
            ujszam=ujszam*10+maradek;
            n=n/10;
        }
        return ujszam;
    }
    public static int tizenegy(int a) {
        int fakt=1;
        while(a>12 || a<0){
           System.out.println(a);
           break;
       }
        if(a==0){
            System.out.println("0!=1");
        }else{
            int i;
            for(i=1;i<=a;i++){
                fakt=fakt*i;           
            }
        }
        return fakt;
    }
    
    public static void tizenkettedik(int n1, int n2) {
        int k=5;
        int i;
        if(n1<n2){
            for(i=n1;i<=n2;i++){
                if(i%k==0){
                    System.out.print(i+" ");
                }
            }
        }else{
            for(i=n2;i<=n1;i++){
                if(i%k==0){
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println("\n");
    }
    public static int tizenharmadik(int n) {
        int b=0;
        int a=1;
        int i;
        for(i=0;;i++){
            if(b>n){
                return b;
            }
            b=a+b;
            a=b-a;
        }
    }
    
    public static void tizennegyedik(int alapszam) {
        for(int i=1; i<1000; i++)
        {
        int a=i;
        int maradek, osz=0;
        
        while(a!=0){
            maradek=a%10;
           a=a/10;
           osz=maradek*maradek*maradek+osz;  
                }
        if(osz==i)
            System.out.print(i+" ");
        }
        

        
        
    }
        
    
    
    
    public static void main(String[] args) {
        
        System.out.println("Elso feladat!");
        
        Pont p1 = new Pont(1,1);
        Pont p2 = new Pont(5,3);
        Pont p3 = new Pont(9,4);
        Pont p4 = new Pont(2,3);
        
     
   p1.sety(p1.gety()+5);
   p2.sety(p2.gety()+5);
   p3.setx(p3.getx()-3.4);
   p4.setx(p4.getx()-3.4);
   
        System.out.println("1x: "+p1.getx()+" y:" + p1.gety());
        System.out.println("2x: "+p2.getx()+" y:" + p2.gety());
        System.out.println("3x: "+p3.getx()+" y:" + p3.gety());
        System.out.println("4x: "+p4.getx()+" y:" + p4.gety());
        
        
    

   
        System.out.println("\nMasodik Feladat!\n");
         
        RegualPolygon elso =new RegualPolygon();
        RegualPolygon masodik= new RegualPolygon(6,4);
        RegualPolygon harmadik = new RegualPolygon(10,4,5.6,7.8);
        
        System.out.println("elso kerulete " + elso.getPerimeter(elso.n ,elso.side) +" terulete: " + elso.getArea(elso.n,elso.side));
        System.out.println("masodik kerulete "+ masodik.getPerimeter(masodik.n ,masodik.side)+" terulete: "+ masodik.getArea(masodik.n,masodik.side));
        System.out.println("haramdik kerulete: "+harmadik.getPerimeter(harmadik.n,harmadik.side)+" terulete: "+harmadik.getArea(harmadik.n,harmadik.side));
        
        System.out.println("\n Harmadik Feladat!\n");
        
        Rectangle t1= new Rectangle(4,40);
        Rectangle t2= new Rectangle(3.5,3.59);
        
        System.out.println("Az első téglalap szélessége: "+t1.width+" A második téglalap szélessége "+t2.width);
        System.out.println("A első téglalap magassága: "+t1.height +" A második téglalap magassága: "+t2.height);
        System.out.println("A első téglalap területe: "+t1.getArea()+" A második téglalap területe: "+t2.getArea());
        System.out.println("A első téglalap kerülete: "+t1.getPerimeter()+" A második téglalap kerülete: "+t2.getPerimeter());
        
        System.out.println("\n Negyedik Feladat!\n");
        
        Ital term1= new Ital("Coca-Cola","6dl");
        System.out.println("A termék "+ term1.getNév()+ " " + term1.getKiszerelés()+" " + term1.getGyártásiDátum()); // ez itt nem biztos
        
        System.out.println("\n Ötödik Feladat!\n");
        
        QuadraticEquation e1= new QuadraticEquation(3, 5, 7);
        QuadraticEquation e2= new QuadraticEquation(20, 45, 12);
        QuadraticEquation e3= new QuadraticEquation(0, 0, 0);
        
        if(e1.getDiscriminant()>0){
        
            System.out.println("Az első Gyökei: "+e1.getRoot1()+ " " +e1.getRoot2());
        
        } else if(e1.getDiscriminant() == 0){
            System.out.println("0");
        }else{ 
                System.out.println("The equation has no roots.");
        }
        
        if(e2.getDiscriminant()>0){
        
            System.out.println("A második Gyökei: "+e2.getRoot1()+ " " +e2.getRoot2());
        
        } else if(e2.getDiscriminant() == 0){
            System.out.println("0");
        }else{ 
                System.out.println("The equation has no roots.");
        }
        
        if(e3.getDiscriminant()>0){
        
            System.out.println("A harmadik Gyökei: "+e3.getRoot1()+ " " +e3.getRoot2());
        
        } else if(e3.getDiscriminant() == 0){
            System.out.println("0");
        }else{ 
                System.out.println("The equation has no roots.");
        }
       
        
                
        System.out.println("\n Hatodik Feladat!\n");
        
        LinearEquation le1=new LinearEquation(6, 10, 9, 5, 7, 8);
        LinearEquation le2=new LinearEquation(-2, -4, -6, -8, -10, -12);
        LinearEquation le3=new LinearEquation(0, 0, 0, 0, 0, 0);
       
        if(le1.isSolvable()==0){
            System.out.println("The equation has no solution.");
        }else{
            System.out.println("X eredmény: "+le1.getX()+ " Y eredmenye: "+le1.getY());
        }
        
        if(le2.isSolvable()==0){
            System.out.println("The equation has no solution.");
        }else{
            System.out.println("X eredmény: "+le2.getX()+ " Y eredmenye: "+le2.getY());
        }
        
        if(le3.isSolvable()==0){
            System.out.println("The equation has no solution.");
        }else{
            System.out.println("X eredmény: "+le3.getX()+ " Y eredmenye: "+le3.getY());
        }
     
        System.out.println("E eredmény: "+le1.getE()+ " F eredménye: "+le1.getF());
    
        System.out.println("\n II.Rész! \n");
        
        System.out.println("Első feladat!");
        elso(-2.3,30.5,15.2);
        
        System.out.println("\nMásodik feladat!");
        masodik(-2.5,-300.4,1002.6);
        
        System.out.println("\nHarmadik feladat!");
        harmadik(12.1, 21.3 , 3.15 , 0);
        
        System.out.println("\nNegyedik feladat!");
        System.out.println(negyedik(3,4,5));
        
        System.out.println("\nÖtödik feladat!");
        System.out.println(otodik(2000,2010));
        
        System.out.println("\nHatodik feladat!");
        hatodik(4);
        
        System.out.println("\nHetedik feladat!");
        System.out.println(Osztas(25, 2, 2));
        
        System.out.println("\nNyolcadik feladat!");
        System.out.println(Prim_1(11));
    
        System.out.println("\nNyoldadik2 feladat!");
        System.out.println(Prim_2(11, true));
        
        System.out.println("\nKilencedik feladat!");
        Fibonacci(7);
        
        System.out.println("\nKilencedik2 feladat!");
        Fibanacci2(7);
        
        System.out.println("\nTizedik feladat!");
        System.out.println(Forditott_szam(123));
        
        System.out.println("\nTizenegyedik feladat!");
        System.out.println(tizenegy(15));
    
        System.out.println("\nTizenkettedik feladat!");
        tizenkettedik(20, 30);
        
        System.out.println("\nTizenharmadik feladat!");
        System.out.println(tizenharmadik(7));
        
        System.out.println("\nTizennegyedik feladat!");
        tizennegyedik(1000);
    }


}
