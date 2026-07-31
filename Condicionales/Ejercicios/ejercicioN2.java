package Condicionales.Ejercicios;

public class ejercicioN2 {

    void main (){

        //Declarar dos numeros y mostrar cual es mayor o si son iguales

        var a = 20;
        var b = 100;

        if (a>b) {
            System.out.println(a + " es mayor que " + b);
        }
        else if (a < b) {
            System.out.println(a + " es menor que " + b);
        }else {
            System.out.println(a+ " es igual que "+ b);
        }
    }
    
}
