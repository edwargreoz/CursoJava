    package Bucles;

    import java.util.Scanner;

    public class loopDoWhile {

        void main (){

            Scanner scaner = new Scanner(System.in);

            String op;
            double saldo, saldoTemporal;

            saldo = 100;
            saldoTemporal=0;


            
            
            do {
                
                System.out.println("Bienvenido a tu cajero personal: ");
                System.out.println("1) Ver mi Estado de cuenta:  ");
                System.out.println("2) Hacer un deposito:  ");
                System.out.println("3) Retirar Dinero:  ");
                System.out.println("4) Salir.  ");
                System.out.println("Selecione una opcion: ");
                op = scaner.nextLine();
                
                if (op.equals("1")) {
                    
                    System.out.println("Su saldo incial es de " + saldo);
                    
                    
                }else if (op.equals("2")) {
                    System.out.println("Para agregar un depisito ingrese el monto: ");
                    saldoTemporal = scaner.nextDouble();
                    scaner.nextLine();
                    saldo = saldo + saldoTemporal;

                    System.out.println("Su saldo actual es de  " + saldo );
                }else if (op.equals("3")) {
                        System.out.println("Ingrese el momento que requiere retirar: ");
                        saldoTemporal = scaner.nextDouble();
                        scaner.nextLine();
                        if (saldoTemporal > saldo) {
                            System.out.println("El retiro no puede ser mayor al saldo establecido");
                        }else{
                            saldo = saldo - saldoTemporal;

                            System.out.println("Su retiro ha sido efectuado su saldo actual es: " + saldo);
                        }

                }
            }while(!op.equals("4"));   
            System.out.println("Hasta pronto vuelva mas adelante");
            scaner.close();

        }

    }
