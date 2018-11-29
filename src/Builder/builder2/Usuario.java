package Builder.builder2;

public class Usuario {

    private String nombre;
    private String apellido;

    private boolean medioOcntacto = false;

    private String email;
    private String telefono;
    private String direccion;

    private String medioDePago;
    private String token;

    //Generar un costructor en el que reviba por parametro los parametros obligatorios
    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = "";
        this.telefono = "";
        this.direccion = "";
        this.medioDePago = "";
        this.token = "";
    }

    public BuilderUsuario setMedioOcntacto(boolean medioOcntacto) {
        if(!medioOcntacto){
            throw  new IllegalArgumentException("No es posible asignar un vlaor falso a medio de contacto");
        }

        this.medioOcntacto = medioOcntacto;
        return new BuilderUsuario(this);
    }

    public static Usuario Make(String nombre, String apellido) {
        return new Usuario(nombre, apellido);
    }

    //ultimo paso es generar un nevo objeto
    public Usuario Build() {
        return this;
    }

    public String toString() {
        return " " + this.nombre + " " + this.apellido + " " + this.email + " " + this.telefono+ " " + this.direccion+ " " + this.medioDePago;
    }


    public static class BuilderUsuario{
        private Usuario usuario;

        public BuilderUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public BuilderUsuario setEmail(String email) {
            usuario.email = email;
            return this;
        }

        public BuilderUsuario setTelefono(String telefono) {
            usuario.telefono = telefono;
            return this;
        }

        public BuilderUsuario setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
        }

        public BuilderUsuario setMedioDePago(String medioDePago) {
            if(usuario.email == "")
                throw  new IllegalArgumentException("No es posible porque son vacios");

            usuario.medioDePago = medioDePago;
            return this;
        }

        public BuilderUsuario setToken(String token){
            if(usuario.medioDePago == "")
                throw  new IllegalArgumentException("No es posible porque medio de pago es vacio");

            usuario.token = token;
            return this;
        }

        public Usuario Build(){
            return usuario;
        }
    }

}
