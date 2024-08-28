/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan16soal2;

/**
 *
 * @author liandra
 */
public class Pembagian extends OperasiAritmatika {
    
    public Pembagian(double a, double b) {
        super(a, b);
    }

    @Override
    public double hitung() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
    }
}
