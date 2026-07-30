package OperadoresAritmeticos.EjerciciosOp;

public class ejercicioN6 {

    void main (){

        System.out.println(true && true || true && false);
        //interntamente se aprecia que el primer segmente nos da (true) || (false)
        //este nos arroja un valor de true. Ya que el operador logico OR solo nos da false cuando ambos son false
        System.out.println(true && false || false && false);
        // Y aqui apreciamos eso mismo, ambos nos dan como resultado false y el operador OR comprara esos dos
        //false || false = false

        var a = 5;
        var b = 3;

        System.out.println(a == b || b != a);
        /* Aqui la compracion es la siguiente en la primera indicamos que a == b lo que es false
        y luego de eso se evalua donde se dice que b es diferente de a != lo que es true
        false || true = true */

        //Añandiendo una negacio como harimos para que el resultado sea false.
        System.out.println(a == b || !(b != a));
        //si en la compracion de b!= a negamos su resultado tenemos como salida un false 
        //Entonces tendrias false de la primera comparacio y un !(true) = false de la segunda
        // false || false = false 


    }
}
