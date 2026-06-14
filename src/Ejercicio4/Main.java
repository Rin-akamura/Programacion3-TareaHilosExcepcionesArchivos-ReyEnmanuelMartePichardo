package src.Ejercicio4;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int op = 0;

        do{
            System.out.println("=================================================");
            System.out.println("              .::CALCULADORA SEGURA::.           ");
            System.out.println("=================================================");
            System.out.println("-------------------------------------------------");
            System.out.println("1.  SUMAR");
            System.out.println("2.  RESTAR");
            System.out.println("3.  MULTIPLICAR");
            System.out.println("4.  DIVIDIR");
            System.out.println("5.  SALIR");

            System.out.println("-------------------------------------------------");
            System.out.print("Ingrese la opcion deseada: ");
            op = sc.nextInt();

            switch(op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }


        }while(op != 5);
    }
    
}
