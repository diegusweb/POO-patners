package ChainOfResponsibility;

public class Reembolso implements ManejadorTRansacciones {

    private ManejadorTRansacciones next;

    @Override
    public void setNextManejador(ManejadorTRansacciones next) {
        this.next = next;
    }

    @Override
    public void ejecutarTransaccion(Transaccion transaccion) {

        if(transaccion.getTipoTransaccion() == TipoTransaccion.Reembolso){
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("El nuevo balance despues de un reembolso es " + cantidad);
        }else{
            System.out.println("Operacion no valida");
        }
    }
}
