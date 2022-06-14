package Ejercicio2Mediator;

public abstract class Persona {
    protected IChatEducativo chatEducativo;
    private String tipoDePersona;

    public Persona(IChatEducativo chatEducativo){
        this.chatEducativo = chatEducativo;
    }

    public String getTipoDePersona() {
        return tipoDePersona;
    }

    public void setTipoDePersona(String tipoDePersona) {
        this.tipoDePersona = tipoDePersona;
    }

    public abstract void send(String msg, String tipoDeMensaje);
    public abstract void received(String msg);
}
