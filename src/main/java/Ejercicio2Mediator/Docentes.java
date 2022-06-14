package Ejercicio2Mediator;

public class Docentes extends Persona{
    private String ci;
    private String nombre;

    public Docentes (IChatEducativo chatEducativo){
        super(chatEducativo);
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void send(String msg,String tipoDeMensaje){
        chatEducativo.send(msg, tipoDeMensaje, this);
    }

    @Override
    public void received(String msg){
        System.out.println("El mensaje recibido por el docente: " + nombre + "=>" + msg);
    }
}
