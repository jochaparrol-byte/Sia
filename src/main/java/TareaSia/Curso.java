/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaSia;


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
    public String validarCurso(){
        String anuncio="El cruso: "+this.nombre_curso+" consta de "+this.numero_creditos+" es de la facultad de "+this.facultad_curso+" y es dado por el docente "+this.docente_encargado;
        return anuncio;
        
    }
    public String validarCurso(int numero){
        String anuncio="Se realizo la consulta del curso nro: "+this.codigo_curso+" y se encontro que el docente encargado es: "+this.docente_encargado;
        return anuncio;
    }
}
