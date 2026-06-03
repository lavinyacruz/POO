package view;

import controller.PessoaController;
import model.Pessoa;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JanelaCadastrarPessoa extends JFrame{
    private PessoaController controller = new PessoaController();
    private JLabel labelNome;
    private JButton botaoCadastrar;
    private JButton botaoConsultar;
    private JTextField textoNome;
    private JTextArea textoResultado;

    public JanelaCadastrarPessoa(){
        initComponents();

    }

    private void initComponents() {
        labelNome=new JLabel();
        textoNome= new JTextField();
        botaoCadastrar=new JButton();
        botaoConsultar=new JButton();
        textoResultado=new JTextArea();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro de pessoa");

        setLayout(null);

        labelNome.setText("Nome:");
        labelNome.setBounds(50,40,40,25);
        add(labelNome);

        textoNome.setColumns(20);
        textoNome.setBounds(90,30,180,20);
        add(labelNome);

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(evt -> {
            String nome = textoNome.getText();
            controller.cadastrarPessoa(nome);
            JOptionPane.showMessageDialog(
                    this, "Pessoa cadastrada com sucesso!"
            );
        });
       botaoCadastrar.setBounds(30,20,110,30);
       add(botaoCadastrar);

       //criar botao consultar

        botaoConsultar.addActionListener(evt->{
            String nome = textoNome.getText();
            Pessoa pessoa = controller.consultarPessoa(nome);
            if(pessoa != null){
                textoResultado.setText(
                        "id:"+pessoa.getId()
                        "nome:"+pessoa.getNome()
                );
            }else{
                textoResultado.setText("Pessoa não enocntrada");
            }
        });
        botaoConsultar.setBounds(160,120,110,30);
        add(botaoConsultar);

        textoResultado.setColumns(20);
        textoResultado.setRows(5);

        textoResultado.setBounds(30,170,240,100);

        setSize(330,350);
        setLocationRelativeTo(null);
    }

}
