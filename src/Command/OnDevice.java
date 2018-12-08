package Command;

public class OnDevice implements ICommand {

    private IDevise devise;

    public OnDevice(IDevise devise) {
        this.devise = devise;
    }

    @Override
    public void operacion() {
        this.devise.on();
    }
}
