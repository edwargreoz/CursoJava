package OperadoresAritmeticos.EjerciciosOp;

public class ejercicioN2 {
//Crear una variable para cada tipo de asignacion 
    void main (){
        var a = 3;
        var b = 2;

         a= b; // En esta asiganacion tenemos que a vale ahora 2.
        System.out.println(a);//No muestra exactamente el valor de a = 2
        a = b + 2; // aqui le asiganamos el valor de b que es 2 a la variable a sumando + 2
        // lo que ahora como resutlado nos da que a ahora vale 4
        System.out.println(a);//nues muestra 4
        a += b; // En esta parte tenemos que a = 4 sumano dos veces b que vale 2 
        // tenemos que a + b (2) = 6
        System.out.println(a); // Aqui mostramos el resultado de siendo este = 6
        a -= b; // como a nos dio como resultado que su nuevo valor asignado era 6 le restamos una b al valor de a
        //a - b (2) = 4
        System.out.println(a); // Mostramos el resultado de la nueva variable de a = 4
        a *= b; // En esta nueva asigancion tenemos que a * b = 8 dado que a = 4 * b = 2 como resultado tenemos 8
        System.out.println(a); //Ahora la variable tiene asigado el nuevo valor B 
        a /= b; //Ahora como a vale 8 tenemos que la nueva asiganncion es la division de a (8) / b(2) = 4
        System.out.println(a);// a ahora contiene el valor de 4. 
        a %= b; //El valor de a = 4 entronces si le sacamos un modal en base a que b ahora vale 2. Se espera un resltado de 0
        System.out.println(a);//El resultado efectivamente es cero. 
        /*
        valores resultados
        2
        4
        6
        4
        8
        4
        0
        */



    }
    
}
