package Facade.example2;

public class AccountNumberCheck {

    private int accountNumber = 1234567890;

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public boolean isAccountActive(int accountNumberToCheck){
        if(accountNumberToCheck == getAccountNumber()){
            return true;
        }

        return false;
    }
}
