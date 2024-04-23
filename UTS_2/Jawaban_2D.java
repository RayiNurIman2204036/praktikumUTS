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
public class Jawaban_2D {
    static void Pattern_D(int N){
        int i,j,k;
        for(i= 0;i<=N;i++){
            for(j = 1 ; j <= i ;j++ ){
              System.out.printf("  ");  
                }
            for(k = 1; k<=N-i;k++){
                System.out.printf("%d ",k);
                    }
            System.out.println("   ");
            }
    }
    
         public static void main(String[] args) {
    Scanner integer = new Scanner(System.in);

       System.out.print("Masukan N: ");
        int N = integer.nextInt();
    Pattern_D(N);
    }
}
