package OperadoresAritmeticos.EjerciciosOp;

public class ejercicioN3 {
    //imprimir 3 comparaciones verdaderas con diferentes opciones de comparacion

    void main (){
        var a = 4;
        var b = 5;
       //Compraciones verdaderas 
        System.out.println(a == b - 1);
        System.out.println(a != b );
        System.out.println(a < b);

        //Compraciones falsas 
        System.out.println(a == b );
        System.out.println(a + 2 == b );
        System.out.println(a > b);
    }
    
}
