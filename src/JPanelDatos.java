import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public class JPanelDatos extends JPanel{
    private JLabel jLabelExpresion;
    private JLabel jLabelNumero;


    public JPanelDatos() {
        setLayout(new GridLayout(2, 1));
        setBackground(Color.DARK_GRAY);
        jLabelExpresion = new JLabel("expresion ");
        jLabelExpresion.setForeground(Color.white);
        jLabelExpresion.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabelNumero = new JLabel(" numero ");
        jLabelNumero.setForeground(Color.white);
        jLabelNumero.setFont(new Font("Arial", 0, 40));
        jLabelNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        add(jLabelExpresion);
        add(jLabelNumero);
    }

    public void setjLabelExpresion(JLabel jLabelNumero) {
        this.jLabelExpresion = jLabelNumero;
    }

    public JLabel getjLabelExpresion() {
        return jLabelExpresion;
    }

    public void setjLabelNumero(JLabel jLabelNumero) {
        this.jLabelNumero = jLabelNumero;
    }

    public JLabel getjLabelNumero() {
        return jLabelNumero;
    }


}
