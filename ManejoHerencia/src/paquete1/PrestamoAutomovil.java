/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author UsuarioITC
 */
public class PrestamoAutomovil extends Prestamo {

    protected String tipoAuto;
    protected String marcaAuto;
    protected Persona garante;
    protected double valorAuto;
    protected double valorMensual;

    public PrestamoAutomovil(Persona b, int tp, String c, String t, String m, 
            Persona g, double vA, double vM) {
        super(b, tp, c);
        tipoAuto = t;
        marcaAuto = m;
        garante = g;
        valorAuto = vA;
        valorMensual = vM;

    }

    public void establecerTipo(String c) {
        tipoAuto = c;
    }

    public void establecerMarca(String c) {
        marcaAuto = c;
    }

    public void establecerGarante(Persona c) {
        garante = c;
    }

    public void establecerValorAuto(double c) {
        valorAuto = c;
    }

    public void calcularValorMensual() {
        valorMensual = valorAuto / tiempoPrestamo;
    }

    public String obtenerTipo() {
        return tipoAuto;
    }

    public String obtenerMarca() {
        return marcaAuto;
    }

    public Persona obtenerGarante() {
        return garante;
    }

    public double obtenerValorAuto() {
        return valorAuto;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        
        String cadenaFinal = "\nPRESTAMO AUTOMOVIL\n";
        cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Tipo de automóvil: %s\n"
                + "Marca de automóvil: %s\n"
                + "Garante: %s\n"
                + "Valor de automóvil: %.2f\n"
                + "Valor mensual de pago: %.2f\n",
                cadenaFinal,
                obtenerTipo(),
                obtenerMarca(),
                obtenerGarante(),
                obtenerValorAuto(),
                obtenerValorMensual());


        return cadenaFinal;
    }
}
