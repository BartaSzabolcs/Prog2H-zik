/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi2;


public class Main {
      
    public static void main(String[] args) {
        Auto tombauto[]= new Auto[]{
          new Auto("aaa111", 321),
          new Auto("aab112", 123),
          new Auto("asd123",322),
          new Auto("bsd325",356),
          new Auto("zut123",111),
          new Teherauto("ter123", 256, 15),
          new Teherauto("zuh328", 365, 20),
          new Teherauto("lko986", 986, 23),
          new Teherauto("lok685", 999, 100),
          new Teherauto("loko", 8568, 25),
       };
        
     Teherauto tombt_auto[]=new Teherauto[]{
         new Teherauto("lok986", 658, 125),
         new Teherauto("lpl256", 256, 25),
         new Teherauto("ler236", 235, 15),
         new Teherauto("pol235", 785, 75),
         new Teherauto("weq256", 256, 256),
         new Teherauto("lko986", 658, 128),
         new Teherauto("llp644", 256, 25),
         new Teherauto("lrr654", 235, 18),
         new Teherauto("ppl543", 785, 75),
         new Teherauto("wqw264", 256, 27),   
     };
    
     for(Teherauto i: tombt_auto)
            System.out.println(i);
       
      rendezMaxSzíthatóTeherCsökkenőleg(tombt_auto);
        System.out.println("\n\n\n");
      for(Teherauto i: tombt_auto)
            System.out.println(i);
      
        System.out.println("\n"+keresMaxMotorTeljesítmény(tombauto));
      
    }
         public static void rendezMaxSzíthatóTeherCsökkenőleg(Teherauto []tombt_auto)
    {
             Teherauto tmp;
        for (int i=0; i<tombt_auto.length; i++)
            for(int j=i+1; j<tombt_auto.length; j++)
                if(tombt_auto[i].getMaxSzallitoTeher()<tombt_auto[j].getMaxSzallitoTeher()){
                    tmp=tombt_auto[i];
                    tombt_auto[i]=tombt_auto[j];
                    tombt_auto[j]=tmp;
                }   
    }
    
    public static Auto keresMaxMotorTeljesítmény(Auto []tombauto)
    {
        Auto max= new Auto("aaa111", 0);
        for(int i=0; i<tombauto.length; i++)
            if(tombauto[i] instanceof Auto && tombauto[i].getMotorTeljesitmény()>max.getMotorTeljesitmény())
                max=tombauto[i];
    
        return max;
    }
 

    
}
