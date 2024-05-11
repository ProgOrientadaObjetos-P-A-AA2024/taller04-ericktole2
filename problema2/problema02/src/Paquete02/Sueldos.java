/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author toled
 */
public class Sueldos {

    private String nombresP;
    private String apellidosP;
    private double sBasico;
    private double sueldoT;
    private String cedulaP;
    private double porcentaje;

    public Sueldos(String n, String a, double sb, String c) {
        nombresP = n;
        apellidosP = a;
        sBasico = sb;
        cedulaP = c;
    }

    public Sueldos(String n, String a, double sb) {
        nombresP = n;
        apellidosP = a;
        sBasico = sb;
        cedulaP = "1150579686";
    }

    public void establecerNombres(String n) {
        nombresP = n;
    }

    public void establecerApellidos(String a) {
        apellidosP = a;
    }

    public void establecerSalarioBasico(double sb) {
        sBasico = sb;
    }

    public void establecerCedula(String c) {
        cedulaP = c;
    }

    public void calcularSueldoTotal() {

        sueldoT = sBasico + (sBasico * 0.20);

    }

    public String obtenerNombres() {
        return nombresP;
    }

    public String obtenerApellidos() {
        return apellidosP;
    }

    public double obtenerBasico() {
        return sBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoT;
    }

    public String obtenerCedula() {
        return cedulaP;
    }

    @Override
    public String toString() {
        String cadena = String.format("Sueldos de Profesores \n"
                + "Profesor: %s\n"
                + "Apellido: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Cedula: %s\n", obtenerNombres(),
                obtenerApellidos(), obtenerBasico(),
                obtenerSueldoTotal(), obtenerCedula());
        return cadena;
    }

}
