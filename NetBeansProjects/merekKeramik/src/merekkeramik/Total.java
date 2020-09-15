/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merekkeramik;

/**
 *
 * @author Dixy
 */
public class Total {
    float sisiA;
    float sisiB;
    float jumlah;
    float harga; 
    
    void hitung(){
        int hitung;
        hitung = (int) (float) (Math.ceil(1000000 / (this.sisiA * this.sisiB * this.jumlah)) * this.harga ); 
        System.out.println("Harga keramik = " + hitung );
    }

}
