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
public class MPOOP7ACT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("#######CLASE PERSONA########");    
        Persona persona1=new Persona("Pedro",20,"hombre");
        System.out.println(persona1);
        
        System.out.println("######SUBCLASE PROFESOR#####");
        Profesor profesor1=new Profesor(10,10000,"Alberto",40,"hombre");
        System.out.println(profesor1);
        
        System.out.println("######SUBCLASE PROFESOR TEORIA#####");
        ProfesorTeoria profesort1=new ProfesorTeoria("5A",32,12000,"Juana",42,"mujer");
        System.out.println(profesort1);
        
        System.out.println("######SUBCLASE PROFESOR LABORATORIO#####");
        ProfesorLaboratorio profesorlab1= new ProfesorLaboratorio("16B",81,6000,"Ana",32,"mujer");
        System.out.println(profesorlab1);
        
        System.out.println("######SUBCLASE ALUMNO#####");
        Alumno alumno1= new Alumno(4321,true,"pepe", 19, "hombre");
        System.out.println(alumno1);
        
        System.out.println("######SUBCLASE ALUMNOINGENIERIA#####");
        AlumnoIngenieria alumnoing= new AlumnoIngenieria("RC", 1234, true, "maria", 21, "mujer");
        System.out.println(alumnoing);
        
        System.out.println("######SUBCLASE ALUMNOMEDICINA#####");
        AlumnoMedicina alumnomed=new AlumnoMedicina("Bisturi", 8765, false, "Sofia", 23, "mujer");
        System.out.println(alumnomed);
    }
    
}
