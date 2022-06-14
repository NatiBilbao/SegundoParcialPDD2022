package Ejercicio2Mediator;

public class Administrativos extends Persona {
    private String nombre;
    private String cargo;

    public Administrativos(IChatEducativo chatEducativo){
        super(chatEducativo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void send(String msg,String tipoDeMensaje){
        chatEducativo.send(msg, tipoDeMensaje, this);
    }

    @Override
    public void received(String msg){
        System.out.println("El mensaje recibido por el administrativo: " + nombre + "=>" + msg);
    }
}
