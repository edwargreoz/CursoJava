package Bucles.Ejercicios;

public class ejercicioN5 {

    //Usa un for para recorrer un Array y mostrar sus datos

    void main(){

        int [] datos = new int[6];

        datos[0]=1;
        datos[1]=2;
        datos[2]=3;
        datos[3]=4;
        datos[4]=5;
        datos[5]=6;

        
        for (int i = 0; i < datos.length; i++){
            System.out.println("Dato del Array: "+ i + " = "+ datos[i]);
            
        }
    }
    
}
