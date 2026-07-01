import controller.SensorController;
import model.Sensor;
import controller.MedicaoController;
import model.Medicao;

import javax.swing.*;

public class Janela extends JFrame{
    private JLabel labelCodigo;
    private JButton botaoCadastrarS;
    private JButton botaoConsultarS;
    private JTextField numCodigo;
    private JTextArea texoResultadoS;

    private JLabel sensor;
    private JButton botaoCadastrarM;
    private JButton botaoConsultarM;
    private JTextField numSensor;
    private JTextArea texoResultadoM;

    public Janela(){
        initComponents();
    }
    private void initComponents(){
        labelCodigo=new JLabel();
        numCodigo=new JTextField();
        botaoCadastrarS= new JButton();
        botaoConsultarS= new JTextArea();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro de Sensor");
        setLayout(null);

        labelCodigo.setText("Codigo: ");
        labelCodigo.setBounds(30,30,60,25);
        add(labelCodigo);

        botaoCadastrarS.setText("Cadastrar Sensor");
        botaoCadastrarS.addActionListener(evt->{
            int codigo = numCodigo.getText();
           controller.cadastrarSensor(codigo);
           JOptionPane.showMessageDialog(
                   this,
                   "Sensor cadastrado com sucesso!"
           );
        });
    }

}
