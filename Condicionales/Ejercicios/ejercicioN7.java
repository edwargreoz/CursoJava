package Condicionales.Ejercicios;

import java.util.Scanner;

public class ejercicioN7 {
    void main (){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa tu nota (0-100): ");
        var nota = teclado.nextInt();
        teclado.close();

        if (nota >= 75 && nota < 80) {
            System.out.printf("Su nota %s indica que aprobado con la minima", nota);
        }else if (nota >= 80 && nota < 90) {
             System.out.printf("Su nota %s indica que aprobado con una calificacion buena", nota);
        }else if (nota >= 90 && nota < 100) {
            System.out.printf("Su nota %s indica que aprobado con una calificacion sobresaliente", nota);  
        }else if (nota == 100) {
            System.out.printf("Su nota %s indica que aprobado con una calificacion Perfecta", nota);
        }else{
            System.out.printf("Su nota %s indica que suspendido la materia", nota);
        }

    }

    
}
