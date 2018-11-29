package Builder.builder1;

public class Main {

    public static void main(String[] args){

        Usuario codi = Usuario.Make("Codi", "Facildemo")
                .setEmail("diego.rueda@gmail.com")
                .setTelefono("123-333-444")
                .setDireccion("calle oquendo")
                .Build();

        System.out.println(codi);

    }
}
