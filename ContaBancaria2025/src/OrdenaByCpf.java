
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mk
 */
public class OrdenaByCpf implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        int retorno = 0;
        if (t != null && t1 != null && t instanceof Cliente && t1 instanceof Cliente) {
            Cliente c1 = (Cliente) t;
            Cliente c2 = (Cliente) t1;

            retorno = c1.getCpf().compareTo(c2.getCpf());
        }
        return retorno;
    }

}
