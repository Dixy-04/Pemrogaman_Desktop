/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;

/**
 *
 * @author Dixy
 */

import java.util.Scanner;

public class TebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka = (int)(Math.random()*100);
        int poin = 100;
        
        System.out.println("Selamat datang, Saya akan berikan kamu angka acak dari 0 s/d 100, tebak ya!!");
        System.out.println("==================================");
        
        do{
            System.out.println("Masukkan angka tebakanmu");
            Scanner masukan = new Scanner(System.in);
            int jwb = masukan.nextInt();
            
            if (jwb == angka){
                System.out.println("==================================");
                System.out.println("Selamat, jawaban Anda benar !!!");
                System.out.println("Poin kamu = " + poin);
                if (poin >= 90){
                    poin += 50;
                    System.out.println("Bonus     = 50");
                    System.out.println("Jadi poin total kamu = " + poin);
                }                
                break;
            } else if (jwb < angka){
                System.out.println("====");
                System.out.println("Eits, angka tebakanmu terlalu kecil");
                System.out.println("==================================");
                poin -= 2;
            } else if (jwb > angka){
                System.out.println("====");
                System.out.println("Wah, angka terbakanmu terlalu besar");
                System.out.println("==================================");
                poin -= 2;
            } if (poin <= 0){
                System.out.println("Yah, tebakanmu salah semua :(");
            }
        } while (poin >= 0);
    } 
}
