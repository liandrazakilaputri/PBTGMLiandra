/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7soal2;
import java.util.Scanner;

/**
 *
 * @author liandra
 */
public class Pertemuan7soal2 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NIM : ");
        int nim = scanner.nextInt();
        scanner.nextLine();
        System.out.println("NAMA : ");
        String nama = scanner.nextLine();
        System.out.println("TAHUN : ");
        int tahun = scanner.nextInt();
        scanner.nextLine();
        System.out.println("PILIH PEMINATAN : ");
        char peminatan = scanner.next().charAt(0);
        
        switch (tahun) {
            case 1:
                System.out.println("Bahasa Inggris, Matematika, Sain");
                break;
            case 2:
                switch(peminatan) {
                    case 'C':
                        System.out.println("Sistem Operasi, Pemrograman Java, struktur Data");
                        break;
                        case 'E':
                        System.out.println("Algoritma, Logika Informatika"); 
                        break;
                    case 'M':
                        System.out.println("DBMS,Manajemen Proyek"); 
                        break;
                }
                break;
            case 3:
                switch (peminatan) {
                    case 'C':
                        System.out.println("Organisasi Komputer, MultiMedia"); 
                        break;
                    case 'E':
                        System.out.println("Perancangan Sistem, Pemrograman WEB"); 
                        break;
                    case 'M':
                        System.out.println("Pemrograman Mobile, Pemrograman Java 2"); 
                        break;
                }
                break;
            case 4:
                switch (peminatan) {
                    case 'C':
                        System.out.println("Komunikasi Data, MultiMedia"); 
                        break;
                    case 'E':
                        System.out.println(" Sistem Terdistribusi , Image Processing"); 
                        break;
                    case 'M':
                        System.out.println("SIM , Sistem Jaringan "); 
                        break;
                }
                break;
        }
        scanner.close();
    }
}
