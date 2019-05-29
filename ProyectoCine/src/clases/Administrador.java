package clases;


import java.util.*;
public class Administrador extends Persona {
    public String user;
    public String password;
    public Administrador() {    
    }

    public Administrador(String user, String password, String cargo, Cartelera registra) {
        this.user = user;
        this.password = password;
    }

    public Administrador(String user, String password, String cargo, Cartelera registra, String nombres, String apellidos, String cedula) {
        super(nombres, apellidos, cedula);
        this.user = user;
        this.password = password;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


}