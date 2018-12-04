package Facade.example2;

public class SecurityCodeCheck {

    private int securutyCode = 1234;

    public int getSecurityCode(){
        return securutyCode;
    }

    public boolean isCodeCorrect(int securityCode){

        if(securityCode == getSecurityCode()){
            return true;
        }

        return false;
    }
}
