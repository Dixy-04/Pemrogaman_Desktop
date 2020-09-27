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
public class NonVoid {

    int hitung(float s1, float s2, float byk, float hrg){  
        int luas;
        luas = (int) (float) (Math.ceil(1000000 /(s1 * s2)/byk) * hrg);
        return luas;
    }

}
