
package proyecto1;

import proyecto1.Encriptado;

/**
 *
 * @author Manuel Arias Medina
 */
public class PruebaCifrado {
    
    public static void main(String args[]) throws Exception{
        Encriptado prueba = new Encriptado();
        String msg = "Hola";
        System.out.println(msg);
        byte[] encriptado = prueba.cifra(msg);
        System.out.println(encriptado);
        String desencriptado = prueba.descifra(encriptado);
        System.out.println(desencriptado);
    }
    
}
