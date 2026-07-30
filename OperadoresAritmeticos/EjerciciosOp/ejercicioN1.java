package OperadoresAritmeticos.EjerciciosOp;

import java.util.Scanner;

public class ejercicioN1 {

    //Crear una variable con el resultado de cada operacion aritmetica
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        var a = 10;
        var b = 4;

        System.out.println("Los numeros son " + a + " y " + b);
        System.out.println("Escoja una operacon a realizar(+,-,*,/,%): ");
        var op = teclado.nextLine();
        teclado.close();

        switch (op) {
            case "+":
                var resultado = a + b;
                System.out.println(resultado);
                break;
            case "-":
                var resultado1 = a - b;
                System.out.println(resultado1);  
                break;     
            case "*":
                var resultado2 = a * b;
                System.out.println(resultado2);  
                break;
            case "/":
                var resultado3 = a / b;
                System.out.println(resultado3);  
                break;     
            case "%":
                var  resultado4 = a % b;
                System.out.println(resultado4);  
                break;      
            default:
                System.out.println("Escoja una opcion correcta");
                break;
        }
        

    }


    
}
