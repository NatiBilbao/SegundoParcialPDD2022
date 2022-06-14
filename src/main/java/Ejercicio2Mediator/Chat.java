package Ejercicio2Mediator;

import java.util.ArrayList;
import java.util.List;
public class Chat implements IChatEducativo{
    private List<Persona> listaDeChats = new ArrayList<>();

    public void addChatEducativo(Persona persona){
        listaDeChats.add(persona);
    }

    @Override

    public void send(String msg, String tipoDeMensaje, Persona sender){
        if(tipoDeMensaje == "Todos" && sender.getTipoDePersona().equals("Estudiantes")){
            for(Persona persona: listaDeChats){
                persona.received(msg);
            }
        } else if (tipoDeMensaje == "Docentes" && sender.getTipoDePersona().equals("Estudiantes")) {
            for(Persona persona: listaDeChats){
                if (persona.getTipoDePersona().equals("Docentes")) {
                    persona.received(msg);
                }
            }
        } else if (tipoDeMensaje == "Administrativos" && sender.getTipoDePersona().equals("Estudiantes")) {
            for(Persona persona: listaDeChats){
                if (persona.getTipoDePersona().equals("Administrativos")) {
                    persona.received(msg);
                }
            }
        } else if (tipoDeMensaje == "Docentes" && sender.getTipoDePersona().equals("Docentes")) {
            for (Persona persona : listaDeChats) {
                if (persona.getTipoDePersona().equals("Docentes")) {
                    persona.received(msg);
                }
            }
        } else if (tipoDeMensaje == "Estudiantes" && sender.getTipoDePersona().equals("Docentes")) {
            for (Persona persona : listaDeChats) {
                if (persona.getTipoDePersona().equals("Estudiante")) {
                    persona.received(msg);
                }
            }
        } else if(tipoDeMensaje == "Todos" && sender.getTipoDePersona().equals("Administrativos")) {
            for (Persona persona : listaDeChats) {
                persona.received(msg);
            }
        }
    }
}
