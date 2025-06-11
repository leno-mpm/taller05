package ec.edu.espol;

import java.util.List;
@SuppressWarnings("all")
public class Curso {
    private String id;
    private String nombre;
    private Boolean estadoDisponible;
    
    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesEnEspera;
    private Profesor profesor;
    private List<Foro> foros;
    private List<ActividadSumativa> actividadesSumativas;

    public void cargarMaterialEducativo(){}
}
