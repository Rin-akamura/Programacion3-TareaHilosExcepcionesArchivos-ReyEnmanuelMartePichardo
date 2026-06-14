package src.Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    
    Scanner sc = new Scanner(System.in);

    public void Sumar() {
        int suma = 0;

        System.out.println("Cuantos numeros deseas sumar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i <= cantidad; i++){
            System.out.println("Ingrese numero #" + (i + 1));
            try{
                int numero = sc.nextInt();
                sc.nextLine();
                suma += numero;
            }catch(InputMismatchException e) {
                System.out.println("Error: No se puede realizar la operacion con letras");
            } finally{
                System.out.println("Proceso Finalizado...");
            }
        
        }

        System.out.println("Suma Total = " + suma);
    }
}
