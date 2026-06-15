package src.Ejercicio1;

public class Descargas extends Thread{
    private String NombreArchivo;

    public Descargas (String nombreArchivos){
        this.NombreArchivo = nombreArchivos;
    }

    @Override
    public void run(){
        System.out.println("Descargando " + NombreArchivo + "...");

        for(int i = 0; i < 100; i += 5){
            System.out.println(NombreArchivo + " " + i + "%");

            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }   
        }

        System.out.println("...");
        System.out.println(NombreArchivo + " Completado");
        
    }
    
}
