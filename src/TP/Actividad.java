package TP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int CUPO_MINIMO = 5;

    protected List<Inscripcion> inscripciones;

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>();
    }

    public Inscripcion inscribir(Estudiante estudiante) {
        if (inscripciones.size() < cupoMaximo) {
            Inscripcion nuevaInscripcion = new Inscripcion(LocalDate.now(), "Confirmada");
            inscripciones.add(nuevaInscripcion);
            System.out.println("Estudiante " + estudiante.getNombre() + " inscripto con éxito en: " + titulo);
            return nuevaInscripcion;
        } else {
            System.out.println("No hay cupos disponibles para: " + titulo);
            return null;
        }
    }

    public void mostrarInscripciones() {
        System.out.println("Inscripciones para la actividad (" + getTipo() + "): " + titulo);
        for (Inscripcion inscripcion : inscripciones) {
            inscripcion.mostrarDatos();
        }
    }

    // Método final requerido por la consigna
    public final void mostrarIdentificacion() {
        System.out.println("Actividad ID: " + id + " | Título: " + titulo + " | Tipo: " + getTipo());
    }

    public abstract double calcularCostoMateriales();
    public abstract String getTipo();

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public int getCupoMaximo() { return cupoMaximo; }
}