public class ObservadorPlacas extends Observador{

    public ObservadorPlacas(Sujeto sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    @Override
    public void Actualizar() {
        System.out.println("Se han cambiado las placas");
    }
}
