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
public class PrestamoEducativo extends Prestamo {

    protected String nivelE;
    protected InstitucionEducativa centroE;
    protected double valor;
    protected double valorMensual;

    public PrestamoEducativo(Persona b, int t, String cp, String n,
            InstitucionEducativa c, double v, double vM) {
        super(b, t, cp);
        nivelE = n;
        centroE = c;
        valor = v;
        valorMensual = vM;

    }

    public void establecerNivelEstudio(String c) {
        nivelE = c;
    }

    public void establecerCentroEducativo(InstitucionEducativa c) {
        centroE = c;
    }

    public void establecerValorCarrera(double c) {
        valor = c;
    }

    public void calcularValorMensual() {
        valorMensual = (valor / tiempoPrestamo);
        valorMensual = valorMensual - (valorMensual * 0.1);
    }

    public String obtenerNivelEstudio() {
        return nivelE;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroE;
    }

    public double obtenerValorCarrera() {
        return valor;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        
        String cadenaFinal = "\nPRESTAMO EDUCATIVO\n";
        cadenaFinal = String.format("%s%s",cadenaFinal, super.toString());
        cadenaFinal = String.format("%s\n"
                + "Nivel de estudio: %s\n"
                + "Centro Educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual de pago: %.2f\n",
                cadenaFinal,
                obtenerNivelEstudio(),
                obtenerCentroEducativo(),
                obtenerValorCarrera(),
                obtenerValorMensual());

        return cadenaFinal;
    }
}
