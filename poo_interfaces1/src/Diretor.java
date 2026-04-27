public class Diretor extends Funcionario{
    private String setor;

    public Diretor (String setor, String nome){
        super(nome);
        this.setor=setor;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void exibirDados(){
        System.out.println("Funcionario: "+ getNome());
    }
    public void decisão(){
        System.out.println(nome+" esta tomando decisão no setor de "+getSetor());
    }
}
