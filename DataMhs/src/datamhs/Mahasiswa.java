/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamhs;

/**
 *
 * @author Dixy
 */
public class Mahasiswa {
    String nimMhs;
    String namaMhs;
    String tglLhr;
    int gender;
    
    Mahasiswa(String NIM, String nama, String tgl, int gender){
        this.nimMhs = NIM;
        this.namaMhs = nama;
        this.tglLhr = tgl;
        this.gender = gender;
        
    }

    void print() {
        if (this.gender == 0){
            System.out.println("NIM : " + this.nimMhs + " , Nama : " + this.namaMhs 
                + " , Tanggal Lahir :" + this.tglLhr + " , Gender : Laki-laki");
        } else if (this.gender == 1){
            System.out.println("NIM : " + this.nimMhs + " , Nama : " + this.namaMhs 
                + " , Tanggal Lahir :" + this.tglLhr + " , Gender : Perempuan");
        } else{
            System.out.println("NIM : " + this.nimMhs + " , Nama : " + this.namaMhs 
                + " , Tanggal Lahir :" + this.tglLhr + " , Gender : ?");
        }
        
    }
    
}
