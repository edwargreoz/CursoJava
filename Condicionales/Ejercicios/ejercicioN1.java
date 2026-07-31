package Condicionales.Ejercicios;

import java.util.Scanner;

public class ejercicioN1 {
    void main (){
        //Ingresar una edad y que este se valide si puedes votar siendo 
        //mayor a 18 o mayor igual a 18

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su edad para saber si puede votar o no: ");
        var edad = teclado.nextInt();
        teclado.close();

        if ( edad > 18) {
            System.out.print("Usted ya puede votar!!");
        }else if (edad == 18) {
            System.out.printf("Felicidades ya tienes %s puedes Votar!!!....",edad);
        }else{
            System.out.printf("No puedes votar tu edad es %s años, eres menor de edad", edad);
        }


    }
}
