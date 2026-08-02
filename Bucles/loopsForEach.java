package Bucles;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class loopsForEach {

    void main(){
        
        
        String[] nombres = {"Edwar","Carito","Agustin","Gianina"};
        
        for (String nombre: nombres){
            System.out.println(nombre);

        }

        HashSet<Integer> numeros = new HashSet<>(); 

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        var emails = new HashMap<String,String>();
        
        emails.put("Edwar", "edwar@gmail.com");
        emails.put("Carito", "carito@gmail.com");
        emails.put("Agustin", "agustin@gmail.com");

        for (Map.Entry<String,String> email: emails.entrySet()) {
            System.out.println(email.getKey());
            System.out.println(email.getValue());
            
        }


    }  

    
}
