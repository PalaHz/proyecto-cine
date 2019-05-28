package clases;


import java.util.*;

/**
 * 
 */
public class Consumibles extends Productos {

    public String nombreConsumible;
    public String descripcion;


    public Consumibles() {
    }

    public Consumibles(String nombreConsumible, String descripcion, double precioConsumible) {
        this.nombreConsumible = nombreConsumible;
        this.descripcion = descripcion;
        super.precioProducto = precioConsumible;
    }
    

}