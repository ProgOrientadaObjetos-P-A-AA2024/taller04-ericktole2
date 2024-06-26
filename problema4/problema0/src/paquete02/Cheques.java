/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author toled
 */
public class Cheques {

    private String cliente;
    private String banco;
    private double valorCheque;
    private double comision;

    public Cheques(String c, String b, double vc) {
        cliente = c;
        banco = b;
        valorCheque = vc;
    }

    public Cheques(String c, String b) {
        cliente = c;
        banco = b;
        valorCheque = 2500;
    }

    public void establecerCliente(String a) {
        cliente = a;
    }

    public void establecerBanco(String b) {
        banco = b;
    }

    public void establecerValorCheque(double a) {
        valorCheque = a;
    }

    public void calcularComision() {
        comision = valorCheque * 0.003;
    }

    public String obtenerCliente() {
        return cliente;
    }

    public String obtenerBanco() {
        return banco;
    }

    public double obtenerValorDelCheque() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Comision del Cheque \n"
                + "Nombre del cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del Cheque: %.2f\n"
                + "Valor de la Comision: %.2f\n",
                obtenerCliente(),
                obtenerBanco(),
                obtenerValorDelCheque(),
                obtenerComision());
        return cadena;
    }
}
