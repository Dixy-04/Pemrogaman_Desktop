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
public class MerekKeramik {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Total kA = new Total();
        kA.sisiA = 30;
        kA.sisiB = 30;
        kA.jumlah = 10;
        kA.harga = 54000;
        kA.hitung();
        
        Total kB = new Total();
        kB.sisiA = 40;
        kB.sisiB = 40;
        kB.jumlah = 5;
        kB.harga = 65000;
        kB.hitung();
        
        Total kC = new Total();
        kC.sisiA = 30;
        kC.sisiB = 40;
        kC.jumlah = 8;
        kC.harga = 60000;
        kC.hitung();
        
    }

}

