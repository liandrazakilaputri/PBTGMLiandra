/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan10soal2;
import java.util.Scanner;

/**
 *
 * @author liandra
 */
public class Pertemuan10soal2 {

    
    public static void main(String[] args) {
       Scanner myInput = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan1: ");
        double bilangan1 = myInput.nextDouble();
        System.out.println("Masukkan bilangan2: ");
        double bilangan2 = myInput.nextDouble();
        
        Aritmatika aritmatika = new Aritmatika(bilangan1, bilangan2);

        // Mengakses dan menampilkan hasil metode pengurangan
        System.out.println("Hasil Pengurangan: " + aritmatika.pengurangan());

        // Mengakses dan menampilkan hasil metode perkalian
        System.out.println("Hasil Perkalian: " + aritmatika.perkalian());

        // Mengakses dan menampilkan hasil metode pembagian
        try {
            System.out.println("Hasil Pembagian: " + aritmatika.pembagian());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Mengakses dan menampilkan hasil metode pangkat
        System.out.println("Hasil Pangkat: " + aritmatika.pangkat());
    }
    
}
