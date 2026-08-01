package Estructuras.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class ejercicioN10 {

    //Dado un array, trasdformalo en un Arraylis, luego en un HashSet 
    //Y por ultimo en un HashMap con clave y valor igual


    void main (){

        String[] datos = {"Edwar","Marino","Carito"};

        System.out.println(datos.length);

        System.out.println(datos[0]);
        System.out.println(datos[1]);
        System.out.println(datos[2]);

        

        ArrayList<String> listaDatos = new ArrayList<>(Arrays.asList(datos));

        System.out.println(listaDatos);


        var setDatos = new HashSet<String>(listaDatos);

        System.out.println(setDatos);

        HashMap<String,String> mapDatos = new HashMap<>();

        
        setDatos.forEach(keyName->mapDatos.put(keyName, keyName));

        System.out.println(mapDatos);


    }
    
}
