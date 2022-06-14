package Ejercicio1Memento;

public class Cliente {
    public static void main(String[] args){
        Controla controla = new Controla();
        Versiona versiona = new Versiona();
        Documento documento;

        documento = new Documento("Primeras oraciones", "Primer cambio");
        versiona.guardarCambios(documento);
        controla.addVersion(versiona.createCambios());

    }
}
