
package registro;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Registro {
    public static void main(String[] args){
        Scanner cedula = new Scanner(System.in);
        System.out.println("Introduzca su núm de cédula: ");
        String num_cedula = cedula.nextLine();
        
        Scanner celular = new Scanner(System.in);
        System.out.println("Introduzca su núm de teléfono: ");
        String num_celular = celular.nextLine();
        
        Scanner correo = new Scanner(System.in);
        System.out.println("Introduzca su correo electrónico: ");
        String correo_electronico = correo.nextLine();
        
        Scanner contra = new Scanner(System.in);
        System.out.println("Introduzca su contraseña: ");
        String contraseña = contra.nextLine();
    
    }   
    
}
