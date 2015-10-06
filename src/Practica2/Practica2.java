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
        int[] array = {1,4,7,1,1,8,4,1,4,9};
        String[] array1 = {"Ana","Juan","Chacha","Fuerte","Piedra","Loco"};
        
        Histogram histo = new Histogram(array);
        
        HashMap<Integer,Integer> histogram = histo.getHisto();
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " : " + histogram.get(key));
            
        }
        
    }
}
