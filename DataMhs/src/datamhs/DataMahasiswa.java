/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamhs;

import java.util.ArrayList;

/**
 *
 * @author Dixy
 */
public class DataMahasiswa {
    ArrayList<Mahasiswa> dataMhs = new ArrayList<Mahasiswa>();
    
    void tambahMhs(Mahasiswa data){
        this.dataMhs.add(data);
    }
    
    void hapusMhs(String nim){
        this.dataMhs.removeIf(item -> (item.nimMhs == null ? nim == null : item.nimMhs.equals(nim)));
    }
    
    void cariMhs(String nim){
        boolean found = false;
        int index;
        for (int i = 0; i < this.dataMhs.size(); i++){
            if (this.dataMhs.get(i).nimMhs == null ? nim == null : this.dataMhs.get(i).nimMhs.equals(nim)){
                index = i;
                found = true;
            if (found == true) {
                this.dataMhs.get(index).print();
                found = false;
            } else {
                System.out.println("Data tidak ditemukan");
            }
            }
        }
    }
    
    void cariMhs(int gender){
        boolean found = false;
        int index;
        for (int i = 0; i < this.dataMhs.size(); i++){
            if (this.dataMhs.get(i).gender == gender){
                index = i;
                found = true;
            if (found == true) {
                this.dataMhs.get(index).print();
                found = false;
            } else {
                System.out.println("Data tidak ditemukan");
            }
            }
        }
    }
    
    void tampilMhs(){
        System.out.println("\n----------Data Mahasiswa----------");
        for (Mahasiswa item: this.dataMhs){
            item.print();
        }
        System.out.println("--------------------------------");
    }
}
