package Estructuras.Ejercicios;

import java.util.ArrayList;

public class ejercicioN2 {

    /*Modificar un valor del Array creado e imprimri el indice despues de haberlo 
    modificado
     */

    void main (){

        var numero = new ArrayList<Integer>();

        numero.add(1);
        numero.add(2);
        numero.add(3);
        numero.add(4);
        numero.add(5);

        System.out.println(numero);
        numero.set(0,10 );

        System.out.println(numero); 
        System.out.println(numero.getFirst());
        /*
        [1, 2, 3, 4, 5]
        [10, 2, 3, 4, 5]
        10
        */

    }
    
}
