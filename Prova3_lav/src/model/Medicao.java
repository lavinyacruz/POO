package model;

public class Medicao {
    private int id_medicao;
    private static int valor;
    private static String unidade;
    private static int dataHora;
    private static int sensor;

    public Medicao(){
        this.valor=valor;
        this.unidade=unidade;
        this.dataHora=dataHora;
        this.sensor=sensor;
    }

    public int getId_medicao() {
        return id_medicao;
    }

    public void setId_medicao(int id_medicao) {
        this.id_medicao = id_medicao;
    }

    public static int getValor() {
        return valor;
    }

    public static void setValor(int valor) {
        this.valor = valor;
    }

    public static String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public static int getDataHora() {
        return dataHora;
    }

    public void setDataHora(int dataHora) {
        this.dataHora = dataHora;
    }

    public static int getSensor() {
        return sensor;
    }

    public void setSensor(int sensor) {
        this.sensor = sensor;
    }
}
