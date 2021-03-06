package clases;


import java.util.*;

/**
 * 
 */
public class Boletos extends Productos {
    public String ubicacion;
    public String tipoBoleto;
    public Asientos puesto;

    public Boletos() {
    }

    public Boletos(String ubicacion, double precioBoleto, String tipoBoleto) {
        this.ubicacion = ubicacion;
        super.precioProducto = precioBoleto;
        this.tipoBoleto = tipoBoleto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setPrecioBoleto(double precioBoleto) {
        super.precioProducto = precioBoleto;
    }

    public String getTipoBoleto() {
        return tipoBoleto;
    }

    public void setTipoBoleto(String tipoBoleto) {
        this.tipoBoleto = tipoBoleto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }



}