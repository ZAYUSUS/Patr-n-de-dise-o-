package Observer;

import Observer.ObservadorPlacas;

import java.util.Scanner;

public class MainCambioPlacas {
    public static void main(String[] args) {
        int[] placaNueva = new int[2];
        Sujeto placas = new Sujeto();
        int [] restriccionHoy = {0,1};

        new ObservadorPlacas(placas);
        System.out.println("Las restricciones de ayer son "+ restriccionHoy[0]+","+restriccionHoy[1]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los numeros de las restricciones son dos y van separados por coma ejp: 1,2");
        String nuevasRestriciones = scanner.nextLine();

        int i2= 0;

        for (int i=0; i<3;i++) {//recorre el input que se le dá en consola
            String nuevo = nuevasRestriciones.substring(i, i + 1);
            if (nuevo.contains(",")) {
                System.out.println("");
            } else {
                placaNueva[i2] = Integer.parseInt(nuevo);
                i2++;
            }
        }
        placas.setEstado(placaNueva);
    }
}
