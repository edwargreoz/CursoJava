package Condicionales.Ejercicios;

import java.util.Scanner;

public class ejercicioN5 {

    //Verificar si un numero esta dentro del 1 al 100
    void main(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        var numero = teclado.nextInt();
        teclado.close();

        if ( numero >= 1 && numero <= 100 ){
            System.out.printf("El numero %s esta dentro del rango del 1 al 100", numero);
        }else{
            System.out.printf("El numero %s no esta dentro del rango", numero);
        }
    }
    
}
