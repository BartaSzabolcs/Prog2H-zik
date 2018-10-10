/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi2;


public class TestCircleRectangle {
  public static void main(String[] args) {
 Circle circle = new Circle(1.0);
 System.out.println("A circle " + circle.toString());
 System.out.println("The radius is " + circle.getRadius());
 System.out.println("The area is " + circle.getArea());
 System.out.println("The diameter is " + circle.getDiameter());

 Rectangle rectangle = new Rectangle(2.0, 4.0);
 System.out.println(System.getProperty("line.separator") + "A rectangle " +
rectangle.toString());
 System.out.println("The area is " + rectangle.getArea());
 System.out.println("The perimeter is " + rectangle.getPerimeter());
 
  
      System.out.println("\nMasodik feladat!\n"); 
      
   double o1=1.0;
   double o2=1.5;
   double o3=1.0;

   String szin="yellow";

   Triangle Hszog= new Triangle(szin, true, o1, o2, o3);
   System.out.println("Haromszog terulete: "+Hszog.getArea()+" Haromszog kerulete: "+Hszog.getPerimeter()+"\nHaromszog szine: "
           +Hszog.getColor()+" Haromszog kitoltott? "+Hszog.isFilled()+"\n");
  
  
  
  
  }

}


