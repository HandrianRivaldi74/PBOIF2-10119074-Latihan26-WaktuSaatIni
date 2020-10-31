/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10119074_latihan26_waktu;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Acer
 * NAMA     : Handrian Rivaldi
 * KELAS    : PBOIF2
 * NIM      : 10119074
 * Deskripsi : Program menentukan waktu saat ini
 */
public class PBOIF2_10119074_Latihan26_Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int detik, menit, jam, hari, tanggal, bulan, tahun;
        GregorianCalendar waktu = new GregorianCalendar();
        String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", 
                              "Juni", "Juli", "Agustus", "September", "Oktober", 
                              "November", "Desember"};
        String nama_hari[] = {"Sabtu", "Minggu", "Senin", "Selasa", "Rabu", 
                              "Kamis", "Jumat"};
        detik = waktu.get(Calendar.SECOND);
        menit = waktu.get(Calendar.MINUTE);
        jam =  waktu.get(Calendar.HOUR_OF_DAY);
        hari = waktu.get(Calendar.DAY_OF_WEEK);
        tanggal = waktu.get(Calendar.DAY_OF_MONTH);
        bulan = waktu.get(Calendar.MONTH);
        tahun = waktu.get(Calendar.YEAR);
        System.out.println("Hari ini adalah hari : "+nama_hari[hari]+", "
                           + ""+tanggal+" "+namabulan[bulan]+" "+tahun+" "
                           + ""+jam+":"+menit+":"+detik);
    }
    
}
