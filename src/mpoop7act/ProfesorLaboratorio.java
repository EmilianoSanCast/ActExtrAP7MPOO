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
public class ProfesorLaboratorio extends Profesor {
    private String numLaboratorio;
    
    public void usoBata(){
        System.out.println("Estoy usando bata");
   
    }

    public ProfesorLaboratorio() {
    }

    public ProfesorLaboratorio(String numLaboratorio, int numEmpleado, float sueldo, String nombre, int edad, String genero) {
        super(numEmpleado, sueldo, nombre, edad, genero);
        this.numLaboratorio = numLaboratorio;
    }

    public String getNumLaboratorio() {
        return numLaboratorio;
    }

    public void setNumLaboratorio(String numLaboratorio) {
        this.numLaboratorio = numLaboratorio;
    }

    @Override
    public String toString() {
        return super.toString()+ "ProfesorLaboratorio{" + "numLaboratorio=" + numLaboratorio + '}';
    }
    
}
