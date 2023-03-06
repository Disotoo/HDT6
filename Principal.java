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
        Hashmap tienda = new Hashmap();
        
        FactoryHashmap respuesta = new FactoryHashmap();
        ArrayList<String> listaInte1 = new ArrayList<String>();
        ArrayList<String> listaInte2 = new ArrayList<String>();
        ArrayList<String> listaInte3 = new ArrayList<String>();
        ArrayList<String> listaInte4 = new ArrayList<String>();
        ArrayList<String> listaInte5 = new ArrayList<String>();
        ArrayList<String> listaInte6 = new ArrayList<String>();
        ArrayList<String> listaInte7 = new ArrayList<String>();


        try{
            System.out.println("Que tipo de Hashmap quiere usar: \n1. HashMap \n2.LinkedHashMap \n3.TreeMap");
            int tipo = teclado.nextInt();
            teclado.nextLine();
            boolean salir = false;

            switch(tipo){
                case 1: 
                Map<String, ArrayList<String>> utilizar = respuesta.getInstance(tipo);
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
                while(salir == false){
                    System.out.println("\nFunciones: \n1. Agregar producto \n2. Mostrar categoria del producto \n3. Mostrar datos del producto \n4. Mostrar productos ordenados \n5. Mostrar inventario \n6. Mostrar inventario existente \n7. Salir\n");
                    int opcion = teclado.nextInt();
                    teclado.nextLine();
                    switch(opcion){
                        case 1: 
                        System.out.println("Nombre del producto: ");
                        String producto = teclado.nextLine();
                        System.out.println("Nombre de la categoria: ");
                        String categoria = teclado.nextLine();
                        tienda.agregarColeccion(categoria, producto);
                        break;

                        case 2: 
                        System.out.println("Nombre del producto: ");
                        String producto1 = teclado.nextLine();
                        System.out.println("\nCategoria del producto: ");
                        System.out.println(tienda.mosCate(producto1, utilizar));
                        break;

                        case 3: 
                        System.out.println(tienda.mosCole(utilizar));
                        break;

                        case 5:
                        System.out.println(tienda.mosPro(utilizar));

                        case 6: 
                        System.out.println(tienda.mosProOr(utilizar));

                        case 7:
                        salir = true;
                        break;
                    }
                }
                break;
                
                case 2: 
                Map<String, ArrayList<String>> utilizar1 = respuesta.getInstance(tipo);
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
                        utilizar1.put(llave, listaInte1);
                    }
                    else if(llave.equals("Sillones de masaje")){
                        listaInte2.add(valor);
                        utilizar1.put(llave, listaInte2);
                    }
                    else if(llave.equals("Bebidas")){
                        listaInte3.add(valor);
                        utilizar1.put(llave, listaInte3);
                    }
                    else if(llave.equals("Condimentos")){
                        listaInte4.add(valor);
                        utilizar1.put(llave, listaInte4);
                    }
                    else if(llave.equals("Frutas")){
                        listaInte5.add(valor);
                        utilizar1.put(llave, listaInte5);
                    }
                    else if(llave.equals("Carnes")){
                        listaInte6.add(valor);
                        utilizar1.put(llave, listaInte6);
                    }
                    else if(llave.equals("Lácteos")){
                        listaInte7.add(valor);
                        utilizar1.put(llave, listaInte7);
                    }
                    
                }
                while(salir == false){
                    System.out.println("\nFunciones: \n1. Agregar producto \n2. Mostrar categoria del producto \n3. Mostrar datos del producto \n4. Mostrar productos ordenados \n5. Mostrar inventario \n6. Mostrar inventario existente \n7. Salir\n");
                    int opcion = teclado.nextInt();
                    teclado.nextLine();
                    switch(opcion){
                        case 1: 
                        System.out.println("Nombre del producto: ");
                        String producto = teclado.nextLine();
                        System.out.println("Nombre de la categoria: ");
                        String categoria = teclado.nextLine();
                        tienda.agregarColeccion(categoria, producto);
                        break;

                        case 2: 
                        System.out.println("Nombre del producto: ");
                        String producto1 = teclado.nextLine();
                        System.out.println("\nCategoria del producto: ");
                        System.out.println(tienda.mosCate(producto1, utilizar1));
                        break;

                        case 3: 
                        System.out.println(tienda.mosCole(utilizar1));
                        break;

                        case 5:
                        System.out.println(tienda.mosPro(utilizar1));

                        case 6: 
                        System.out.println(tienda.mosProOr(utilizar1));

                        case 7:
                        salir = true;
                        break;
                    }
                }
                break;

                case 3: 
                Map<String, ArrayList<String>> utilizar2 = respuesta.getInstance(tipo);
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
                        utilizar2.put(llave, listaInte1);
                    }
                    else if(llave.equals("Sillones de masaje")){
                        listaInte2.add(valor);
                        utilizar2.put(llave, listaInte2);
                    }
                    else if(llave.equals("Bebidas")){
                        listaInte3.add(valor);
                        utilizar2.put(llave, listaInte3);
                    }
                    else if(llave.equals("Condimentos")){
                        listaInte4.add(valor);
                        utilizar2.put(llave, listaInte4);
                    }
                    else if(llave.equals("Frutas")){
                        listaInte5.add(valor);
                        utilizar2.put(llave, listaInte5);
                    }
                    else if(llave.equals("Carnes")){
                        listaInte6.add(valor);
                        utilizar2.put(llave, listaInte6);
                    }
                    else if(llave.equals("Lácteos")){
                        listaInte7.add(valor);
                        utilizar2.put(llave, listaInte7);
                    }
                    
                }
                while(salir == false){
                    System.out.println("\nFunciones: \n1. Agregar producto \n2. Mostrar categoria del producto \n3. Mostrar datos del producto \n4. Mostrar productos ordenados \n5. Mostrar inventario \n6. Mostrar inventario existente \n7. Salir\n");
                    int opcion = teclado.nextInt();
                    teclado.nextLine();
                    switch(opcion){
                        case 1: 
                        System.out.println("Nombre del producto: ");
                        String producto = teclado.nextLine();
                        System.out.println("Nombre de la categoria: ");
                        String categoria = teclado.nextLine();
                        tienda.agregarColeccion(categoria, producto);
                        break;

                        case 2: 
                        System.out.println("Nombre del producto: ");
                        String producto1 = teclado.nextLine();
                        System.out.println("\nCategoria del producto: ");
                        System.out.println(tienda.mosCate(producto1, utilizar2));
                        break;

                        case 3: 
                        System.out.println(tienda.mosCole(utilizar2));
                        break;

                        case 5:
                        System.out.println(tienda.mosPro(utilizar2));

                        case 6: 
                        System.out.println(tienda.mosProOr(utilizar2));

                        case 7:
                        salir = true;
                        break;
                    }
                }
                break;

                default:
                break;

            }

        } catch (Exception e){
            teclado.nextLine();
            System.out.println("Ingreso algo incorrecto");
        }
        
    }
}