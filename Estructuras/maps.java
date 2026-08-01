package Estructuras;

import java.util.HashMap;

public class maps {

    void main(){

        //declaracion
        var nombres = new HashMap<String,String>();

        //Tamaño

        //System.out.println(nombres.size());

        //Agregar Valores

        nombres.put("Edwar", "edwar@gmail.com");
        nombres.put("Carito", "carito@gmail.com");
        nombres.put("Agustin", "agustin@gmail.com");

        System.out.println("****************");

        System.out.println(nombres);
        System.out.println(nombres.size());
        
        //Acceder a elemtos

        System.out.println(nombres.get("Edwar"));
        
        //verificar elementos 
        //Si = retorna elemento asociado
        //No = retonra Null
        
        System.out.println(nombres.containsKey("Dev"));//False
        System.out.println(nombres.containsKey("Carito"));//True

        System.out.println(nombres.containsValue("edwar@gmail.com"));//True


        //Eliminar Elementos

        System.out.println(nombres.remove("Edwar"));
        System.out.println(nombres);

        //Modificar valores 

        nombres.put("Carito", "rivas@gmail.com");

        System.out.println(nombres);

        //Solo si el valor ya existe y evita la creacion 

        nombres.replace("Carito","cari@gmail.com");

        System.out.println(nombres);
        //Añadir solo si no existe antes

        nombres.putIfAbsent("Edwar", "edwar@gmail.com");
        System.out.println(nombres);

        //Otras operaciones
        System.out.println(nombres.isEmpty());

        var valores = nombres.values();

        System.out.println(valores);









        


    }
    
}
