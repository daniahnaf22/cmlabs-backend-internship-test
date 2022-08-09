/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmlab.backend.internship.test;

/**
 *
 * @author Dani Ahnaf
 */
 public class Main {  
   public static void main(String[] args) {  
     String nama = "Al Bahri";  
     String nim = "-";  
     String mkul = "Pemrograman Berbasis Object";  
     for(int i = 1; i <= 100; i++) {  
       if ((i % 3 == 0) && (i % 5 == 0))  
         System.out.println("fizzbuzz");  
       else if ((i % 3) == 0)  
         System.out.println("fizz");  
       else if ((i % 5) == 0)  
         System.out.println("buzz");  
       else  
         System.out.println(i);  
     }  
     System.out.println("=======================================================");  
     System.out.println("Nama      : " +nama);  
     System.out.println("NIM     : " +nim);  
     System.out.println("M. Kul     : " +mkul);  
     System.out.println("Dosen Pembimbing  : Haritz");  
     System.out.println("=======================================================");  
   }  
 }  