/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.nilaimahasiswa.tugas;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan Nilai Mahasiswa
 * 
 */
public class Main {
    public static void main(String[]args){
        Scanner inputKey = new Scanner(System.in);
        
        Nilai dataNilai = new Nilai();
        int nilaiQuis,nilaiUts,nilaiUas;
        
        //input nilai Quiz
        System.out.print("QUIZ\t\t = ");
        nilaiQuis = inputKey.nextInt();
        
        //input nilai Uts
        System.out.print("UTS\t\t = ");
        nilaiUts = inputKey.nextInt();
        
        //input nilai UAS
        System.out.print("UAS\t\t = ");
        nilaiUas = inputKey.nextInt();
        
        dataNilai.setNilaiQuis(nilaiQuis);
        dataNilai.setNilaiUts(nilaiUts);
        dataNilai.setNilaiUas(nilaiUas);
        
        System.out.println();
        System.out.println("Nilai Akhir\t = " + dataNilai.hitungNilai(dataNilai.getNilaiQuis(), dataNilai.getNilaiUts(), dataNilai.getNilaiUas()));
        System.out.println();
        System.out.println("Index = " + dataNilai.indexKondisi(dataNilai.hitungNilai(dataNilai.getNilaiQuis(), dataNilai.getNilaiUts(), dataNilai.getNilaiUas())));
        System.out.println("Keterangan = "+ dataNilai.keterangan(dataNilai.indexKondisi(dataNilai.hitungNilai(dataNilai.getNilaiQuis(), dataNilai.getNilaiUts(), dataNilai.getNilaiUas()))));
    }

    public Main() {
    }
}
