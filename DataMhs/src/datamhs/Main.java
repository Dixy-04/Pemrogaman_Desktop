/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamhs;

import java.util.Scanner;

/**
 *
 * @author Dixy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        DataMahasiswa mhs = new DataMahasiswa();
        
        MENU:
        do {
            System.out.println("\n 1. Tambah Data ");
            System.out.println(" 2. Tampilkan Data ");
            System.out.println(" 3. Hapus Data ");
            System.out.println(" 4. Cari Data ");
            System.out.println(" 5. Exit ");
            System.out.print("Pilhan : ");
            int menu = input.nextInt();
            input.nextLine();
            
            switch(menu){
                case 5:
                    break MENU;
                case 1:
                    System.out.println("Masukkan NIM :");
                    String nim = input.nextLine();
                    System.out.println("Masukkan Nama :");
                    String nama = input.nextLine();
                    System.out.println("Masukkan Tanggal Lahir:");
                    String tgl = input.nextLine();
                    System.out.println("Masukkan Gender (0. Laki-laki 1. Perempuan) :");
                    int gender = input.nextInt();
                    input.nextLine();
                    mhs.tambahMhs(new Mahasiswa(nim,nama,tgl,gender));
                    break;
                case 2:
                    mhs.tampilMhs();
                    break;
                case 3:
                    mhs.tampilMhs();
                    System.out.println("Masukkan NIM yg ingin dihapus");
                    String nMhs = input.nextLine();
                    mhs.hapusMhs(nMhs);
                    break;
                case 4:
                    System.out.println("Cari berdasar 1.NIM 2.Gender");
                    menu = input.nextInt();
                    input.nextLine();
                    switch (menu){
                        case 1:
                            System.out.println("Masukkan NIM :");
                            nMhs = input.nextLine();
                            mhs.cariMhs(nMhs);
                            break;
                        case 2:
                            System.out.println("Masukkan Gender (0.Laki-laki 1.Perempuan):");
                            gender = input.nextInt();
                            mhs.cariMhs(gender);
                            break;
                    }
                    break;
                default:
                    break;
            }
        } while (true);{
    }    
    }  
}
