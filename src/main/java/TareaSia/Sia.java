/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TareaSia;

/**
 *
 * @author Darwin Landaeta
 */
public class Sia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancelacion cn= new Cancelacion(12345, "Mario");
        Cancelacion calculo=new Cancelacion("Calculo diferencial", 3, "Ingenieria", "Manolo");
        Curso cs=new Curso(32145, "julian");
        EvaluacionDocente ev=new EvaluacionDocente(4214213, "Juan Camaro", 1.2);
        Horario h=new Horario(2, "Calculo");
        InformacionFinanciera inf=new InformacionFinanciera(412389123,"Pagado");
        calculo.CancelarMateria();
    }
    
}
