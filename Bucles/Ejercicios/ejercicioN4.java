package Bucles.Ejercicios;


public class ejercicioN4 {
    
    //Recorre un array de 5 numero e imprimr la suma 

    void main(){

        int [] datos = new int[5];

        datos[0]=1;
        datos[1]=2;
        datos[2]=3;
        datos[3]=4;
        datos[4]=5;

        var index = 0;
        var suma = 0;

        do{
            System.out.println("Visitando el numero " + datos[index]);

            suma = suma + datos[index];
            /*
            indice 0 apunta a 1.
            lo que suma = 0 + 1
            suma = 1;
            indice 1 apunta a 2;
            lo que suma es = 1 + 2
            suma 3
            indice 2 apunta 3;
            lo que suma es = 3 + 3;
            suma 6;
            indice 3 apunta 4;
            lo que suma es = 6 + 4;
            suma 10
            indice 4 apunta 5;
            lo que suma es = 10 + 5
            suma = 10;           
            */
            index++;
            //indice termina con una logitud de 5 por lo que 5 es menor que la logidut
            //del array 5 lo que hace que termine el ciclo
        }while(index < datos.length);
        System.out.println("La suma de todo el array es; " + suma);

    }
}
