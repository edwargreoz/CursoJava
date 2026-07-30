package Variables_Constantes.EjerciciosVC;

import java.util.Scanner;

public class ejercicioN6 {
    
    public static void main(String[] args) {
        // definir un char que guarde la inicial de tu nombre

        Scanner teclado = new Scanner(System.in);
        final String nombreC ;
        char inicial;


        System.out.print("1. Ingrese su nombre completo: ");
        nombreC = teclado.nextLine();

        System.out.print("2. Ingrese la primera lentra de su nombre: ");
        inicial = teclado.next().charAt(0);

        teclado.close();

        System.out.println("Su nombre es: " + nombreC);
        System.out.println("Su Incial guardada es: " + inicial);
        


    }
}
