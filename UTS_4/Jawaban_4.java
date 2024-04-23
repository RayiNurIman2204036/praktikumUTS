/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_4;

import java.util.Scanner;

/**
 *
 * @author Rayin
 */

class Balok{
    int panjang;
    int lebar;
    int tinggi;
    
    Balok(){
        panjang = 1;
        lebar = 1;
        tinggi = 1;
    }
    
    Balok(int panjangBaru, int lebarBaru, int tinggiBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }
    
    int getLuas(){
        return (2 *((panjang *lebar)+(panjang*tinggi)+(lebar*tinggi))) ;
        }
    int getKeliling(){
        return (4*(panjang + lebar + tinggi));
        }
    
    int getVolume(){
        return (panjang * lebar * tinggi);
        }
    
    void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    void setLebar(int lebarBaru){
        lebar = lebarBaru;
        }
    void setTinggi(int tinggiBaru){
        tinggi = tinggiBaru;
        }
    }

public class Jawaban_4 {
    
    public static void main(String[] args) {
        
    Balok Balok1 = new Balok();
    
        Scanner bilangan = new Scanner(System.in);
        System.out.printf("Masukan panjang, lebar, dan tinggi balok: ");
        int panjang = bilangan.nextInt();
        int lebar = bilangan.nextInt();
        int tinggi = bilangan.nextInt();
    Balok Balok2 = new Balok(panjang, lebar, tinggi);
    
        System.out.printf("Masukan panjang, lebar, dan tinggi balok: ");
        bilangan = new Scanner(System.in);
        panjang = bilangan.nextInt();
        lebar = bilangan.nextInt();
        tinggi = bilangan.nextInt();    
    Balok Balok3 = new Balok(panjang, lebar, tinggi);      
        System.out.println("Balok dengan panjang "+Balok1.panjang +", lebar : " + Balok1.lebar+", tinggi : " + Balok1.tinggi + " Luasnya : "+ Balok1.getLuas()+", sedangkan Kelilingnya : " + Balok1.getKeliling()+", dan volumenya : "+ Balok1.getVolume());
        System.out.println("Balok dengan panjang "+Balok2.panjang +", lebar : " + Balok2.lebar+", tinggi : " + Balok2.tinggi + " Luasnya : "+ Balok2.getLuas()+", sedangkan Kelilingnya : " + Balok2.getKeliling()+", dan volumenya : "+ Balok2.getVolume());
        System.out.println("Balok dengan panjang "+Balok3.panjang +", lebar : " + Balok3.lebar+", tinggi : " + Balok3.tinggi + " Luasnya : "+ Balok3.getLuas()+", sedangkan Kelilingnya : " + Balok3.getKeliling()+", dan volumenya : "+ Balok3.getVolume());
    }
}
