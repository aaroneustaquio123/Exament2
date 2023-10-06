/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.t2;

/**
 *
 * @author PROPIETARIO
 */
public class ExamenT2 {

    public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Estudiante 1");
        Estudiante estudiante2 = new Estudiante("Estudiante 2");
        // Agrega más estudiantes según sea necesario

        Aula aulaManana = new Aula("Clase de la mañana");
        aulaManana.agregarEstudiante(estudiante1);
        aulaManana.agregarEstudiante(estudiante2);
        // Agrega más estudiantes a la clase de la mañana

        AsistenciaFrame asistenciaManana = new AsistenciaFrame(aulaManana);
    }
}
    }
