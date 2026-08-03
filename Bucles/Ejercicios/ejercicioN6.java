package Bucles.Ejercicios;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ejercicioN6 {

    //Use un ForEach para recorrer un HashMap y un HashSet

    void main (){

        HashSet<Integer> num = new HashSet<>();
        
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        for (Integer numero : num) {
            System.out.println(numero);
        }

        var claves = new HashMap<String,String>();

        claves.put("maria","Maria123");
        claves.put("mario","marino123");
        claves.put("ester","ester123");
        claves.put("edwar","edwar123");
        claves.put("miguel","miguel123");


        for (Map.Entry<String,String> pass: claves.entrySet()) {
            System.out.println("User: "+pass.getKey()+" : "+ "clave: "+ pass.getValue());
            
        }


    }
    
}
