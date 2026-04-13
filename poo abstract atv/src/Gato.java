public class Gato extends Animal{
private String corDoPelo;

public Gato (String nome, String corDoPelo){
    super(nome);
    this.corDoPelo=corDoPelo;}

    public String getCorDoPelo(){return corDoPelo;}
    public void setCorDoPelo (String corDoPelo) {this.corDoPelo=corDoPelo;}

    public void emitirSom(){
    System.out.println("Miau!");
    }
    public void mover(){
    System.out.println("Saltando agilmente");
    }

}
