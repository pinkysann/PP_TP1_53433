package TP;

import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos = 0;

    private Sala sala;
    private List<Actividad> actividades;

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList<>();
        cantidadEventos++;
    }

    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    public void crearActividad(int id, String titulo, int cupo, String tipo, String datoAdicional) {
        if (tipo.equalsIgnoreCase("Charla")) {
            actividades.add(new Charla(id, titulo, cupo, datoAdicional));
        } else if (tipo.equalsIgnoreCase("Taller")) {
            boolean notebook = Boolean.parseBoolean(datoAdicional);
            actividades.add(new Taller(id, titulo, cupo, notebook));
        }
    }

    public double calcularCostoEstimado() {
        if (gratuito) return 0.0;
        double costoTotalActividades = 0;
        for (Actividad act : actividades) {
            costoTotalActividades += act.calcularCostoMateriales();
        }
        return (costoBase + costoTotalActividades) * 1.21; // Con IVA del 21%[cite: 11]
    }

    public void mostrarDatos() {
        System.out.println("==========================================");
        System.out.println("EVENTO: " + titulo + " [ID: " + id + "]");
        System.out.println("Costo Estimado Total (con IVA): $" + calcularCostoEstimado());
        if (sala != null) sala.mostrarDatos();

        System.out.println("--- Actividades ---");
        for (Actividad act : actividades) {
            act.mostrarIdentificacion();
            System.out.println("Costo Materiales: $" + act.calcularCostoMateriales());
            act.mostrarInscripciones();
            System.out.println("----------------");
        }
        System.out.println("==========================================");
    }

    public static int getCantidadEventos() { return cantidadEventos; }
    public List<Actividad> getActividades() { return actividades; }
}