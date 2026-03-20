/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaSia;

/**
 *
 * @author Brayan Ramirez
 */


public class Profesor{
    
    //Atributos 
    String nombre;
    long cedula;
    String correo;
    String departamento;
    long celular;
  
    
    //Metodos 
    public Profesor(String nombre, String departamento){
        this.nombre = nombre;
        this.departamento = departamento;
    }
    public Profesor(String nombre, String departamento,long cedula,String correo, long celular){
        this.nombre = nombre;
        this.departamento = departamento;
        this.celular = celular;
        this.correo = correo;
        this.cedula = cedula;
        
    }
    public void dictar(){
        System.out.println("Me llamo" +nombre+ ",soy profesor del departamento" +departamento );
    }
    public void dictar(String curso){
         System.out.println("Me llamo" +nombre+ "dicto el curso de" +curso+ 
                 "y me pueden contactar atravez de mi correo"  +correo );
    }
    
}
