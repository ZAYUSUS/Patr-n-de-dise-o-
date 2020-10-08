package Observer;

import Observer.Observador;

public class ObservadorPlacas extends Observador {//crea el observador para ver los cambios en las restricciones
    int[] nuevas;// array para guardar los numeros de las placas

    public ObservadorPlacas(Sujeto sujeto){
        this.sujeto = sujeto;//recibe al objeto de la clase sujeto
        this.sujeto.agregar(this);//agrega el observador a la lista de observadores del sujeto
    }
    @Override
    public void Actualizar() {
        //Se envia las nuevas placas al sistema de visualización
        nuevas  = this.sujeto.getEstado();
        System.out.println("Se cambiaron las restricciones a "+nuevas[0]+","+nuevas[1]);
    }

}
