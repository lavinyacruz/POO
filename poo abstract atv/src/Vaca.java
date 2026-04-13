public class Vaca extends Animal{
    private int id;

    public Vaca (String nome, int id){
        super(nome);
        this.id=id;}

    public int getId(){return id;}
    public void setId (int id) {this.id=id;}

    public void emitirSom(){
        System.out.println("Muu!");
    }
    public void mover(){
        System.out.println("Andando pelo pasto!");
    }

}
