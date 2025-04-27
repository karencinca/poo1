/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public enum TipoCliente {
    VIP(0),
    COMUM(30);
    
    private double valor;
    
    private TipoCliente(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return this.valor;
    }
}
