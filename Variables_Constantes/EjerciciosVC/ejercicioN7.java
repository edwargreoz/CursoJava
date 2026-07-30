package Variables_Constantes.EjerciciosVC;

import java.util.Scanner;

public class ejercicioN7 {

    public static void main(String[] args) {
        //Definir dos variables de tipo INt a, b Y mostrar el resultado de la suma

        Scanner teclado = new Scanner(System.in);
        int a, b,resultado;
        System.out.print("Ingrese el valor para el primer numero entero: ");
        a = teclado.nextInt();
        System.out.print("Ingrese el valor para el segundo numero entero: ");
        b = teclado.nextInt();
        teclado.close();


        
        resultado = a + b;

        System.out.print("El resltado de la suma de esos dos numero es: " + resultado);


    }
    
}
