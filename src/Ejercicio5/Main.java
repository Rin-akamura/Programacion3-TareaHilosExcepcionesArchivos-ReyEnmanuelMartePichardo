package src.Ejercicio5;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }while(op != 3);
    }
}
