
package registro;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Registro {
    public static void main(String[] args){
        Scanner placa = new Scanner(System.in);
        System.out.println("Introduzca el número de placa: ");
        String num_placa = placa.nextLine();
        
        Scanner marca = new Scanner(System.in);
        System.out.println("Introduzca la marca: ");
        String auto_marca = marca.nextLine();
        
        Scanner modelo = new Scanner(System.in);
        System.out.println("Introduzca el modelo: ");
        String auto_modelo = modelo.nextLine();
    
    }   
    
}
