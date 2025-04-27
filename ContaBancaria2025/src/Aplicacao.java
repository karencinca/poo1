
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class Aplicacao extends ContaBancaria implements Tributavel, Rentavel{
    
    private int dataCriacao;
    private int dataVencimento;
   
    public Aplicacao(int dataVencimento, int agencia, 
            int numero, double saldo, Cliente cliente) {
        super(agencia, numero, saldo, cliente);
        this.dataCriacao = LocalDate.now().getDayOfMonth();
        this.dataVencimento = dataVencimento;
    }
    
    public double calcularRendimento(){
         int dia = LocalDate.now().getDayOfMonth();
        if (dia == dataCriacao){ 
            double rendimento = getSaldo() * Rentavel.TAXA_APLICACAO;
            double saldo = getSaldo();
            setSaldo(saldo+=rendimento);
            return rendimento;
        } 
        return 0;
    }
    
    @Override
    public boolean debitar(double valor){
        double imposto = calcularImposto(valor);
        if(getSaldo() >= (valor + imposto)){
            setSaldo(getSaldo() - (valor + imposto));
            return true;
        }
        
        return false;
    }
    
    @Override
    public double calcularImposto(double valor){
        return valor* Tributavel.TAXA_IOF;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAplicacao{" + "dataCriacao=" + dataCriacao + ", dataVencimento=" + dataVencimento + '}';
    }   

}
