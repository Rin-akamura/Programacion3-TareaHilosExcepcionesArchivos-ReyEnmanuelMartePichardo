package src.Ejercicio2;

public class Carrera extends Thread {
    //private String Corredor;
    private static boolean ganador = false;

    public Carrera( String Corredor) {
        super(Corredor);
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            System.out.println(getName() + " ha avanzado al metro " + i);

            try{
                Thread.sleep(1000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }

            if(i == 10 && !ganador){
                ganador = true;
                System.out.println(getName() + " llego primero a la meta");
            }
            if (i == 10){
                System.out.println(getName() + " llego a la meta");
            }
        }

        System.out.println();
    }
}
