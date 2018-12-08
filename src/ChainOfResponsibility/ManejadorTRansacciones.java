package ChainOfResponsibility;

public interface ManejadorTRansacciones {

    void setNextManejador(ManejadorTRansacciones next);

    void ejecutarTransaccion(Transaccion transaccion);
}
