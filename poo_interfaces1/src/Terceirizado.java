public class Terceirizado implements Presença{
    private String nome;

    public Terceirizado (String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void registrarPresença(){
        System.out.println("Presença registrada para a(o) funcionaria(o) "+nome);
    }
    public void serviço(){
        System.out.println(nome+" esta prestano serviço");
    }

}

