/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 6
 * 6-03-2023
 */
import java.util.*;

public class Hashmap {

    Map<String, ArrayList<String>> carro = new HashMap<String, ArrayList<String>>();


    
    /** 
     * @param cate
     * @param producto
     */
    public void agregarColeccion(String cate, String producto){
        carro.putIfAbsent(cate,new ArrayList<>());
        carro.get(cate).add(producto);
    } 

    
    /** 
     * @param inventario
     * @return String
     */
    public String mosCate(String producto, Map<String, ArrayList<String>> inventario){
        String llave = "";
        for(Map.Entry<String, ArrayList<String>> me : inventario.entrySet()){
            ArrayList<String> verificar = me.getValue();
            if(verificar.contains(producto)){
                llave = me.getKey();
            }

        }
        return llave; 
    }

    
    /** 
     * @param inventario
     * @return String
     */
    public String mosCole(Map<String, ArrayList<String>> inventario){
        String coleccion = "";
        for(Map.Entry<String, ArrayList<String>> me : carro.entrySet()){
            for(String producto:me.getValue()){
                coleccion = coleccion + "Producto: " + producto + " Categoria: " + mosCate(producto, inventario);
            }
        }

        return coleccion;
    }

    
    /** 
     * @return String
     */
    public String mosColeOr(Map<String, ArrayList<String>> inventario){
        String coleccion = "";
        for(Map.Entry<String, ArrayList<String>> me : carro.entrySet()){
            for(String producto:me.getValue()){
                coleccion = coleccion + "Producto: " + producto + " Categoria: " + mosCate(producto, inventario);
            }
        }

        return coleccion;
    }

    
    /** 
     * @param inventario
     * @return String
     */
    public String mosPro(Map<String, ArrayList<String>> inventario){
        String coleccion = "";
        for(Map.Entry<String, ArrayList<String>> me : inventario.entrySet()){
            for(String producto:me.getValue()){
                coleccion = coleccion + "Producto: " + producto + " Categoria: " + mosCate(producto, inventario) + "\n";
            }
        }
        return coleccion;
    }


    
    /** 
     * @param inventario
     * @return String
     */
    public String mosProOr(Map<String, ArrayList<String>> inventario){
        String coleccion = "";
        for(Map.Entry<String, ArrayList<String>> me : inventario.entrySet()){
            for(String producto:me.getValue()){
                coleccion = coleccion + "Producto: " + producto + " Categoria: " + mosCate(producto, inventario) + "\n";
            }
        }
        return coleccion;
    }
    
}
