package clases;


import clases.Persona;
import java.util.*;

/**
 * 
 */
public class Vendedor extends Persona {
    public String user;
    public String password;
    public String sector;
    
    public Vendedor() {
    }

    public Vendedor(String user, String password, String sector) {
        this.user = user;
        this.password = password;
        this.sector = sector;
    }

    public Vendedor(String user, String password, String sector, String nombres, String apellidos, String cedula) {
        super(nombres, apellidos, cedula);
        this.user = user;
        this.password = password;
        this.sector = sector;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
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