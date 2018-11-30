package Adapter;

public class AdaptadorDB implements IConexionSQL {

    private IconexionNoSQL noSQL;

    public AdaptadorDB(IconexionNoSQL noSQL) {
        this.noSQL = noSQL;
    }

    @Override
    public void conexion() {
        this.noSQL.conexion();
    }

    @Override
    public String runQuery() {
        return this.noSQL.excecuteSentence();
    }
}
