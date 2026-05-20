package atv03_FlowLayout;
import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout extends JFrame {
    public ExemploFlowLayout(){

        super("Frame com FlowLayout");
        this.setSize(320, 240);
        Container c = this.getContentPane();

        JButton b1 = new JButton("Botão 1");
        JButton b2 = new JButton("Botão 2");
        JButton b3 = new JButton("Botão 3");

        c.add(b1);
        c.add(b2);
        c.add(b3);

        c.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.setVisible(true);

    }
}