/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6soal1;

import java.util.Scanner;

/**
 *
 * @author liandra
 */
public class Pertemuan6soal1 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Masukan NIM Anda:");
        String nim = myInput.nextLine();
        System.out.println("Masukan Nama Anda:");
        String nama = myInput.nextLine();
        System.out.println("Masukan Nilai Anda:");
        int nilai = myInput.nextInt();
        // Output input by user
 if(nilai>=60 && nilai<70){ 
 System.out.println("grade C "); 
 } 
 else if(nilai>=70 && nilai<80){ 
 System.out.println("grade B "); 
 } 
 else if(nilai>=80 && nilai<90){
  System.out.println("grade A ");
         }
    }
}
