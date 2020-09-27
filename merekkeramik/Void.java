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
public class Void {
    float sisi1;
    float sisi2;
    float jumlah;
    float harga; 
    
    void hitung(){
        int hitung;
        hitung = (int) (float) (Math.ceil(1000000 / (this.sisi1 * this.sisi2)/this.jumlah) * this.harga ); 
        System.out.println(hitung);
    }

}
