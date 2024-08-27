/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan13soal1;

/**
 *
 * @author liandra
 */
public class Pertemuan13soal1 {
class CalculatorSederhana {

        public int tambah(int a, int b) {
            return a + b;
        }

        public int kurang(int a, int b) {
            return a - b;
        }
        
        public int kali(int a, int b) {
            return a * b;
        }
        
        public int bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
        return a / b;
        }
    }
         
    public static void main(String[] args) {
        Pertemuan13soal1 objekLuar = new Pertemuan13soal1();
        CalculatorSederhana kalkulator = objekLuar.new CalculatorSederhana();
        
        System.out.println("Hasil Pertambahan : " + kalkulator.tambah(20, 10));
        System.out.println("Hasil Penguranagan : " + kalkulator.kurang(20, 10));
        System.out.println("Hasil Perkalian : " + kalkulator.kali(20, 10));
        System.out.println("Hasil Pembagian : " + kalkulator.bagi(20, 10));
    }
    
}
