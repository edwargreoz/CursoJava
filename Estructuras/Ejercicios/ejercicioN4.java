package Estructuras.Ejercicios;

import java.util.ArrayList;
import java.util.HashSet;

public class ejercicioN4 {

    //Añade 4 valores al Array y y elimina uno a continuacion
    //Crea un HashSet con 2 valores diferentes
    //Añade un un nuevo valor y otro sin al hashSet
    //Elimina uno de los elementos del HashSet

    void main(){

        //1
        System.out.println("Ejercicio -- 4");
        var vacio = new ArrayList<String>();

        vacio.add("queso");
        vacio.add("mandarina");
        vacio.add("pera");
        vacio.add("manzana");


        System.out.println(vacio);
        /*
        Ejercicio -- 4
        [queso, mandarina, pera, manzana]
        */

        //2
        System.out.println("Ejercicio -- 5");
        var set = new HashSet<String>();

        set.add("gaseosa");
        set.add("cerveza");
        set.add("maltin");

        System.out.println(set);

        /*
        Ejercicio -- 5
        [cerveza, maltin, gaseosa]
        */

        //3
        System.out.println("Ejercicio -- 6");
        set.add("gaseosa");
        set.add("corona");

        System.out.println(set);
        
        //Ejercicio -- 6
        //[cerveza, maltin, gaseosa, corona]

        System.out.println("Ejercicio -- 7");

        set.remove("gaseosa");
        System.out.println(set);

        /*
        Ejercicio -- 7
        [cerveza, maltin, corona]
        */

    }
    
}
