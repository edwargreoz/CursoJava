package Estructuras;

import java.util.ArrayList;

public class listas {

    void main(){
        ArrayList<String> nombres = new ArrayList<>(); //clasic
        //var numeros = new ArrayList<Integer>();//Moderna

        //Tamaño

        System.out.println(nombres.size());

        //Añadir elementos

        nombres.add("Edwar");
        nombres.add("Marino");
        nombres.add("Carito");
        System.out.println(nombres.size());
        
        System.out.println(nombres.getFirst());//Imprimir el primero
        System.out.println(nombres.get(1));
        System.out.println(nombres.getLast());//El ultimo 
        
        //Modificar los elementos
        nombres.set(0, "edwar@gmail.com");
        System.out.println(nombres.getFirst());

        //Eliminar elementos

        nombres.remove(2);
        //System.out.println(nombres.get(2)); Error

        System.out.println(nombres.size());

        //buscar elementos

        System.out.println(nombres);
        System.out.println(nombres.contains("edwar@gmail.com"));

        //Limpiar

        nombres.clear();
        System.out.println(nombres.size());




        

    }
    
}
