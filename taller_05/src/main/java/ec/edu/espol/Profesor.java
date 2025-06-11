package ec.edu.espol;

import java.util.List;

public class Profesor extends PersonalAcademico{

    List<Curso> cursos;

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){}

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){}

    public void aceptarInsscripcion(Curso curso, String usuarioEstudiante){}

    public void crearNuevoForo(Foro foro){}
}
