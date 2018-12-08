package Command;

public class TV implements IDevise {

    private boolean on;

    public TV() {
        this.on = false;
    }

    @Override
    public void on() {
        this.on = true;
        System.out.println("TV encendido!");
    }

    @Override
    public void off() {
        this.on = true;
        System.out.println("TV apagado!");
    }
}
