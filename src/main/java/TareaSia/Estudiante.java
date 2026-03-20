/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaSia;

/**
 *
 * @author Brayan Ramirez
 */

public class Estudiante {
    //Atributos 
    String nombre;
    long cedula_tarjeta;
    String correo;
    String programa;
    int semestre_cursado;
    
    //Metodos 
    public Estudiante(String nombre, String programa){
        this.nombre = nombre;
        this.programa = programa;
    }
    public Estudiante(String nombre, String programa,long cedula_tarjeta,int semestre_cursado,String correo){
        this.nombre = nombre;
        this.programa = programa;
        this.semestre_cursado = semestre_cursado;
        this.correo = correo;
        this.cedula_tarjeta = cedula_tarjeta;
        
    }
    public void cursar(){
        System.out.println("Me llamo" +nombre+ "estoy cursando" +semestre_cursado+ "semestre");
    }
    public void cursar(int edad){
         System.out.println("Me llamo" +nombre+ "tengo" +edad+ "años y estoy en el progrma de" +programa);
    }
    
}


    

