import javax.swing.*;
import java.awt.*;

public class Calculadora2  extends JFrame{
    public Calculadora2(){
        JPanelDatos jPanelDatos=new JPanelDatos();
        JPanelNumeros jPanelNumeros=new JPanelNumeros();
        setTitle("Calculadora v 2.0");
        setLayout(new BorderLayout());
        setBounds(500,0,400,500);
        add(jPanelDatos,BorderLayout.NORTH);
        //jPanelNumeros.eventos(jPanelDatos.getjLabelNumero());
        add(jPanelNumeros,BorderLayout.CENTER);

        setVisible(true);
    }
}
