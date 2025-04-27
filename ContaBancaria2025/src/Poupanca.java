
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class Poupanca extends ContaBancaria implements Rentavel{
    private int diaAniversario;
 
    public Poupanca(int agencia, int numero, Cliente cliente, int diaAniversario){
       super(agencia, numero, cliente);
       this.diaAniversario = diaAniversario;
    }
    
     public Poupanca(int agencia, int numero, Cliente cliente){
       this(agencia, numero, cliente, LocalDate.now().getDayOfMonth()); 
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }
    
    @Override
    public double calcularRendimento(){
        int dia = LocalDate.now().getDayOfMonth();
        if (dia == diaAniversario){ 
            double rendimento = getSaldo() * Rentavel.TAXA_POUPANCA;
            double saldo = getSaldo();
            setSaldo(saldo+=rendimento);
            return rendimento;
        } 
        return 0;
    } 

    @Override
    public String toString() {
        return super.toString() + "\nPoupanca{" + "diaAniversario=" + diaAniversario + '}';
    }

    @Override
    public boolean debitar(double valor) {
        if(getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }
    
    
    
}
