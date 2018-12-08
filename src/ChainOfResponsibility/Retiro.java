package ChainOfResponsibility;

public class Retiro implements ManejadorTRansacciones {

    private ManejadorTRansacciones next;

    @Override
    public void setNextManejador(ManejadorTRansacciones next) {
        this.next = next;
    }

    @Override
    public void ejecutarTransaccion(Transaccion transaccion) {

        if(transaccion.getTipoTransaccion() == TipoTransaccion.Retiro){
            float cantidad = transaccion.getCantidad() - transaccion.getBalance();
            System.out.println("El nuevo balance despues de un retiro es " + cantidad);
        }else{
            this.next.ejecutarTransaccion(transaccion);
        }
    }
}
