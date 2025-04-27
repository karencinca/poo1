/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author mk
 */
public class Principal {
    
    public static void main(String[] args) {
        
         Cliente[] pessoas = new Cliente[5];
        
        pessoas[0] = new Cliente("Maria");
        pessoas[1] = new Cliente("Gustavo");
        pessoas[2] = new Cliente("Rodolfo");
        pessoas[3] = new Cliente("Ana");
        pessoas[4] = new Cliente("Marco");
        
        String s = JOptionPane.showInputDialog("Escolha uma das opcoes:"
                + "\n 1 - Ordenar pelo nome"
                + "\n 2 - Ordenar pelo cpf"
                + "\n 3 - Ordenar pelo tipo");
        
        int n = Integer.parseInt(s);
        
        switch(n){
            case 1: Arrays.sort(pessoas);
                break;
            case 2: Arrays.sort(pessoas, new OrdenaByCpf());
                break;
            case 3: 
                break;
        }
        
    }
}
