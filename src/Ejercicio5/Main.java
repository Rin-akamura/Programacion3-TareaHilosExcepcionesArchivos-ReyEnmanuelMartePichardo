package src.Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Sistema sistema = new Sistema();
        int op = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("=====================================");
            System.out.println("    .::REGISTRO DE ACTIVIDADES::.    ");
            System.out.println("=====================================");
            System.out.println("-------------------------------------");
            System.out.println("1.  Registrar Actividades");
            System.out.println("2.  Mostrar Actividades");
            System.out.println("3.  Salir");
            System.out.println("-------------------------------------");

            System.out.print("Ingrese la opcion deseada: ");
            op = sc.nextInt();
            sc.nextLine();

            switch(op) {
                case 1:
                    sistema.RegistrarActividades();
                    break;
                case 2:
                    sistema.MostrarActividades();
                    break;
                case 3:
                    System.out.println("Saliendo del Programa...");
                    break;
            }
        }while(op != 3);
    }
}
