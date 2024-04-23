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
public class Jawaban_2B {
    static void Pattern_B(int N){
        for(int i = N ; i>=1;i--){
            for(int j = 1 ; j <= i ;j++ ){
              System.out.printf("%d ",j);  
                }
            System.out.println(" ");
            }
    }
    
         public static void main(String[] args) {
    Scanner integer = new Scanner(System.in);

       System.out.print("Masukan N: ");
        int N = integer.nextInt();
    Pattern_B(N);
    }
}
