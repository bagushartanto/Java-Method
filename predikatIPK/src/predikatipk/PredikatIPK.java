/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predikatipk;

/**
 *
 * @author user
 */
public class PredikatIPK {
    static void checkIPK(double ipk){
        if (ipk > 3.5){
         System.out.println("caumlude");
        
        }
        else if (ipk > 3.0){
            System.out.println("Sangat Memuaskan");
        }
        else if (ipk > 2.75){
           System.out.println("Memuaskan"); 
        }
        else if (ipk > 2.5){
           System.out.println("Cukup"); 
        }
        else {
           System.out.println("jelek.kuliah ngapain aja");  
        }
    /**
     * @param args the command line arguments
     */}

    public static void main(String[] args) {
        // TODO code application logic here
        checkIPK(3.2);
        
        
    }
    
}
