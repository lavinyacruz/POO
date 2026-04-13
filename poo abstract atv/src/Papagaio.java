public class Papagaio extends Animal{
    private String corDaPluma;

    public Papagaio (String nome, String corDaPluma){
        super(nome);
        this.corDaPluma=corDaPluma;}

    public String getCorDaPluma(){return corDaPluma;}
    public void setCorDaPluma (String corDaPluma) {this.corDaPluma=corDaPluma;}

    public void emitirSom(){
        System.out.println("Curupacu!");
    }
    public void mover(){
        System.out.println("Voando pelos ceus!");
    }

}

