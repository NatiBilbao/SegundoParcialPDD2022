package Ejercicio1Memento;

public class Versiona {
    private Documento estado;

    public void guardarCambios(Documento estado){
        System.out.println("Version del documento guardada" + estado.getEstado());
        this.estado = estado;
    }

    public Memento createCambios(){
        return new Memento(estado);
    }

    public Documento revertirCambios(Memento memento){
        this.estado = memento.getEstado();
        return estado;
    }
}
