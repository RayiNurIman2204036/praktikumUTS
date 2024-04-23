/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_2;

import java.util.Scanner;

/**
 *
 * @author Rayin
 */
public class Jawaban_2C {
    static void Pattern_C(int N){
        int i,j,k;
         for(i = N ; i>0;i--){
            for(j = 0 ; j < i-1 ;j++ ){
              System.out.printf("  ");  
                }
            for(k = N - j ; k > 0 ;k-- ){
              System.out.printf(" %d",k);  
                }
            System.out.println("  ");
            }
    }
    
         public static void main(String[] args) {
    Scanner integer = new Scanner(System.in);

       System.out.print("Masukan N: ");
        int N = integer.nextInt();
    Pattern_C(N);
    }
}
