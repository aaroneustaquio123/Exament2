/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.t2;

/**
 *
 * @author PROPIETARIO
 */
import java.util.ArrayList;
import java.util.List;

public class Aula {
    private final String nombreAula;
    private final List<Estudiante> estudiantes;

    public Aula(String nombreAula) {
        this.nombreAula = nombreAula;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public String getNombreAula() {
        return nombreAula;
    }
}

