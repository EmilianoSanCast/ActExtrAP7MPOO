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
public class AlumnoMedicina extends Alumno{
    private String instrumento;
    
    public void curar(){
        System.out.println("Estoy curando...");
    }

    public AlumnoMedicina() {
    }

    public AlumnoMedicina(String instrumento, int numCuenta, boolean tieneBeca, String nombre, int edad, String genero) {
        super(numCuenta, tieneBeca, nombre, edad, genero);
        this.instrumento = instrumento;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        return super.toString()+ "AlumnoMedicina{" + "instrumento=" + instrumento + '}';
        
    }
    
}
