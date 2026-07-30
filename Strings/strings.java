package Strings;

public class strings {

    void main (){

        //Declaracion 

        String name = "Edwar";

        var apellido = new String("Gonzalez");

        // Operciones basicos 

        //Concatenar
        System.out.println(name + " " +  apellido);


        //Length

        System.out.println(name.length());

        //Obtner caracter en una posicion en concreta

        System.out.println(name.charAt(1));

        System.out.println(name.charAt(name.length()-1));

        //subString
        //SubCadena

        System.out.println(apellido.substring(3));
        System.out.println(apellido.substring(1,8));

        //Mayusculas y minisculas 

        System.out.println(apellido.toUpperCase());
        System.out.println(apellido.toLowerCase());

        //Comprobar si contiene 

        System.out.println("Gonzalez".contains(apellido));
        System.out.println("Edwar".contains(name));

        //Comparacion

        System.out.println(name.equals("Edwar"));
        System.out.println(name.equals("edwar"));
        System.out.println(name.equalsIgnoreCase("EDWAR"));

        // == VS equals

        var a = "Edwar";
        var b = "Edwar";

        var c = new String("Edwar");

        System.out.println(a == b);//True
        System.out.println(a == c);//False
        System.out.println(a.equals(c));//True

        //Trim 

        System.out.println("Hola me llamo edwar ".trim());

        //Remplace

        System.out.println("Hola me llamo edwar ".replace("edwar", "Agustin"));








        

    }
    
}
