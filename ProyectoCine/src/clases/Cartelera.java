package clases;


import clases.Administrador;
import java.util.*;

/**
 * 
 */
public class Cartelera {
    public String nombrePelicula;
    public String horario;
    public Cartelera() {
    }

    public Cartelera(String nombrePelicula, String horario) {
        this.nombrePelicula = nombrePelicula;
        this.horario = horario;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }


}