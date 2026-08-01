package Estructuras.Ejercicios;

import java.util.HashMap;

public class ejercicioN8 {


    void main (){

        
        //Crea un HashMap donde la clave sea el nombre y valor
        //el numero del telefono. Añade 3 contactos
         var datos = new HashMap<String,Integer>();

        datos.put("Edwar",987456321);
        datos.put("Marino",963852741);
        datos.put("Carito",987596322);

        System.out.println(datos);
        System.out.println(datos.size());
        /*
        {Carito=987596322, Edwar=987456321, Marino=963852741}
         3
        */

        System.out.println("Ejercicio -- 9");

        //Modifica uno de los contactos y el otro eliminalo
        System.out.println(datos);

        System.out.println(datos.get("Carito"));
        datos.put("Carito", 951753852);
        System.out.println(datos.get("Carito"));

        datos.remove("Marino");
        System.out.println(datos);

        /*
            Ejercicio -- 9
        {Carito=987596322, Edwar=987456321, Marino=963852741}
        987596322
        951753852
        {Carito=951753852, Edwar=987456321}
        */


    }
    
}
