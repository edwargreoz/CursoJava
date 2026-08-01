package Estructuras;

import java.util.HashSet;

public class set {
        
        
        void main  (){
             HashSet<String> nombres = new HashSet<>();

             var numeros = new HashSet<Integer>();

             // Tamaño

             System.out.println(nombres.size());
             System.out.println(numeros.size());
            
            nombres.add("Edwar");
            nombres.add("Marino");
            nombres.add("Carito");
            System.out.println(nombres.size());

            //acceder a los elemtos

            System.out.println(nombres);

            //System.out.println(nombres.getFirst());//Imprimir el primero - Generan error
            // System.out.println(nombres.get(1)); // genera error
            //   //System.out.println(nombres.getLast());//El ultimo  Generan error  

            
            nombres.remove("Marino");
            System.out.println(nombres.size());
            
            //Buscar elementos

            System.out.println(nombres.contains("Edwar")); // True
            
            System.out.println(nombres);
            nombres.add("Edwar");
            System.out.println(nombres.size());
            System.out.println(nombres);


            var apellidos = new HashSet<String>();

            apellidos.add("Gonzalez");
            apellidos.add("Risco");
            apellidos.add("Requejo");
            apellidos.add("Edwar");

            System.out.println("********");

            System.out.println(nombres);
            System.out.println(apellidos);

            nombres.addAll(apellidos);

            System.out.println("********");

            System.out.println(nombres);

            System.out.println("********");

            nombres.removeAll(apellidos);
            System.out.println(nombres);
            System.out.println(apellidos);

            nombres.retainAll(apellidos);
            
            System.out.println("********");
            System.out.println(nombres);





           






        }

    
}
