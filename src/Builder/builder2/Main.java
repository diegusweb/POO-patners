package Builder.builder2;

public class Main {

    public static void main(String[] args){
        Usuario codei = Usuario.Make("Diego", "Rueda")
                .setMedioOcntacto(true)
                .setEmail("Diego.ridd@gmail.com")
                .setTelefono("123-333-44445")
                .setDireccion("Oquendo")
                .setMedioDePago("Paypal")
                .setToken("1234567ttttttf33")
                .Build();

        System.out.println(codei);
    }
}
