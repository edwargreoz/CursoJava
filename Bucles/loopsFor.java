package Bucles;

public class loopsFor {

    void main (){

        //for controlado por contador

        for(int index = 1; index < 5; index++){
            System.out.println("Contador " + index);
            System.out.println("Hola, como estan");

        }

        String[] nombres = {"Edwar","Carito","Agustin","Gianina","Marcos"};

        for (int index = 0 ; index < nombres.length; index++){
            System.out.println(nombres[index]);

        }

    } 
    
}
