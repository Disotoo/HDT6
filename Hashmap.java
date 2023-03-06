import java.util.*;

public class Hashmap {

    Map<String, ArrayList<String>> carro = new HashMap<String, ArrayList<String>>();


    public void agregarColeccion(String cate, String producto){
        carro.putIfAbsent(cate,new ArrayList<>());
        carro.get(cate).add(producto);
    } 

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

    public String mosCole(Map<String, ArrayList<String>> inventario){
        String coleccion = "";
        for(Map.Entry<String, ArrayList<String>> me : carro.entrySet()){
            for(String producto:me.getValue()){
                coleccion = coleccion + "Producto: " + producto + " Categoria: " + mosCate(producto, inventario);
            }
        }

        return coleccion;
    }

    public String mosColeOr(){

        return "a";
    }

    public String mosPro(Map<String, ArrayList<String>> inventario){
        String coleccion = "";
        for(Map.Entry<String, ArrayList<String>> me : inventario.entrySet()){
            for(String producto:me.getValue()){
                coleccion = coleccion + "Producto: " + producto + " Categoria: " + mosCate(producto, inventario) + "\n";
            }
        }
        return coleccion;
    }


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
