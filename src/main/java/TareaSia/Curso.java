/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaSia;

/**
 *
 * @author Darwin Landaeta
 */
public class Curso {
    int codigo_curso;
    int numero_creditos;
    String facultad_curso;
    String nombre_curso;
    String docente_encargado;
    
    public Curso(String nombre_curso, int numero_creditos, String facultad_curso, String docente_encargado){
        this.nombre_curso=nombre_curso;
        this.numero_creditos=numero_creditos;
        this.facultad_curso=facultad_curso;
        this.docente_encargado=docente_encargado;
    }
    public Curso(int codigo_curso, String docente_encargado){
        this.codigo_curso=codigo_curso;
        this.docente_encargado=docente_encargado;
    }
}
