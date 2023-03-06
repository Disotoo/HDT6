/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 6
 * 6-03-2023
 */
import java.util.*;

public class FactoryHashmap {
    Map<String, ArrayList<String>> hash;

    
    /** 
     * @return Map<String, ArrayList<String>>
     */
    public Map<String,ArrayList<String>> getHash() {
        return this.hash;
    }

    
    /** 
     * @param hash
     */
    public void setHash(Map<String,ArrayList<String>> hash) {
        this.hash = hash;
    }


    
    /** 
     * @param tipo
     * @return Map<String, ArrayList<String>>
     */
    public Map<String, ArrayList<String>> getInstance(int tipo){

    
        switch (tipo) {
            case 1:
            hash = new HashMap<String, ArrayList<String>>();
            break;

            case 2:
            hash = new LinkedHashMap<String, ArrayList<String>>();
            break;

            case 3:
            hash = new TreeMap<String, ArrayList<String>>();
            break;

            default:
            break;
        }
        return hash;

    } 
}
