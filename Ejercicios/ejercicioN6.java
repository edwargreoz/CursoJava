//Calculadora con seleccion multiple de operadores

package Ejercicios;

import java.util.Scanner;

public class ejercicioN6 {
    public static void main(String[] args) {
        double num1,num2,total;
        String op;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido Ingrese dos numero para sumar: ");
        


        System.out.print("Numero 1: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Numero 2: ");
        num2 = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Elija una opcion +,-,*,/: ");
        op = teclado.nextLine();

        teclado.close();

        switch (op) {
            case "+":
                total = num1 + num2;
                System.out.println("La suma de " + num1 + " + " + num2+ " es: " + total);
                break;
            case "-":
                total = num1 - num2;
                System.out.println("La resta de " + num1 + " - " + num2 + " es" + total);
                break;
            case "*":
                total = num1 * num2;
                System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es " + total);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("No puedes dividir " + num1+ " entre " + num2 +" este tiene que ser diferente de 0");
                    break;
                }else{
                    total = num1 / num2;
                    System.out.println("La divicion de " + num1 + " / " + num2 + " es" + total);
                    break;
                }
            default:
                System.err.print("Ingrese una de las opciones correctas");
                break;
        }

        
    }
}
