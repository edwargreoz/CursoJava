//explorar las los diferentes system.xxx.prinln , mas alla del out
package Ejercicios;

import java.util.Scanner;

public class ejercicioN5 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        //definicon de variable de tipo Scanner para poder solicitar al usuairo ingresar algun
        //dato mediante el teclado
        Scanner teclado = new Scanner(System.in);

        //System.err para mostrar alertas ante alguna validacion incorrecta
        System.err.println("ERRROR! No se a identificado un comando correctamente escrito ");
        

        //Mostramos un linea de codigo en el cual vamos a solicitar al usuario ingresar
        // nombre y edadd */

        System.out.println("Ingrese su nombre:\nIngrese su edad: ");
        nombre = teclado.nextLine();
        edad =  Integer.parseInt(teclado.nextLine());
        
        System.out.println("Su nombre es: " + nombre + "\n" + "Su edad es: " + edad);

        teclado.close();
        

        
        //guardamos el timepo incial en nuestra variable tiempoInicio
        long tiempoIncio = System.currentTimeMillis();

        //simular tarea para para el tiempo final se va hacer un bucle for

        for (int i = 0 ; i < 100_000_000; i++){
            Math.sin(i);
        }

        //guardamos el timepo en el cual finaliza 
        long tiempoFinal = System.currentTimeMillis();

        //calculamos lo que demoro en realizarce la tarea

        long tiempoTotal  = tiempoFinal - tiempoIncio;

        System.out.println("La tarea demoro aproximadamente: " + tiempoTotal +" Milisegundos");



        //system.exit
        
        System.out.println("1. Inciando el sistema de validadicon de edad ");
        
        if (edad <18 ){
            System.err.println("!ALERTA! Edad no permitida, es menor de edad");
            System.exit(1);
        }else{
            System.out.println("Su edad es: " +edad+" es mayor de edad");
        }


    }  
    
}
