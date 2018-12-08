package ChainOfResponsibility;

public class Deposito implements ManejadorTRansacciones {

    private ManejadorTRansacciones next;

    @Override
    public void setNextManejador(ManejadorTRansacciones next) {
        this.next = next;
    }

    @Override
    public void ejecutarTransaccion(Transaccion transaccion) {

        if(transaccion.getTipoTransaccion() == TipoTransaccion.Deposito){
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("El nuevo balance despues de un deposito es " + cantidad);
        }else{
            this.next.ejecutarTransaccion(transaccion);
        }
    }
}
