package src.Ejercicio2;

public class Main {
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("        .::CARRERA DE ESTAMBRES::.      ");
        System.out.println("========================================");
        System.out.println("----------------------------------------");
        System.out.println("La carrera ha iniciado");
        String Corredor1 = "Juan Perez";
        String Corredor2 = "Carlos Marte";
        String Corredor3 = "Martin Guzman";
        String Corredor4 = "Matias Mata";


        Carrera corredor1 = new Carrera(Corredor1);
        Carrera corredor2 = new Carrera(Corredor2);
        Carrera corredor3 = new Carrera(Corredor3);
        Carrera corredor4 = new Carrera(Corredor4);


        System.out.println("Estado inicial de " + corredor1.getName() + ": " + corredor1.getState());
        System.out.println("Estado inicial de " + corredor2.getName() + ": " + corredor2.getState());
        System.out.println("Estado inicial de " + corredor3.getName() + ": " + corredor3.getState());
        System.out.println("Estado inicial de " + corredor4.getName() + ": " + corredor4.getState());

        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();

        try{
            corredor1.join();
            corredor2.join();
            corredor3.join();
            corredor4.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }


        System.out.println("Estado final de " + corredor1.getName() + ": " + corredor1.getState());
        System.out.println("Estado final de " + corredor2.getName() + ": " + corredor2.getState());
        System.out.println("Estado final de " + corredor3.getName() + ": " + corredor3.getState());
        System.out.println("Estado final de " + corredor4.getName() + ": " + corredor4.getState());


        System.out.println("----------------------------------------");

    }
}
