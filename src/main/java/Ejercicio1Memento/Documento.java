package Ejercicio1Memento;

public class Documento {
    private String estado;
    private String cambioNuevo;

    public Documento(String estado, String cambioNuevo){
        this.estado = estado;
        this.cambioNuevo = cambioNuevo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCambioNuevo() {
        return cambioNuevo;
    }

    public void setCambioNuevo(String cambioNuevo) {
        this.cambioNuevo = cambioNuevo;
    }

    public void showInfo(){
        System.out.println(cambioNuevo);
    }
}
