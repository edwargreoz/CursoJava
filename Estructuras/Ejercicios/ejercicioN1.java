package Estructuras.Ejercicios;

import java.util.ArrayList;

public class ejercicioN1 {

    //Crear un Array con 5 valores e imprimri su longitud

    void main (){

        var numero = new ArrayList<Integer>();

        numero.add(1);
        numero.add(2);
        numero.add(3);
        numero.add(4);
        numero.add(5);

        System.out.println(numero);

        System.out.println(numero.size());

        /*
        [1, 2, 3, 4, 5]
        5 
        */
    }
    
}
