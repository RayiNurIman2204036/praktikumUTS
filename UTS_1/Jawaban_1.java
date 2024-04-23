/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_1;

import java.util.Scanner;
/**
 *
 * @author Rayin
 */
public class Jawaban_1 {
    public static void main(String[] args) {
        
        Scanner integer = new Scanner(System.in);

        System.out.print("Masukan tiga digit integer: ");
        int n = integer.nextInt();
        
        int d1 = n / 100 ;
        int d2 = n % 10 ;
        
        if(d1 == d2)
            {System.out.printf("%d adalah palindrom\n",n);}
        else{System.out.printf("%d bukan palindrom\n",n);}
    }
}
