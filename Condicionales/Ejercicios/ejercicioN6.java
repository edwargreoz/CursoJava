package Condicionales.Ejercicios;

import java.util.Scanner;

public class ejercicioN6 {

    void main (){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero para saber el dia: ");
        var numeroSemana = teclado.nextInt();
        teclado.close();

        switch (numeroSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No pertenece a un dia de la semana");
                break;
        }


    }

    
}
