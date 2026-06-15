package model;

public class Laboratorio {
    private int id;
    private static String nome;
    private int bloco;
    private int capacidade;
    private String responsavel;

    public Laboratorio(int id,String nome,int bloco,int capacidade,String responsavel){
        this.id=id;
        this.nome=nome;
        this.bloco=bloco;
        this.capacidade=capacidade;
        this.responsavel=responsavel;
    }

    public Laboratorio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
