package Practica2;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Histogram <T> {  //clase genérica
    private final T[] vector;

    public Histogram(T[] vector) {
        this.vector = vector;
    }

    public T[] getVector() {
        return vector;
    }
    
    public HashMap<T,Integer> getHisto(){
        HashMap<T,Integer> histo = new HashMap<>();
        
        for (int i = 0; i < vector.length; i++) {
            if(!histo.containsKey(vector[i])){
                histo.put(vector[i],0);
                
            }
            histo.put(vector[i],histo.get(vector[i])+1);
        }
        return histo;
    }
}
    

