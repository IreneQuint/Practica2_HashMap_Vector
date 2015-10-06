package Practica2;

/**
 *
 * @author usuario
 */
public class CalculaHisto {
    
    public static <T> Histogram computeHisto(T [] vector){ //static para que sea de clase y no de instancia, esta es la función a la que vamos a llamar
        Histogram <T> histo = new Histogram<>();
        
        for (T key : vector) {
            histo.increment(key);
        }
        return histo;
    }
}
