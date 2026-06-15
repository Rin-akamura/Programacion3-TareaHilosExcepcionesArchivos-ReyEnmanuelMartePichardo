package src.Ejercicio4;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

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
                    calculadora.Sumar();
                    break;
                case 2:
                    calculadora.Restar();
                    break;
                case 3:
                    calculadora.Multiplicar();
                    break;
                case 4:
                    calculadora.Dividir();
                    break;
                case 5:
                    System.out.println("Saliendo del programam . . . .");
                    break;
            }


        }while(op != 5);
    }
    
}
