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
public class Construction {
    float sisi1;
    float sisi2;
    float banyak;
    float harga;
    int total;
    
    Construction(int s1, int s2, int byk, int hrg){
        this.sisi1 = s1;
        this.sisi2 = s2;
        this.banyak = byk;
        this.harga = hrg;
    }
    
    void hitung(){
        this.total = (int) (float) (Math.ceil(1000000 / (this.sisi1 * this.sisi2)/this.banyak) * this.harga );
        System.out.println(total);
    }
}
