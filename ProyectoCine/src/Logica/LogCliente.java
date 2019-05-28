/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Data.Imp_Cli;
import clases.Clientes;
import clases.Facturas;
import clases.Sugerencias;
import java.util.ArrayList;

/**
 *
 * @author accel
 */
public class LogCliente {
    
    public Clientes CrearCliente(String direccion, String mail, String usuario, String password, String nombres, String apellidos, String cedula){
        Clientes objClie = new Clientes(direccion, mail, usuario, password, nombres, apellidos, cedula);
        return objClie;
    }
    
    public ArrayList<Clientes> AgregarCliente(ArrayList ArrayCliente, String direccion, String mail, String usuario, String password, String nombres, String apellidos, String cedula){
         Clientes objClie = new Clientes(direccion, mail, usuario, password, nombres, apellidos, cedula);
         ArrayCliente.add(objClie);
         return ArrayCliente;
    }
    
    public Clientes BuscarCliente(ArrayList<Clientes> ArrayClientes1, String Cedula){
        // LOS PARAMETROS SON EL ARRAY CON LOS CLIENTES Y UNA CEDULA PARA BUSCAR EL CLIENTE
        Clientes objAux = new Clientes(null,null,null,null,null,null,null);
        for (Clientes objCli : ArrayClientes1){// RECORRER EL ARRAYLIST
            String strCe = objCli.getCedula().trim(); 
            if (strCe.equals(Cedula.trim())) //PREGUNTAR POR CADA OBJETO
                objAux=objCli;
        }
        return objAux; //RETORNARA UN objeto VACIO EN EL CASO DE NO EXISTIR
    }
    
    public Clientes ActualizarCliente(Clientes ObjCli,String direccion, String mail, String usuario, String password, String nombres, String apellidos, String cedula){
        ObjCli.setCedula(cedula);
        ObjCli.setNombres(nombres);
        ObjCli.setApellidos(apellidos);
        ObjCli.setDireccion(direccion);
        ObjCli.setMail(mail);
        ObjCli.setPassword(password);
        ObjCli.setUsuario(usuario);
        return ObjCli;
    }
    
    public ArrayList<Clientes> ImportarClientes(ArrayList<Clientes> ArrayClientes){
        Imp_Cli ObjImpCli = new Imp_Cli();
        ArrayClientes = ObjImpCli.ImportarClientes();
        return ArrayClientes;
    }
}