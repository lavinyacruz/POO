public class Secretaria extends Funcionario implements Presença{
    private String turno;

    public Secretaria (String turno, String nome){
        super(nome);
        this.turno=turno;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void exibirDados(){
        System.out.println("Funcionario: "+getNome());
    }
    public void registrarPresença(){
        System.out.println("Presença registrada para a(o) funcionaria(o) "+getNome());
    }
    public void documentos(){
        System.out.println(nome+" esta organizando documentos no turno da"+getTurno());
    }

}
