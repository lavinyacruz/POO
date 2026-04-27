public class Professor extends Funcionario implements Presença{
    private String disc;

    public Professor (String disc, String nome){
        super(nome);
        this.disc=disc;
    }
    public String getDisc() {
        return disc;
    }
    public void setDsic(String disc) {
        this.disc = disc;
    }

    public void exibirDados(){
        System.out.println("Funcionario: "+getNome());
    }
    public void registrarPresença(){
        System.out.println("Presença registrada para a(o) funcionaria(o) "+getNome());
    }
    public void lecionar(){
        System.out.println(nome+" leciona a materia "+getDisc());
    }

}
