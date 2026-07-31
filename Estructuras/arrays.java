package Estructuras;

public class arrays {

    void main (){
        

        //declaracion y crecion

        int [] numero = new int[5];

        System.out.println(numero.length);

        String[] nombres = {"Edwar","Carito","Agustin","Gianina"};

        System.out.println(nombres);

        //Acceso 
        System.out.println(numero[0]);
        System.out.println(nombres[0]);


        System.out.println((new String[3])[0]);

        //Modificacion

        numero[0] = 2;
        numero[1] = 3;
        numero[2] = 4;
        numero[3] = 5;
        numero[4] = 6;
        System.out.println(numero[0]);
        System.out.println(numero[1]);
        System.out.println(numero[2]);
        System.out.println(numero[3]);
        System.out.println(numero[4]);

        System.out.println("-----------");
        System.out.println(nombres[0]);

        nombres[0] = "edwar@gmail.com";

        System.out.println(nombres[0]);

        //Limpieza

        System.out.println(nombres[1]);
        nombres[1] = null;
        System.out.println(nombres[1]);
        System.out.println(nombres.length);






    }
    
}
