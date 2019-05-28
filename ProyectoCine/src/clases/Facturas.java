package clases;


import clases.Clientes;
import java.util.*;

public class Facturas {

    public double IVA;
    public String ruc;
    public String nombre;
    public double total;
    public double Subtotal;
    public String direccion;
    public ArrayList<Productos> listProd = new ArrayList<>();
    public Clientes cliente = new Clientes();
    public Facturas() {
    }

    public Facturas(double IVA, String ruc, String nombre, double total, 
            double Subtotal, String direccion) {
        this.IVA = IVA;
        this.ruc = ruc;
        this.nombre = nombre;
        this.total = total;
        this.Subtotal = Subtotal;
        this.direccion = direccion;
    }
    
}