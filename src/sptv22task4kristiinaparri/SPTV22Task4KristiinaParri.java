/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22task4kristiinaparri;
import java.util.Random;
/**
 *
 * @author admin
 */
public class SPTV22Task4KristiinaParri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random(); 
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            int a = rd.nextInt(99);
            if (a%2 == 1){
                arr[i] = a; 
            }
        }
        
        for (int i = 0; i < arr.length; i++) { 
                String sep = "\t"; 
                if ((i+1) % 10 == 0 || i+1 == arr.length) 
                    sep = "\n";   
                System.out.print(arr[i] + sep);
        }
        
        int length = arr.length;
        
        int sum = 0;
 
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
 
        double average = sum / length;
         
        System.out.println("Среднее число всего массива "+average);
        
    }
}
        
        
    
    

    

