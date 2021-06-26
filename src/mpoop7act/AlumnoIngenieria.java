/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop7act;

/**
 *
 * @author USER
 */
public class AlumnoIngenieria extends Alumno{
    private String circuito;
    
    public void calcular(){
        System.out.println("Estoy calculando...");
    }

    public AlumnoIngenieria() {
    }

    public AlumnoIngenieria(String circuito, int numCuenta, boolean tieneBeca, String nombre, int edad, String genero) {
        super(numCuenta, tieneBeca, nombre, edad, genero);
        this.circuito = circuito;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    @Override
    public String toString() {
        return super.toString()+ "AlumnoIngenieria{" + "circuito=" + circuito + '}';
    }
    
    
    
}
