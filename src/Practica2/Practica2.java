package Practica2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] array = {1,4,7,1,1,8,4,1,4,9};
        String[] array1 = {"Ana","Juan","Chacha","Fuerte","Piedra","Loco","Ana"};
        
        Histogram<Integer> histogram = CalculaHisto.computeHisto(array);
        
        for (Object key : histogram.keySet()) {
            System.out.println(key + " : " + histogram.get(key));
            
        }
        
    }
}
