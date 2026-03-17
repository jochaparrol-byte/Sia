/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaSia;

/**
 *
 * @author Darwin Landaeta
 */
public class Cancelacion {
    String profesor_asignado;
    String nombre_materia;
    int numero_creditos;
    String nombre_estudiante;
    String carrera_materia;
    int codigo_materia;
    public Cancelacion(String nombre_materia, int numero_creditos, String carrera_materia, String nombre_estudiante){
        this.nombre_materia=nombre_materia;
        this.numero_creditos=numero_creditos;
        this.carrera_materia=carrera_materia;
        this.nombre_estudiante=nombre_estudiante;
             
    } 
    public Cancelacion(int codigo_materia, String nombre_estudiante){
        this.codigo_materia=codigo_materia;
        this.nombre_estudiante=nombre_estudiante;
    }
}
