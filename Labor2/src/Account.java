
import java.util.Date; //dátum használatához importáljuk

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Account {
    
    private int id;
    private double balance;
    private static double annualIR = 10; //static, osztályszintű változókat (metódusokat) 
                                        //jelölünk így; akkor is elérhetőek ha nincs 
                                        //példányosítva (nem kötődik adott példányhoz)
    private Date dateCreated;

    public Account(){
        this.id=0;
        this.balance=0;
        this.dateCreated=new Date();
                                       
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated =new Date();
    }
    public int getID(){
        return this.id;
    }
    
    public void setID(int v){
        this.id= v;
    }
    public double getbalance(){
        return this.balance;
    }
    public void setBalance(double v){
        this.balance=v;
    }
    public Date getDateCreated(){
        return this.dateCreated;
    }
    
    
    public static double getAnnualIR() {
        return annualIR;
    }
    public static void setAnnualIR(double v){
        annualIR=v;
    }
    
    public static double getHaviAIR(){
        return annualIR/12;
    }
    
    public void withdraw(double pénz){
        this.balance= this.balance-pénz;
    }
    
    public void desposit(double pénz){
        this.balance=this.balance+pénz;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", Egyenlege=" + balance + ", Számla létrejötte=" + dateCreated + '}';
    }
    
    
    
    
    
    
    
}
