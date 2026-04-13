public class Main{
    public static void main(String[] args){
    Gato gato1=new Gato("Mimi", "Marrom");
    Papagaio papagaio1=new Papagaio("Mari", "Azul");
    Vaca vaca1=new Vaca("Mimosa", 001);

    gato1.emitirSom();
    gato1.mover();

    papagaio1.emitirSom();
    papagaio1.mover();

    vaca1.emitirSom();
    vaca1.mover();
    }
}