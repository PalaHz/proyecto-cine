/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import clases.Boletos;
import clases.Consumibles;
import clases.Productos;
import java.util.ArrayList;

/**
 *
 * @author accel
 */
public class LogVendedor {
    ArrayList<Consumibles> consumibles= new ArrayList<>(); 
    double total;
    public double CalcularTotalCompraPre(ArrayList<Productos> listaProd){
        total = 0;
        for(Productos producto : listaProd){
            total += producto.precioProducto;
        }
        return total;
    }
}
