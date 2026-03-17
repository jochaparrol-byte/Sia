/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaSia;

/**
 *
 * @author Darwin Landaeta
 */
public class EvaluacionDocente {
    String nombre_docente;
    int nota_evaluacion;
    String materia_evaluada;
    String estudiante_evaluador;
    int cod_materia;
    
    public EvaluacionDocente(String nombre_docente, int nota_evaluacion, String materia_evaluada, String estudiante_evaluador){
        this.nombre_docente=nombre_docente;
        this.nota_evaluacion=nota_evaluacion;
        this.materia_evaluada=materia_evaluada;
        this.estudiante_evaluador=estudiante_evaluador;
            
    }
    public EvaluacionDocente(int cod_materia, String estudiante_evaluador, int nota_evaluacion){
        this.cod_materia=cod_materia;
        this.estudiante_evaluador=estudiante_evaluador;
        this.nota_evaluacion=nota_evaluacion;
    }
}
