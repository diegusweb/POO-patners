package Command;

public class Main {

    public static void main(String[] args){
        IDevise tv = new TV();

        ICommand on = new OnDevice(tv);
        ICommand off = new OffDevise(tv);

        on.operacion();
        off.operacion();
    }
}
