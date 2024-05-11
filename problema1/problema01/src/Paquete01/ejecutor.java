/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

import Paquete02T.LibretaNotas;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreEstudiante;
        double calificacion1;
        double calificacion2;
        double calificacion3;
        double promedio;
        LibretaNotas libreta1 = new LibretaNotas("Erick Toledo", 10, 9, 8);
        libreta1.establecerPromedio();
        LibretaNotas libreta2 = new LibretaNotas("Erick Rodas", 7, 9);
        libreta2.establecerPromedio();
        
        System.out.printf("%s\n"
                + "%s\n", libreta1,libreta2);
        
    }
}
