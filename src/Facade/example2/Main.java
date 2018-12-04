package Facade.example2;

public class Main {

    public static void main(String[] args) {

        BankFacade accesingBank = new BankFacade(1234567890, 1234);

        accesingBank.withDrawcash(50.00);
        accesingBank.withDrawcash(900.00);
        accesingBank.depositCash(200.00);

        accesingBank.withDrawcash(900.00);

    }
}
