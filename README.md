# Trabajo Práctico Nº 1 - Paradigmas de Programación (UTN FRM)

## Descripción del Proyecto
Proyecto desarrollado en Java utilizando IntelliJ IDEA que implementa los fundamentos de la **Programación Orientada a Objetos (POO)**[cite: 12]. El sistema modela la administración de eventos universitarios, integrando el uso de:
- **Encapsulamiento y visibilidad** de atributos y métodos con sus respectivos modificadores de acceso[cite: 12].
- **Relaciones entre objetos:** Asociación, Agregación (`Sala`) y Composición (`Actividad`)[cite: 12].
- **Herencia y Polimorfismo:** Jerarquía entre la clase abstracta `Actividad` y sus subclases concretas `Charla` y `Taller`[cite: 12].
- **Colecciones:** Uso de `List` para gestionar actividades e inscripciones de estudiantes[cite: 12].
- **Métodos finales (`final`) y estáticos (`static`)** para control de identificaciones y contadores globales[cite: 12].

---

## Estructura del Código
El sistema se encuentra empaquetado bajo `ar.edu.utn.frm.tpc` e incluye las siguientes clases principales[cite: 12]:
1. `App`: Clase ejecutable principal con el método `main`[cite: 12].
2. `EventoUniversitario`: Modela el evento, calcula costos totales aplicando las reglas de negocio y un 21% de IVA, y administra su sala y lista de actividades[cite: 12].
3. `Actividad` (Abstracta): Define la estructura base, atributos comunes y el método `final mostrarIdentificacion()`[cite: 12].
4. `Charla` (Subclase): Modela charlas con disertante y costo de materiales gratuito[cite: 12].
5. `Taller` (Subclase): Modela talleres con uso opcional de notebook y costos diferenciados[cite: 12].
6. `Sala`: Modela la ubicación física asignada mediante agregación[cite: 12].
7. `Estudiante`: Modela los alumnos del sistema[cite: 12].
8. `Inscripcion`: Registra la fecha y estado de la inscripción del estudiante a una actividad[cite: 12].

---

## Cómo Ejecutar
1. Clonar el repositorio público de GitHub (`PP_TP1_legajo`)[cite: 12].
2. Abrir el proyecto en **IntelliJ IDEA**[cite: 12].
3. Verificar que el JDK configurado sea compatible (versión 17 o superior)[cite: 12].
4. Navegar hasta la clase `App.java`[cite: 12].
5. Ejecutar el método `main` para visualizar por consola el resumen del evento, cálculos estimados y el contador total de eventos[cite: 12].