/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("===========================");
            System.out.println("Masukkan Data Nasabah");
            System.out.println("===========================");
            System.out.print("Nama Awal : ");
            String namaAwal = sc.next();
            System.out.print("Nama Akhir: ");
            String namaAkhir = sc.next();
            sc.nextLine();
            Nasabah nsb = new Nasabah(namaAwal, namaAkhir);
            System.out.print("Saldo Awal : ");
            int saldo = sc.nextInt();
            Tabungan tbg = new Tabungan(saldo);
            
            
            System.out.println("\n");
            System.out.print("Simpan uang? [Y/T] : ");
            char plh = sc.next().charAt(0);
            if(plh == 'Y' || plh == 'y'){
                System.out.print("Masukkan uang : ");
                int uang = sc.nextInt();
                tbg.simpanUang(uang);
                System.out.println("Saldo saat ini : "+ tbg.getSaldo());
            } else {
                System.out.println(" ");
            }
            
            System.out.println("\n");
            System.out.print("Ambil uang? [Y/T] : ");
            char plh2 = sc.next().charAt(0);
            if(plh2 == 'Y' || plh2 == 'y'){
                System.out.print("Ambil uang : ");
                int uang2 = sc.nextInt();
                if(tbg.ambilUang(uang2) == true){
                    System.out.println("Uang berhasil diambil.");
                } else {
                    System.out.println("Uang tidak bisa diambil karena saldo kurang.");
                }
            } else {
                System.out.println(" ");
            }
            
            System.out.println("\n");
            System.out.println("=======Data Nasabah=======");
            System.out.print("Nama Nasabah : "+ nsb.getNamaAwal() +" ");
            System.out.println(nsb.getNamaAkhir());
            System.out.println("Saldo Awal : " +tbg.getSaldo());
        
    }
}
