/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.t2;

/**
 *
 * @author PROPIETARIO
 */
public class Estudiante {
    private final String nombre;
    private boolean asistio;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.asistio = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean asistioHoy() {
        return asistio;
    }

    public void marcarAsistencia() {
        asistio = true;
    }
}
