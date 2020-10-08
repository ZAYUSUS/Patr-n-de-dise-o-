import java.util.ArrayList;
import java.util.List;

public class Sujeto {
        private int estado;
        private List<Observador> observadores = new ArrayList<Observador>();

        public int getEstado(){
            return estado;
        }
        public void setEstado(int estado){
            this.estado = estado;
            NotificarCambio();
        }
        public void agregar(Observador observador) {
            observadores.add(observador);
        }
        public void NotificarCambio(){
            for (Observador observador : observadores) observador.Actualizar();

        }
}
