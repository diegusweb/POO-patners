package ChainOfResponsibility;

public class Main {

    public static void main(String[] args){

        //sepuede mejorar este codigo usando virtual proxy
        Transaccion transaccion = new Transaccion(100,200, TipoTransaccion.Deposito);

        ManejadorTRansacciones deposito = new Deposito();
        ManejadorTRansacciones retiro = new Reembolso();
        ManejadorTRansacciones reembolso = new Reembolso();

        deposito.setNextManejador(retiro);
        retiro.setNextManejador(reembolso);

        deposito.ejecutarTransaccion(transaccion);
    }
}
