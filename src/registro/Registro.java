
package registro;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Registro {
    public static void main(String[] args){
        Scanner cedula = new Scanner(System.in);
        System.out.println("Introduzca su n�m de c�dula: ");
        String num_cedula = cedula.nextLine();
        
        Scanner celular = new Scanner(System.in);
        System.out.println("Introduzca su n�m de tel�fono: ");
        String num_celular = celular.nextLine();
        
        Scanner correo = new Scanner(System.in);
        System.out.println("Introduzca su correo electr�nico: ");
        String correo_electronico = correo.nextLine();
        
        Scanner contra = new Scanner(System.in);
        System.out.println("Introduzca su contrase�a: ");
        String contrase�a = contra.nextLine();
    
    }   
    
}
