/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author toled
 */
public class Matricula {

    private String cedula;
    private String marca;
    private int anoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Matricula(String c, String m, int af, double v) {
        cedula = c;
        marca = m;
        anoFabricacion = af;
        valorVehiculo = v;
    }

    public Matricula(String c, String m, int aF) {
        cedula = c;
        marca = m;
        anoFabricacion = aF;
        valorVehiculo = 35999.00;

    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String a) {
        marca = a;
    }

    public void establecerAnoDeFabricacion(int anoF) {
        anoFabricacion = anoF;
    }

    public void establecerValorDeVehiculo(double vV) {
        valorVehiculo = vV;
    }

    public void calcularValorDeMatricula() {
        valorMatricula = (0.002 * valorVehiculo) * (2024 - anoFabricacion);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnoDeFabricacion() {
        return anoFabricacion;
    }

    public double obtenerValorDeVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorDeMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format(
                "Matricula \n"
                + "Cedula: %s\n"
                + "Marca: %s\n"
                + "Año de Fabricacion: %d\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de la Matricula: %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAnoDeFabricacion(),
                obtenerValorDeVehiculo(),
                obtenerValorDeMatricula());
        return cadena;
    }
}
