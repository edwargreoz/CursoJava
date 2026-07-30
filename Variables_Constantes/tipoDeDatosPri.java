package Variables_Constantes;

public class tipoDeDatosPri {
    public static void main(String[] args) {
        
        //tipos de datos primitivos 

        int myInt = 21;
        System.out.println(myInt);

        double myDouble = 1.70;
        System.out.println(myDouble);

        //float, long, byte

        char myChar = 'a';
        System.out.println(myChar);


        boolean myBoolean = true;
        myBoolean =false;
        System.out.println(myBoolean);

        //No es un tipo de dato sino una clase.
        String myString = "Hoja soy edwar";

        //optener tipo
        System.out.println(myString.getClass().getSimpleName());



    }
}
