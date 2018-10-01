/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan23.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menghitung nilai 
 * terbesar dan nilai terkecil
 */
public class PBO210117049Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namaPetugas;
        int jumlahSiswa;
        int nilai[] = new int[20];
        int i, max, min;

        Scanner scan = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scan.nextLine();
        System.out.print("Masukkan Banyaknya nilai Mahasiswa :  ");
        jumlahSiswa = scan.nextInt();
        System.out.println("");

        for (i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = scan.nextInt();
        }
        System.out.println("");
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-"+i+" = "+nilai[i]);
        }
        //Inisialisasi Max dan Min
        min = nilai[1];
        max = nilai[1];

        //Penghitungan Nilai Terbesar dan Terkecil
        for (i = 1; i <= jumlahSiswa; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            } else if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        
        System.out.println("");

        System.out.println("Nilai Terbesar : " + max);
        System.out.println("Nilai Terkecil : " + min);
        System.out.println("");
        System.out.println("Nama Petugas : " + namaPetugas);

    }

}
