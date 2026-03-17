/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaSia;

/**
 *
 * @author Darwin Landaeta
 */
public class InformacionFinanciera {
    double valor_pagar;
    String nombre_recibo;
    String estado_recibo;
    String fecha_limite;
    int referencia_recibo;
    
    public InformacionFinanciera(String nombre_recibo, double valor_pagar, String fecha_limite, String estado_recibo){
        this.nombre_recibo=nombre_recibo;
        this.valor_pagar=valor_pagar;
        this.fecha_limite=fecha_limite;
        this.estado_recibo=estado_recibo;
    }
    public InformacionFinanciera(int referencia_recibo, String estado_recibo){
        this.referencia_recibo=referencia_recibo;
        this.estado_recibo=estado_recibo;
    }
    
    
}
