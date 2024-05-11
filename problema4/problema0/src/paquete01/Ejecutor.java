/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.Cheques;

/**
 *
 * @author toled
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cheques ch1 = new Cheques("Erick Santiago", "BANCO DE LOJA", 587);
        ch1.calcularComision();

        Cheques ch2 = new Cheques("Erick Toledo", "BANCO DE GUAYAQUIL");
        ch2.calcularComision();

        System.out.printf("%s\n", ch1);
        System.out.printf("%s\n", ch2);
    }

}
