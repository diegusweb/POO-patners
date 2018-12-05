package Proxy.sample1;

public class ProxyService implements IService {

    private IService service;
    private Usuario usuario;

    public ProxyService(IService service, Usuario usuario) {
        this.service = service;
        this.usuario = usuario;
    }

    @Override
    public void leer() {
        this.service.leer();
    }

    @Override
    public void escribir() {
        if(this.usuario.getNivelPermiso() >= 5){
            this.service.escribir();
        }else{
            throw  new UnsupportedOperationException(("Error de seguridad"));
        }
    }

    @Override
    public void eliminar() {
        if(this.usuario.getNivelPermiso() >= 5){
            this.service.eliminar();
        }else{
            throw  new UnsupportedOperationException(("Error de seguridad"));
        }
    }

    @Override
    public void modificar() {
        if(this.usuario.getNivelPermiso() >= 5){
            this.service.modificar();
        }else{
            throw  new UnsupportedOperationException(("Error de seguridad"));
        }
    }
}
