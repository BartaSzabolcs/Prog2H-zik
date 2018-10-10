/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi2;


public class Teherauto extends Auto{
    
    private int maxSzallitoTeher;
    
    public Teherauto(String rendszam, int motorTeljesitmeny, int maxSzallitoTeher) {
        super(rendszam, motorTeljesitmeny);
        this.maxSzallitoTeher=maxSzallitoTeher;
    }

    public int getMaxSzallitoTeher() {
        return maxSzallitoTeher;
    }

    @Override
    public String toString() {
        return "Teherauto " + " maxSzallitoTeher= " + maxSzallitoTeher;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.maxSzallitoTeher;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teherauto other = (Teherauto) obj;
        if(this.maxSzallitoTeher != other.maxSzallitoTeher){
            return false;
        }
        return true;
    }
    
}
