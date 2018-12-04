package Facade.example2;

public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getcashInAcount(){
        return cashInAccount;
    }

    public void decreasecashInAccount(double cashWithdrawn){
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccunt(double cashDeposited){
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal){

        if(cashToWithdrawal > getcashInAcount()){
            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getcashInAcount());
            return false;
        }else{
            decreasecashInAccount(cashToWithdrawal);
            System.out.println("Withdrawal Complete: Current Balance is " + getcashInAcount());
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit){
        increaseCashInAccunt(cashToDeposit);
        System.out.println("Deposit Complete: Current Balance is " + getcashInAcount());
    }
}
