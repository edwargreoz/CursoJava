package Variables_Constantes.EjerciciosVC;

import java.util.Scanner;

public class ejercicioN4 {
    public static void main(String[] args) {
        
        //Definir una variable de tipo boolean que indique que me gusta programar

        Scanner teclado = new Scanner(System.in);


        boolean programar = false;
        String op;
        
        System.out.println("Te gusta la programaciòn?.. S/N: ");
        op = teclado.nextLine();
        teclado.close();

        switch (op) {
            case "S":
                programar = true;
                System.out.println("Si esa Preunta es: " + programar);    
            break;
            case "N":
                System.out.println("No esa Pregunta es: "+ programar);
                break;
            default:
                System.out.println("Escoja una opcion correcta");
                break;
        }
    }
    
}
