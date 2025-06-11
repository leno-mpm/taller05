package ec.edu.espol;

import java.util.List;

public class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;

    protected List<Incidente> indicidentes;
    
    protected boolean logIn(){
        return true;
    }

    protected boolean logOut(){
        return true;
    }
}
