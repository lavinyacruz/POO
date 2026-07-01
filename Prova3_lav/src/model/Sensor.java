package model;

public class Sensor {
    private int id;
    public static int codigo;
    private static String tipo;
    private static String loc;

    public Sensor(){
        this.codigo=codigo;
        this.tipo=tipo;
        this.loc=loc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCodigo(int codigo) {
        return Sensor.codigo;
    }

    public static String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public void setCodigo(int codigo) {

    }
}
