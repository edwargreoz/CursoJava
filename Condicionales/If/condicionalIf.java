package Condicionales.If;

import java.util.Scanner;

public class condicionalIf {
    void main (){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa tu edad para ver si puedes ingresar o no: ");
        var edad = teclado.nextInt();
        teclado.close();
        
        System.out.println(edad >= 18);


        if (edad > 18){
            System.out.println("Eres mayor de edad");
        }else if( edad == 18){
            System.out.println("acaba de cumplir 18");
            
        }else {
            System.out.println("No puedes ingresar eres menor de edad");
        }


    }
    
}
