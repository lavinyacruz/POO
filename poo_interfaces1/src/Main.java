//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {
public static void main (String[] args){
    Diretor diretor1=new Diretor("Administração", "Carlos");
    Secretaria secretaria1=new Secretaria("Manhã", "Bruna");
    Professor professor1= new Professor("Matematica", "Ana");
    Terceirizado terceirizado1=new Terceirizado("Jose");

    diretor1.exibirDados();
    diretor1.decisão();

    secretaria1.exibirDados();
    secretaria1.registrarPresença();
    secretaria1.documentos();

    professor1.exibirDados();
    professor1.registrarPresença();
    professor1.lecionar();

    terceirizado1.serviço();
    terceirizado1.registrarPresença();
}
}
