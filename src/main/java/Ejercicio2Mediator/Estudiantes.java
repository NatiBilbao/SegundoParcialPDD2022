package Ejercicio2Mediator;

public class Estudiantes extends Persona {
    int numeroMatricula;
    String nombre;

    public Estudiantes(IChatEducativo chatEducativo){
        super(chatEducativo);
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void send(String msg, String tipoDeMensaje){
        chatEducativo.send(msg, tipoDeMensaje, this);
    }

    @Override
    public void received(String msg){
        System.out.println("Mensaje recivido" + nombre + "=>" + msg);
    }

}
