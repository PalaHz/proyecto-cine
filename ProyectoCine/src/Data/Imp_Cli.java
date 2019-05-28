/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import clases.Clientes;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Imp_Cli {
    
    public static ArrayList<Clientes> ImportarClientes(){   
        ArrayList<Clientes> ArrayClientes = new ArrayList<Clientes>();
        File f = new File("Archivos/cliente.txt");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                    Clientes objTmpCli = new Clientes(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(),st.nextToken(),st.nextToken());
                    ArrayClientes.add(objTmpCli);
                }
            }                      
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayClientes;
    }    
         
    public static void GuardaArchivoCliente(ArrayList<Clientes> ArrayClientes) throws FileNotFoundException, IOException{
        File f = new File("Archivos/Cliente.txt");
        FileWriter fw = new FileWriter(f,false);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Clientes objCli : ArrayClientes) { //RECORRER EL ARRAY LIST Y GRABAR POR CADA OBJETO
            bw.write(objCli.getCedula()+",");
            bw.write(objCli.getNombres()+",");
            bw.write(objCli. getApellidos()+"\n");
        }
        bw.close();
        fw.close();
    }
}
