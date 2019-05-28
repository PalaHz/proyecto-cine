package clases;


import java.util.*;

/**
 * 
 */
public class Consumibles extends Productos {

    public String nombreConsumible;
    public String descripcion;
    public double precioConsumible;

    public Consumibles() {
    }

    public Consumibles(String nombreConsumible, String descripcion, double precioConsumible) {
        this.nombreConsumible = nombreConsumible;
        this.descripcion = descripcion;
        this.precioConsumible = precioConsumible;
    }
    

}