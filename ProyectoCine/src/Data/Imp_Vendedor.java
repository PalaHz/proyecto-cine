/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import clases.Vendedor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author accel
 */
public class Imp_Vendedor {
        public static ArrayList<Vendedor> ImportarVendedor(){   
        ArrayList<Vendedor> ArrayClientes = new ArrayList<Vendedor>();
        File f = new File("Archivos/vendedor.txt");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                    Vendedor objVend = new Vendedor(st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken());
                    ArrayClientes.add(objVend);
                }
            }                      
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayClientes;
    } 
        public static void GuardaArchivoVendedor(ArrayList<Vendedor> ArrayVendedor) throws FileNotFoundException, IOException{
        File f = new File("Archivos/vendedor.txt");
        FileWriter fw = new FileWriter(f,false);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Vendedor objVend : ArrayVendedor) { //RECORRER EL ARRAY LIST Y GRABAR POR CADA OBJETO
            bw.write(objVend.getUser()+",");
            bw.write(objVend.getPassword()+",");
            bw.write(objVend.getNombres()+",");
             bw.write(objVend.getSector()+",");
            bw.write(objVend.getApellidos()+",");
            bw.write(objVend. getCedula()+",");
            bw.write("\r\n");
        }
        bw.close();
        fw.close();
    }
}
