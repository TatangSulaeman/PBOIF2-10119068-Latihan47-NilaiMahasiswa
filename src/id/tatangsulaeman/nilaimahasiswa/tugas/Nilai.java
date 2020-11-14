/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.nilaimahasiswa.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan Nilai Mahasiswa
 * 
 */
public class Nilai {
    private int nilaiQuis,nilaiUts,nilaiUas;
    private double nilaiAkhir;

    public int getNilaiQuis() {
        return nilaiQuis;
    }

    public void setNilaiQuis(int nilaiQuis) {
        this.nilaiQuis = nilaiQuis;
    }

    public int getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUts(int nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public int getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiUas(int nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public double hitungNilai(int nilaiQuis,int nilaiUts,int nilaiUas){
        return 0.2 * nilaiQuis + 0.3* nilaiUts + 0.5 * nilaiUas ;
    }
    
    public String indexKondisi(double nilaiAkhir1){
       String index;
        if (nilaiAkhir1 >= 80 && nilaiAkhir1 <= 100) {
            index = "A";
        } else if (nilaiAkhir1 >=68 && nilaiAkhir1 <80) {
            index = "B";
        } else if (nilaiAkhir1 >=56 && nilaiAkhir1 <68) {
            index = "C";
        }  else if (nilaiAkhir1 >=45 && nilaiAkhir1 <56) {
            index = "D";
        }  else{
            index = "E";
        }
        return index; 
    }
    
    public String keterangan(String index){
        String ket;
        if (index == "A") {
            ket = "Sangat Baik";
        } else if (index == "B") {
            ket = "Baik";
        } else if (index == "C") {
            ket = "Cukup";
        } else if (index == "D") {
            ket = "Kurang";
        } else{
            ket = "Sangat Kurang";
        }
        return ket;
    }
}
