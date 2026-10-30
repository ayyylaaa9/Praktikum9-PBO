/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum9;

/**
 *
 * @author Noer Afdila
 */
public class MainThread {
    public static void main(String[] args) {
        System.out.println("Program Utama Dimulai...");

        PekerjaCetak pekerja1 = new PekerjaCetak("Thread-A");
        PekerjaCetak pekerja2 = new PekerjaCetak("Thread-B");

        // PENTING: Gunakan start(), BUKAN run()
        pekerja1.start();
        pekerja2.start();

        System.out.println("Program Utama Selesai Mengeksekusi Baris Terakhir.");
    }
}
