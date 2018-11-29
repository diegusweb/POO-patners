package Builder.builder2;

public class Main {

    public static void main(String[] args){
        Usuario codei = Usuario.Make("Diego", "Rueda")
                .setMedioOcntacto(true)
                .setTelefono("123-333-44445")
                .setDireccion("Oquendo")
                .Build();

        System.out.println(codei);
    }
}
