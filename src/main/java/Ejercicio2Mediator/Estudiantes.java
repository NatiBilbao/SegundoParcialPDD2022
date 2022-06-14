package Ejercicio2Mediator;

public abstract class Estudiantes {
    protected IChatEducativo chatEducativo;
    int numeroMatricula;
    String nombre;

    public Estudiantes(IChatEducativo chatEducativo){
        this.chatEducativo = chatEducativo;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public Estudiantes setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Estudiantes setNombre(String nombre) {
        this.nombre = nombre;
        return;this;
    }
}
