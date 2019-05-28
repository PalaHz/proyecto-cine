package clases;


import java.util.*;

/**
 * 
 */
public class Clientes extends Persona {
    public String direccion;
    public String mail;
    public String usuario;
    private String password;

    public Clientes() {
    }

    public Clientes(String direccion, String mail, String usuario, String password, String nombres, String apellidos, String cedula) {
        super(nombres, apellidos, cedula);
        this.direccion = direccion;
        this.mail = mail;
        this.usuario = usuario;
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}