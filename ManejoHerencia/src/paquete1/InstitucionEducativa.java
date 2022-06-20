/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author UsuarioITC
 */
public class InstitucionEducativa {

    protected String nombre;
    protected String siglas;

    public InstitucionEducativa(String n, String s) {
        nombre = n;
        siglas = s;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerSiglas(String c) {
        siglas = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Siglas: %s\n",
                nombre,
                siglas);

        return cadena;
    }

}
