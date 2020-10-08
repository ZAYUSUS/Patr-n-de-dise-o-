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
        System.out.println("Ingrese los dos numeros seguidos de las restricciones ejp'12' para 1,2");
        String nuevasRestriciones = scanner.nextLine();


        for (int i=0; i<2;i++){//recorre el input que se le dá en consola
            String nuevo =  nuevasRestriciones.substring(i,i+1);
            placaNueva[i] = Integer.parseInt(nuevo);
        }
        placas.setEstado(placaNueva);
    }
}
