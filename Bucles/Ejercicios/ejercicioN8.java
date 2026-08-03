package Bucles.Ejercicios;



public class ejercicioN8 {

    //Usar un break para detener cunado un se cuentre un numero en especifico

    void main (){

        int [] numero = new int[20];

        numero[0]=8;
        numero[1]=7;
        numero[2]=6;
        numero[3]=5;
        numero[4]=4;
        numero[5]=3;
        numero[6]=2;
        numero[7]=1;
        numero[8]=0;
        numero[9]= -1;
        numero[10]= -2;
        numero[11]= -3;
        numero[12]= -4;
        numero[13]= -5;

        for (int i = 0; i<numero.length; i++ ){
            if (numero[i] == -2) {
                System.out.println("Se encontro similitud con el valor -2 = " + numero[i]);
        
                break;
                
            }else{
                System.out.println("Aun no se encuntra similitud ");
            }
        }
        

        
        


    }


   
    
}
