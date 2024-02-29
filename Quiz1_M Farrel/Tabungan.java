/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author Lenovo
 */
public class Tabungan {
    private int saldo;
    
    Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public void simpanUang(int jumlahSimpan){
        saldo += jumlahSimpan;
    }
    
    public Boolean ambilUang(int jumlahAmbil){
        if(jumlahAmbil > saldo){
            return false;
        } else {
            saldo -= jumlahAmbil;
            return true;
        }
    }
}
