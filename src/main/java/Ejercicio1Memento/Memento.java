package Ejercicio1Memento;

public class Memento {
    private Documento estado;

    public Memento(Documento concretObject){
        estado = concretObject;
    }

    public Documento getEstado(){
        return estado;
    }
}
