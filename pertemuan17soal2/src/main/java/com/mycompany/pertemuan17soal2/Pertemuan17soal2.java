/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan17soal2;

/**
 *
 * @author liandra
 */
public class Pertemuan17soal2 {

    public static void main(String[] args) {
        
      String[][] negaraIbukota = {
            {"Indonesia", "Jakarta"},{"Jepang", "Tokyo"},
            {"Iran", "Teheran"},{"Malaysia", "Kuala Lumpur"},{"Thailand", "Bangkok"}
        };
        
        for (int i = 0; i < negaraIbukota.length; i++) {
            String negara = negaraIbukota[i][0];
            String ibukota = negaraIbukota[i][1];
            System.out.println("Ibukota " + negara + " adalah " + ibukota);
        }
    }  
}