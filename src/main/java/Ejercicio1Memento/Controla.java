package Ejercicio1Memento;

import java.util.ArrayList;
import java.util.List;

public class Controla {
    private List<Memento> listaDeEstados = new ArrayList<>();

    public void addVersion(Memento memento){
        listaDeEstados.add(memento);
    }

    public Memento getVersion(int numeroDeCmabios){
        return listaDeEstados.get(listaDeEstados.size() - numeroDeCmabios);
    }
}
