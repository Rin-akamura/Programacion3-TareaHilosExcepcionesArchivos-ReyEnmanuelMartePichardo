package src.Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    
    Scanner sc = new Scanner(System.in);

    public void Sumar() {
        try{
             int suma = 0;

        System.out.println("Cuantos numeros deseas sumar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < cantidad; i++){
            System.out.println("Ingrese numero #" + (i + 1));
            int numero = sc.nextInt();
            sc.nextLine();
            suma += numero;
        }
        System.out.println("Suma Total = " + suma);
        }catch(InputMismatchException e) {
            System.out.println("Error: No se puede realizar la operacion con letras");
        } finally{
            System.out.println("Proceso Finalizado...");
        }
    }

    public void Restar() {
       try{
        System.out.println("Ingrese la cantidad de numeros que desea restar");
        int resta = 0;
        int cantidad = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < cantidad; i++){
            System.out.println("Ingrese el numero que desea restar");
            int numero = sc.nextInt();
            sc.nextLine();
            if(i == 0){
                resta = numero;
            }
            else {
                resta -= numero;
            }
        }

        System.out.println("Total restante = " + resta);
       }catch(InputMismatchException e) {
        System.out.println("Error: No se puede realizar la operacion con letras. Ingrese un numero valido");
       } finally{
        System.out.println("Proceso Finalizado...");
       }
    }

    public void Multiplicar() {
        try{
            System.out.print("-");
            int numero1 = sc.nextInt();
            sc.nextLine();

            System.out.print(" * ");

            int numero2 = sc.nextInt();
            sc.nextLine();

            int producto = numero1 * numero2;

            System.out.print("= " + producto);
            System.out.println();

        }catch(InputMismatchException e){
            System.out.println("Error: No se puede realizar la operacion. Ingrese un numero valido");
        }finally{
            System.out.println("Proceso Finalizado...");
        }
    }

    public void Dividir() {
        try{
            System.out.print("-");
            int numero1 = sc.nextInt();
            sc.nextLine();

            System.out.print(" / ");

            int numero2 = sc.nextInt();
            sc.nextLine();

            double residuo = numero1 / numero2;

            System.out.println("= " + residuo);;

        }catch(InputMismatchException e){
            System.out.println("Error: No se puede realizar la operacion. Ingrese un numero valido");
        }catch(ArithmeticException e){
            System.out.println("Error: No se puede dividir entre 0");
        }finally{
            System.out.println("Proceso Finalizado...");
        }
    }
}
