package clases;


import clases.Administrador;
import java.util.*;

/**
 * 
 */
public class Cartelera {
    public String nombrePelicula;
    public Date horario;
    public Administrador administrador;
    public Cartelera() {
    }

    public Cartelera(String nombrePelicula, Date horario, Administrador administrador) {
        this.nombrePelicula = nombrePelicula;
        this.horario = horario;
        this.administrador = administrador;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }


}