package Facade.example2;

public class BankFacade {

    private int accountNumber;
    private int securityCode;

    private AccountNumberCheck accountCheck;
    private SecurityCodeCheck codeCheck;
    private FundsCheck fundsCheck;

    private WelcomeMessage bankWelcome;

    public BankFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        bankWelcome = new WelcomeMessage();
        accountCheck = new AccountNumberCheck();
        codeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();
    }

    private int getAccountNumber() {
        return accountNumber;
    }

    private int getSecurityCode() {
        return securityCode;
    }

    public void withDrawcash(double cashAmmount){

        if(canWithdraw(cashAmmount)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    public void depositCash(double cashAmount){
        if(canDeposit(cashAmount)) {
            fundsCheck.makeDeposit(cashAmount);
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    private boolean canWithdraw(double cashAmount){
        return accountCheck.isAccountActive(getAccountNumber()) &&
                codeCheck.isCodeCorrect(getSecurityCode()) &&
                fundsCheck.haveEnoughMoney(cashAmount);
    }

    private boolean canDeposit(double cashAmount){
        return accountCheck.isAccountActive(getAccountNumber()) &&
                codeCheck.isCodeCorrect(getSecurityCode());
    }
}
