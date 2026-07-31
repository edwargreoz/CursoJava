package Condicionales.Ejercicios;

import java.util.Scanner;

public class ejercicioN8 {

     void main (){

        Scanner teclado = new Scanner(System.in);

        System.out.println("************************* ");
        System.out.println("BIENVENIDO AL CINE");
        System.out.println("*************************");

        System.out.print("Vienes acompañado?(S/N): ");
        var acompañado = teclado.next();
        System.out.print("Cuantos años tienes?: ");
        var edad = teclado.nextInt();
        
        
        teclado.close();

        if ( edad > 15 || acompañado.equalsIgnoreCase("s")) {
            System.out.println("Puedes ingresar al cine");
        }else{
            System.out.println("No puedes ingresar al cine");
        }


     }
}