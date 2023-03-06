/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Principal{

    
    /** 
     * @param args
     * metodo para interactuar con el usuario
     */
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);

        Archivo archivo = new Archivo("./inventario.txt");
        ArrayList<String> lineasProductos = archivo.leerArchivo();
        
        FactoryHashmap respuesta = new FactoryHashmap();


        try{
            System.out.println("Que tipo de Hashmap quiere usar: \n1. HashMap \n2.LinkedHashMap \n3.TreeMap");
            int tipo = teclado.nextInt();
            teclado.nextLine();

            switch(tipo){
                case 1: 
                Map<String, ArrayList<String>> utilizar = respuesta.getInstance(tipo);
                ArrayList<String> listaInte1 = new ArrayList<String>();
                ArrayList<String> listaInte2 = new ArrayList<String>();
                ArrayList<String> listaInte3 = new ArrayList<String>();
                ArrayList<String> listaInte4 = new ArrayList<String>();
                ArrayList<String> listaInte5 = new ArrayList<String>();
                ArrayList<String> listaInte6 = new ArrayList<String>();
                ArrayList<String> listaInte7 = new ArrayList<String>();
                for (String fila : lineasProductos) {
                    ArrayList<String> oneLine = new ArrayList<String>();
                    String [] lineaSeparada = fila.split("\\|");
                    for (String caracter : lineaSeparada) {
                        oneLine.add(caracter);
                    }
                    String llave = oneLine.get(0);
                    llave = llave.trim();
                    String valor = oneLine.get(1);
                    valor = valor.trim();
                    if(llave.equals("Mueble de terraza")){
                        listaInte1.add(valor);
                        utilizar.put(llave, listaInte1);
                    }
                    else if(llave.equals("Sillones de masaje")){
                        listaInte2.add(valor);
                        utilizar.put(llave, listaInte2);
                    }
                    else if(llave.equals("Bebidas")){
                        listaInte3.add(valor);
                        utilizar.put(llave, listaInte3);
                    }
                    else if(llave.equals("Condimentos")){
                        listaInte4.add(valor);
                        utilizar.put(llave, listaInte4);
                    }
                    else if(llave.equals("Frutas")){
                        listaInte5.add(valor);
                        utilizar.put(llave, listaInte5);
                    }
                    else if(llave.equals("Carnes")){
                        listaInte6.add(valor);
                        utilizar.put(llave, listaInte6);
                    }
                    else if(llave.equals("Lácteos")){
                        listaInte7.add(valor);
                        utilizar.put(llave, listaInte7);
                    }
                    
                }
                break;

            }

        } catch (Exception e){
            teclado.nextLine();
            System.out.println("Ingreso algo incorrecto");
        }





        //String prueba = oneLine.get(1);
        //prueba = prueba.trim();

        //System.out.println(oneLine.get(0));
        //System.out.println(prueba);

        
    }
}