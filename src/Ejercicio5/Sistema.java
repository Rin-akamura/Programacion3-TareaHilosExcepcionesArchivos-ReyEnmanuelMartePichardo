package src.Ejercicio5;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;
public class Sistema {
    Scanner sc = new Scanner(System.in);
    public Sistema() {
    }
     File archivo = new File("Agenda_Actividades.txt");

    public void RegistrarActividades(){
        try{
            System.out.println("Ingrese la actividad que desea agendar: ");
            String actividad ="- " + sc.nextLine();
            if(archivo.createNewFile()){
                System.out.println("El archivo ya ha sido creado correctamente");
            }else{
                System.out.println("El archivo no se ha creado aun");
            }

            FileWriter write = new FileWriter("Agenda_Actividades.txt", true);
            BufferedWriter buffer = new BufferedWriter(write);

            buffer.write(actividad);
            buffer.newLine();

            buffer.close();
            write.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    public void MostrarActividades(){
        try{
            FileReader watch = new FileReader("Agenda_Actividades.txt");
            String Linea;
            BufferedReader read = new BufferedReader(watch);

            while((Linea = read.readLine()) != null){
                System.out.println(Linea);
            }

            read.close();

        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
