/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5soal2;

import java.util.Scanner;

/**
 *
 * @author liandra
 */
public class Pertemuan5soal2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Alas:");
        double alas = myInput.nextDouble();
        System.out.println("Tinggi:");
        double tinggi = myInput.nextDouble();
        double luas = (alas*tinggi)/2;
        // Output input by user
 System.out.println(" Luas Segitiga: " + luas );
    }
}
