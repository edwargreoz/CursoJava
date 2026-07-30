package Condicionales.Switch;

import java.util.Scanner;



public class condicionalSwitch {

    void main (){

        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Ingrese la contraseña: ");
        var pass = teclado.nextLine();
        teclado.close();


        switch (pass) {
            case "edwar123":
                System.out.print("Inciando sesion...");
                break;
            default:
                System.err.println("Contraseña incorrecta..");;
                break;
        }
    }
    
}
