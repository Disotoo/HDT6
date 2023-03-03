import java.util.*;

public class FactoryHashmap {
    Map<String, ArrayList<String>> hash;

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
