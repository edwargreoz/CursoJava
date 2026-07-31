package Condicionales.Ejercicios;

import java.util.Scanner;

public class ejercicioN4 {

    void main(){

        //Crear un progrma que indique si el numero es inpar o par
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        var numero = teclado.nextInt();
        teclado.close();

        if ( numero %2 == 0  ){
            System.out.printf("El numero %s es par", numero);
        }else{
            System.out.printf("El numero %s es impar", numero);
        }
        
    }
    
}
