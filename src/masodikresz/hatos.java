/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masodikresz;

public class hatos {
    
    public static boolean isConsecutiveFour(int[] values){
       
        int count=1;
        int tmp=values[0];
        
        
        for(int i=1;i<values.length;i++){
           
               if(count==4){
                return true;             
           }if(values[i]==tmp){
               count++;
           }else{
                   count=1;
                   tmp=values[i];
               }
                  
               
      }
        return false;
    }
    public static void main(String[] args) {
       int values[]={1,2,2,2,3,4,2};
        System.out.println(isConsecutiveFour(values));
    }
}
