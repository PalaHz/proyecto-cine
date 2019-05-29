
package Logica;

import clases.Vendedor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LogAdmin {
    public Vendedor RegistrarVendedor(String user, String password, String sector, String nombres, String apellidos, String cedula){
        Vendedor objVendedor = new Vendedor(user, password,sector, nombres,apellidos,cedula);
        return objVendedor;
    
}
    public ArrayList AgregarVendedor(Vendedor vendedor, ArrayList<Vendedor> ArrayVendedor){
        ArrayVendedor.add(vendedor);  
        return ArrayVendedor;
    }
}