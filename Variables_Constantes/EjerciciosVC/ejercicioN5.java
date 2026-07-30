package Variables_Constantes.EjerciciosVC;

import java.util.Scanner;

public class ejercicioN5 {
    public static void main(String[] args) {
        
        //Declarar una constante que almancene un correo electronico

        Scanner teclado = new Scanner(System.in);

        final String correo;

        System.out.print("Ingresa un correo a guardar: ");
        correo = teclado.nextLine();

        teclado.close();

        System.out.println("Su correo se a registrado correctamente: " + correo);

    }
    
}
