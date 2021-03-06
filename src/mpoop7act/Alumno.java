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
public class Alumno extends Persona {
    private int numCuenta;
    private boolean tieneBeca;

    public void estudiar(){
        System.out.println("Estoy estudiando...");
    }

    public Alumno() {
    }

    public Alumno(int numCuenta, boolean tieneBeca, String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        this.numCuenta = numCuenta;
        this.tieneBeca = tieneBeca;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public boolean isTieneBeca() {
        return tieneBeca;
    }

    public void setTieneBeca(boolean tieneBeca) {
        this.tieneBeca = tieneBeca;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numCuenta=" + numCuenta + ", tieneBeca=" + tieneBeca + '}';
    }
    
    
    
}
