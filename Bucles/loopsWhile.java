package Bucles;

import java.util.Scanner;

public class loopsWhile {


    void main(){

        Scanner teclaodo = new Scanner(System.in);
        System.out.println("Bienvenido registra tu contraseña: ");
        var password = teclaodo.nextLine();
        
        var intentos = 5; 
            
        while (intentos > 0) {
            
            System.out.printf("Ingrese su contraseña, recuerde que tiene %s intentos: ", intentos);
            var pass = teclaodo.nextLine();

            intentos -= 1 ;

            if (password.equals(pass)) {
                System.out.println("Bienvenido has inciado session correctamente");
                break;
            }else{
                System.out.println("Contrasela incorrecta. intentalo nuevamente");
                if (intentos == 0) {
                    System.out.println("Se a quedado sin intentos");
                    
                }
            }
            
        }
        teclaodo.close();
    
    }
    
}
