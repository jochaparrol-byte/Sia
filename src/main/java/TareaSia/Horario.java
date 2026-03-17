/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaSia;

/**
 *
 * @author Darwin Landaeta
 */
public class Horario {
    int numero_materias;
    int dias_clase;
    int semanas_clase;
    int numero_salon;
    String materia;
    
   public Horario(int numero_materias, int dias_clase, int semanas_clase, int numero_salon, String materia){
       this.numero_materias=numero_materias;
       this.dias_clase=dias_clase;
       this.semanas_clase=semanas_clase;
       this.numero_salon=numero_salon;
       this.materia=materia;
   }
   public Horario(int dias_clase, String materia){
       this.dias_clase=dias_clase;
       this.materia=materia;
   }
}
