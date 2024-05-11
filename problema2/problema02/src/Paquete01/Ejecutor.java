/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete01;

import Paquete02.Sueldos;

/**
 *
 * @author toled
 */
public class Ejecutor {

    /**
     */
    public static void main(String[] args) {
        Sueldos s1 = new Sueldos("Erick", "Toledo", 750,
                "1130058748");
        s1.calcularSueldoTotal();
        Sueldos s2 = new Sueldos("Steven", "Romero", 425);
        s2.calcularSueldoTotal();

        System.out.printf("%s\n", s1);
        System.out.printf("%s\n", s2);
    }

}
