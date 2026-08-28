package TP;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Estudiantes de ejemplo
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("V-1001", "Martín Ruarte"));
        estudiantes.add(new Estudiante("V-1002", "Valeria Sosa"));
        estudiantes.add(new Estudiante("V-1003", "Lucas Navarro"));

        // Evento universitario
        EventoUniversitario eventoTech = new EventoUniversitario("EV-2026-1", "Congreso de Ingeniería y Sistemas", 18000.0, false);

        // Sala asignada
        Sala salaPrincipal = new Sala(202, "Auditorio Principal - Campus Tupungato");
        eventoTech.asignarSala(salaPrincipal);

        // Creación de actividades con otras temáticas
        eventoTech.crearActividad(1, "Arquitectura de Software Moderna", 40, "Charla", "Ing. Carlos Mendoza");
        eventoTech.crearActividad(2, "Optimización de Bases de Datos", 20, "Taller", "true");

        // Inscripciones de estudiantes a las actividades
        List<Actividad> acts = eventoTech.getActividades();
        if (!acts.isEmpty()) {
            acts.get(0).inscribir(estudiantes.get(0));
            acts.get(0).inscribir(estudiantes.get(1));

            acts.get(1).inscribir(estudiantes.get(1));
            acts.get(1).inscribir(estudiantes.get(2));
        }

        // Mostrar datos completos del evento
        eventoTech.mostrarDatos();
        System.out.println("\nTotal de eventos creados: " + EventoUniversitario.getCantidadEventos());
    }
}