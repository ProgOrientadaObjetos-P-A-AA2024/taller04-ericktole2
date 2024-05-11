/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete01;

import paquete02.Matricula;

/**
 *
 * @author toled
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matricula m1 = new Matricula("1150579686", "Mercedes Benz", 2012,
                85599.00);
        m1.calcularValorDeMatricula();

        Matricula m2 = new Matricula("11045635875", "lamborghini", 2005);
        m2.calcularValorDeMatricula();

        System.out.printf("%s\n", m1);
        System.out.printf("%s\n", m2);

    }

}
