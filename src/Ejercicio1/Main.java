package src.Ejercicio1;

public class Main {
    public static void main (String[] args){
    Descargas archivo1 = new Descargas("Orgullo_y_Prejuicio.PDF");
    Descargas archivo2 = new Descargas("Percy Jackson: El ladron del rayo.PDF");
    Descargas archivo3 = new Descargas("wallHaven-image.png");

    archivo1.start();
    archivo2.start();
    archivo3.start();
    }
}
