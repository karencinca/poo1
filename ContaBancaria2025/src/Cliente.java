
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class Cliente implements Comparable{
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private Usuario usuario;
    private TipoCliente tipo;
    
    //Contrutor padrão
    public Cliente(String nome){ 
        this.nome = nome;
    }
    
    //Construtor alternativo

    public Cliente(String nome, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.tipo = TipoCliente.COMUM;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    private void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCpf(){
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public TipoCliente getTipo() {
        return tipo;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + 
                ", tipo=" + tipo +
                ", cpf=" + cpf + 
                ", endereco=" + endereco + 
                ", telefone=" + telefone + 
                ", email=" + email + '}';
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    private void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int compareTo(Object t) {
        int retorno = 0;
        if (t != null && t instanceof Cliente){
            Cliente outro = (Cliente) t;
            retorno = this.nome.compareTo(outro.nome);
        }
        return retorno;
    }
    
    public static void main(String[] args) {
        Cliente[] pessoas = new Cliente[5];
        
        pessoas[0] = new Cliente("Maria");
        pessoas[1] = new Cliente("Gustavo");
        pessoas[2] = new Cliente("Rodolfo");
        pessoas[3] = new Cliente("Ana");
        pessoas[4] = new Cliente("Marco");
        
        Arrays.sort(pessoas);
        
        for (int i = 0; i < pessoas.length; i++) {
            Cliente pessoa = pessoas[i];
            System.out.println(pessoa);
        }
    }
    
}
