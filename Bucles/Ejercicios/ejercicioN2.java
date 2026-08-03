package Bucles.Ejercicios;

import java.util.ArrayList;

public class ejercicioN2 {

    //Usar un Do While para mostrar datos de un ArrayList

    void main(){

        var datos = new ArrayList<>();

        datos.add(0, "Edwar");
        datos.add(1, "Jose");
        datos.add(2, "Cecilio");
        datos.add(3, "John");
        datos.add(4, "Runely");
        datos.add(5, "Carito");

        

        int index = 0;
        do{
            System.out.println(datos.get(index));
            index++;

        }while(index < datos.size());
        

    }
    
}
