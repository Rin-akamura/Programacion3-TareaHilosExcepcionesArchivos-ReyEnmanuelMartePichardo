package src.Ejercicio1;

public class Descargas extends Thread{
    private String NombreArchivo;

    public Descargas (String nombreArchivos){
        this.NombreArchivo = nombreArchivos;
    }

    @Override
    public void run(){
        System.out.println("Descargando " + NombreArchivo);
        
    }
    
}
