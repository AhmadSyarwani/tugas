/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARDWARE
 */
public class aksilaptop {
    public static void main(String[] args){
        laptop adul = new laptop ();
        adul.merek="acer";
        adul.warna="biru";
        adul.hdd="500GB";
        adul.ram="DDR4";
        adul.processor="intel cote i5";
        adul.cetakInfo();
        
        laptop adil = new laptop ();
        adil.merek="asus";
        adil.warna="hitam";
        adil.hdd="10000GB";
        adil.ram="DDR4";
        adil.processor="intel cote i7";
        adil.cetakInfo();
        
        laptop adin = new laptop ();
        adin.merek="lenovo";
        adin.warna="silver";
        adin.hdd="500GB";
        adin.ram="DDR4";
        adin.processor="intel cote i3";
        adin.cetakInfo();
    }
}
