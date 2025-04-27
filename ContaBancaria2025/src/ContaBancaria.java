
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public abstract class ContaBancaria {
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;
    
    public ContaBancaria(int agencia, int numero, Cliente cliente){
        //super();
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente; 
    }
    
    public ContaBancaria(int agencia, int numero, double saldo, Cliente cliente){
        this(agencia, numero, cliente);
        this.saldo = saldo;
    }
    
    public void creditar(double valor) {
        saldo += valor;
    }
    
    public abstract boolean debitar(double valor);
    
    public void transferirValor(double valor, ContaBancaria destino){
        this.debitar(valor);
        destino.creditar(valor);
    }
    
    public double getTaxaManutencao(){
        return cliente.getTipo().getValor();
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     
    @Override
    public String toString(){
        return ("Agencia =" + this.agencia +
                "\nConta = " + this.numero +
                "\nSaldo = " + this.saldo + 
                "\nPertencente a " + this.cliente);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.agencia;
        hash = 53 * hash + this.numero;
        hash = 53 * hash + Objects.hashCode(this.cliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContaBancaria other = (ContaBancaria) obj;
        if (this.agencia != other.agencia) {
            return false;
        }
        return this.numero == other.numero;
    }

    
    
    
    
}