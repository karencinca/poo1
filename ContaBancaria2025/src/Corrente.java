/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class Corrente extends ContaBancaria implements Tributavel {

    public Corrente(int agencia, int numero, Cliente cliente) {
        super(agencia, numero, cliente);
    }

    @Override
    public boolean debitar(double valor) {
        double saldo = getSaldo();
        if(valor + calcularImposto(valor) <= saldo ){
            setSaldo(saldo - (valor+calcularImposto(valor)));
            return true;
        }
        return false;
    }

    @Override
    public double calcularImposto(double valor) {
        double imposto = valor*Tributavel.TAXA_CPMF;
        return imposto;
    }
    
    
    
}
