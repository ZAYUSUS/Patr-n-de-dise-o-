package Observer;

import Observer.Observador;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {
        private int[] estado;//el estado es un array que contiene los dos numeros de placas
        private List<Observador> observadores = new ArrayList<Observador>();//lista que contiene los observadores que se crean

        public int[] getEstado(){//retorna la información del estado
            return estado;
        }
        public void setEstado(int[] estado){//cambia el estado
            this.estado = estado;
            NotificarCambio();
        }
        public void agregar(Observador observador) {//agrega el observador a la lista de observadoes
            observadores.add(observador);
        }
        public void NotificarCambio(){//llama la función para actualizar el estado de todos los observadores en la lista
            for (Observador observador : observadores) observador.Actualizar();
        }
}
