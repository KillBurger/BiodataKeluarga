/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakeluarga;

/**
 *
 * @author WINDOWS 10
 */
public class DataKeluarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ayah bio = new Ayah();
        bio.setNamaA("Didik Purwanto");
        Ibu data = new Ibu();
        data.setNamaI("Masriwiwit");
        Saudara nam = new Saudara();
        nam.setNamaS("Khusnul Ika Dian Nirwana\n                 Puri Kholifatus Sholihah");
        Saya inf = new Saya();
        inf.setNama("Muhammad Yusuf Ragil Syah An Naas");
        inf.setAlt("Jl. Danau Towuti 2");
        inf.setTlhr("Tuban");
        inf.setTgl("13 Oktober 2002");
        inf.setHobi("Main bola, bermain game, bermain Skateboard, menggambar");
        inf.setCt("Game Developer");
        inf.setNo("082227895404");

        System.out.println("Nama Ayah       :" + bio.getNamaA());
        System.out.println("Nama Ibu        :" + data.getNamaI());
        System.out.println("Nama Saudara    :" + nam.getNamaS());
        System.out.println("Nama Saya       :" + inf.getNama());
        System.out.println("Alamat          :" + inf.getAlt());
        System.out.println("Tempat Lahir    :" + inf.getTlhr());
        System.out.println("Tanggal Lahir   :" + inf.getTgl());
        System.out.println("Hobi            :" + inf.getHobi());
        System.out.println("Cita-cita       :" + inf.getCt());
        System.out.println("No. Telepon     :" + inf.getNo());
    }

}
