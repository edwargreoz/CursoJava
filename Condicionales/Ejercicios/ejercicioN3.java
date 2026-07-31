package Condicionales.Ejercicios;

import java.util.Scanner;

public class ejercicioN3 {
    
    void main (){
        //Ingresndo un numero verifica si es positivo o negatico
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        var numero = teclado.nextFloat();
        teclado.close();
        
        if (numero > 0) {
            System.out.println("Su numero ingresado es positivo");
        }else{
            System.out.print("El numero es negativo");
        }
    }
}
