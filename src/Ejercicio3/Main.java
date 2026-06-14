package src.Ejercicio3;

import java.util.Scanner;
public class Main {
    EdadInvalidaException e = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("      .::REGISTRO DE CIVIL::.     ");
        System.out.println("=================================");
        System.out.println("---------------------------------");
        try{
            System.out.println("¿Cual es su edad?");
            int Edad = sc.nextInt();
            ValidarEdad(Edad);
        }catch(EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally{
            System.out.println("Proceso Finalizado...");
            System.out.println("--------------------------------");
        }
        
        

    }

    public static void ValidarEdad(int edad) throws EdadInvalidaException{
        if(edad < 18){
            throw new EdadInvalidaException("Debe ser mayor de edad");
        }
        else{
            System.out.println("Edad valida. Puede acceder a los registros");
        }
    }
}
