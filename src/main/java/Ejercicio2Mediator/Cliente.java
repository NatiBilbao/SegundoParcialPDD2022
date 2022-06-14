package Ejercicio2Mediator;

public class Cliente {
    public static void main(String[] args){
        Chat chatPersonas = new Chat();

        Estudiantes estudiante1 = new Estudiantes(chatPersonas);
        estudiante1.setTipoDePersona("Estudiantes");
        estudiante1.setNombre("Cris");

        Docentes docente1 = new Docentes(chatPersonas);
        docente1.setTipoDePersona("Docentes");
        docente1.setNombre("Julio");

        Administrativos administrativo1 = new Administrativos(chatPersonas);
        administrativo1.setTipoDePersona("Administrativos");
        administrativo1.setNombre("Lili");

        chatPersonas.addChatEducativo(estudiante1);
        chatPersonas.addChatEducativo(docente1);
        chatPersonas.addChatEducativo(administrativo1);

        estudiante1.send("Este mensaje es para todos","Todos");
        estudiante1.send("Este mesnaje es para el doecnte","Docentes");

        docente1.send("Este mensaje es para los estudiantes","Estudiantes");
    }
}
