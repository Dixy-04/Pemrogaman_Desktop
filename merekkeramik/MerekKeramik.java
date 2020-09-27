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
        //nonVoid
        System.out.println("Non Void :");
        NonVoid kerA = new NonVoid();
        System.out.println("Harga keramik A = Rp." + kerA.hitung(30,30,10,54000));
       
        NonVoid kerB = new NonVoid();
        System.out.println("Harga keramik B = Rp." + kerB.hitung(40,40,5,65000));
        
        NonVoid kerC = new NonVoid();
        System.out.println("Harga keramik C = Rp." + kerC.hitung(30,40,8,60000));
        
       //construction
        System.out.println("Construction :");
        Construction keA = new Construction(30,30,10,54000);
        System.out.print("Harga keramik A = Rp." );
        keA.hitung();
                
        Construction keB = new Construction(40,40,5,65000);
        System.out.print("Harga keramik B = Rp." );
        keB.hitung();
        
        Construction keC = new Construction(30,40,8,60000);
        System.out.print("Harga keramik C = Rp." );
        keC.hitung();
        
        //void
        System.out.println("Void :");
        Void kA = new Void();
        kA.sisi1 = 30;
        kA.sisi2 = 30;
        kA.jumlah = 10;
        kA.harga = 54000;
        System.out.print("Harga keramik A = Rp.");
        kA.hitung();
        
        Void kB = new Void();
        kB.sisi1 = 40;
        kB.sisi2 = 40;
        kB.jumlah = 5;
        kB.harga = 65000;
        System.out.print("Harga keramik B = Rp.");
        kB.hitung();
        
        Void kC = new Void();
        kC.sisi1 = 30;
        kC.sisi2 = 40;
        kC.jumlah = 8;
        kC.harga = 60000;
        System.out.print("Harga keramik C = Rp.");
        kC.hitung();
        
    }

}

