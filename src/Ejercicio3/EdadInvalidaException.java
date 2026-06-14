package src.Ejercicio3;

public class EdadInvalidaException extends Exception{
    private String message;

    public EdadInvalidaException(String Message){
        this.message = Message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
