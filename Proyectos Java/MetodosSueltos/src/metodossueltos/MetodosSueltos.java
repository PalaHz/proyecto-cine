package metodossueltos;

import static java.awt.SystemColor.window;

/**
 *
 * @author HP
 */
public class MetodosSueltos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    //validación contraseñas
    public boolean validarContraseñas() {
        String p1 = "pass";
        String numeros = "0123456789";
        String letras = "QWERTYUIOPASDFGHJKLZXCVBNMÑ";
        boolean en = false;
        boolean el = false;

        for (int i = 0; i < p1.length(); i++) {
            if (numeros.indexOf(p1.charAt(i), 0) != -1) {
                en = true;
            }
            if (letras.indexOf(p1.charAt(i), 0) != -1) {
                el = true;
            }
        }

        if (en) {
            System.out.println("Debe poseer minimo un digito");
            return false;
        }
        if (el) {
            System.out.println("Debe poseer minimo una mayuscula");
            return false;
        }

        return true;
    }
}
