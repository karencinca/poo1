/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author mk
 */
public interface Tributavel {
    public static final double TAXA_CPMF = 0.038;
    public static final double TAXA_IOF = 0.001;
    
    public abstract double calcularImposto(double valor);
}
