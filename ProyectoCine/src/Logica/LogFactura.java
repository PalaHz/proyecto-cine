/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import clases.Facturas;
import clases.Productos;
import java.util.ArrayList;

/**
    public String ImprimirFactura(Facturas F
 *
 * @author accel
 */
public class LogFactura {
    
    public Facturas RealizarFacturaPre(ArrayList<Productos> listaProd,double total,
            String nombre, String ruc){
        Facturas objFactura = new Facturas();
        objFactura.nombre = nombre;
        objFactura.ruc = ruc;
        objFactura.Subtotal = total;
        objFactura.IVA = (total/100)*12;
        objFactura.total = total + objFactura.IVA;
        objFactura.listProd = listaProd;
        return objFactura;
    }
    public String ImprimirFactura(Facturas fac){
        String cadenaFinal = "=====================================";
        cadenaFinal =  String.format("%s\nNombre: %s\nRuc:%s\n"
                + "=====================================",cadenaFinal,fac.nombre,
                fac.ruc);
        for(Productos prod : fac.listProd){
            cadenaFinal = String.format("%s\n%-20s\t\t.2f",cadenaFinal,
                    prod.nombreProducto,prod.precioProducto);
        }
        cadenaFinal = String.format("%s\n\t\t\tSubt.:\t%.2f\n\t\t\tIVA:\t%.2f\n"
                + "\t\t\tTotal:\t%.2f\n====================================="
                ,cadenaFinal,fac.Subtotal,fac.IVA,fac.total);
        return cadenaFinal;
    }
}
    
