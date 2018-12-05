package Proxy.sample2;

public class ProxyService implements IService {

    private IService service;
    private Usuario usuario;

    public ProxyService(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void leer() {
        this.obtenerServicio().leer();
    }

    @Override
    public void escribir() {
        this.obtenerServicio().escribir();
    }

    @Override
    public void eliminar() {
        this.obtenerServicio().eliminar();
    }

    @Override
    public void modificar() {
        this.obtenerServicio().modificar();
    }

    private IService obtenerServicio(){
        if(this.service == null){
            this.service = new Service();
        }

        return this.service;
    }
}
