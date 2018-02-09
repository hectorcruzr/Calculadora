import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Calculadora extends JFrame {
    JPanel panelSuperior = new JPanel();
    JPanel panelInferior = new JPanel();
    JLabel display = new JLabel(" ");
    JButton uno = new JButton("1");
    JButton dos = new JButton("2");
    JButton tres = new JButton("3");
    JButton cuatro = new JButton("4");
    JButton cinco = new JButton("5");
    JButton seis = new JButton("6");
    JButton siete = new JButton("7");
    JButton ocho = new JButton("8");
    JButton nueve = new JButton("9");
    JButton cero = new JButton("0");
    JButton mas = new JButton("+");
    JButton menos = new JButton("-");
    JButton por = new JButton("*");
    JButton entre = new JButton("/");
    JButton clear = new JButton("CL");
    JButton igual = new JButton("=");

    public Calculadora() {
        setLayout(new BorderLayout());
        setSize(320, 480);

        panelSuperior.setLayout(new FlowLayout());
        panelInferior.setLayout(new GridLayout(4, 4));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        panelSuperior.setSize(this.getWidth(), 100);
        panelSuperior.setBackground(Color.black);
        display.setForeground(Color.white);
        display.setFont(new Font("Tahoma", 0, 25));
        panelSuperior.add(display);


        panelInferior.add(siete);
        panelInferior.add(ocho);
        panelInferior.add(nueve);
        panelInferior.add(entre);
        siete.setFont(new java.awt.Font("Tahoma", 0, 35));
        ocho.setFont(new java.awt.Font("Tahoma", 0, 35));
        nueve.setFont(new java.awt.Font("Tahoma", 0, 35));
        entre.setFont(new java.awt.Font("Tahoma", 0, 35));

        panelInferior.add(cuatro);
        panelInferior.add(cinco);
        panelInferior.add(seis);
        panelInferior.add(por);
        cuatro.setFont(new java.awt.Font("Tahoma", 0, 35));
        cinco.setFont(new java.awt.Font("Tahoma", 0, 35));
        seis.setFont(new java.awt.Font("Tahoma", 0, 35));
        por.setFont(new java.awt.Font("Tahoma", 0, 35));

        panelInferior.add(uno);
        panelInferior.add(dos);
        panelInferior.add(tres);
        panelInferior.add(menos);
        uno.setFont(new java.awt.Font("Tahoma", 0, 35));
        dos.setFont(new java.awt.Font("Tahoma", 0, 35));
        tres.setFont(new java.awt.Font("Tahoma", 0, 35));
        menos.setFont(new java.awt.Font("Tahoma", 0, 35));

        panelInferior.add(cero);
        panelInferior.add(clear);
        panelInferior.add(igual);
        panelInferior.add(mas);
        cero.setFont(new java.awt.Font("Tahoma", 0, 35));
        clear.setFont(new java.awt.Font("Tahoma", 0, 35));
        igual.setFont(new java.awt.Font("Tahoma", 0, 35));
        mas.setFont(new java.awt.Font("Tahoma", 0, 35));

        eventos();
        add(panelSuperior, BorderLayout.NORTH);
        add(panelInferior, BorderLayout.CENTER);
        setVisible(true);

    }

    private void eventos() {

        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = display.getText();
                texto += "1";
                display.setText(texto);
                display.updateUI();
            }
        });
        uno.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String texto = display.getText();
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_1 || key == KeyEvent.VK_NUMPAD1) {
                    texto += "1";
                    display.setText(texto);
                    display.updateUI();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = display.getText();
                texto += "2";
                display.setText(texto);
                display.updateUI();
            }
        });
        dos.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String texto = display.getText();
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_2 || key == KeyEvent.VK_NUMPAD2) {
                    texto += "2";
                    display.setText(texto);
                    display.updateUI();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = display.getText();
                texto += "3";
                display.setText(texto);
                display.updateUI();
            }
        });
        tres.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String texto = display.getText();
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_3 || key == KeyEvent.VK_NUMPAD3) {
                    texto += "3";
                    display.setText(texto);
                    display.updateUI();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = display.getText();
                texto += "4";
                display.setText(texto);
                display.updateUI();
            }
        });
        cuatro.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String texto = display.getText();
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_4 || key == KeyEvent.VK_NUMPAD4) {
                    texto += "4";
                    display.setText(texto);
                    display.updateUI();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = display.getText();
                texto += "5";
                display.setText(texto);
                display.updateUI();
            }
        });
        cinco.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String texto = display.getText();
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_5 || key == KeyEvent.VK_NUMPAD5) {
                    texto += "5";
                    display.setText(texto);
                    display.updateUI();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = display.getText();
                texto += "6";
                display.setText(texto);
                display.updateUI();
            }
        });
        seis.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String texto = display.getText();
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_6 || key == KeyEvent.VK_NUMPAD6) {
                    texto += "6";
                    display.setText(texto);
                    display.updateUI();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = display.getText();
                texto += "7";
                display.setText(texto);
                display.updateUI();
            }
        });
        siete.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String texto = display.getText();
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_7 || key == KeyEvent.VK_NUMPAD7) {
                    texto += "7";
                    display.setText(texto);
                    display.updateUI();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = display.getText();
                texto += "8";
                display.setText(texto);
                display.updateUI();
            }
        });
        ocho.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String texto = display.getText();
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_8 || key == KeyEvent.VK_NUMPAD8) {
                    texto += "8";
                    display.setText(texto);
                    display.updateUI();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = display.getText();
                texto += "9";
                display.setText(texto);
                display.updateUI();
            }
        });
        nueve.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String texto = display.getText();
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_9 || key == KeyEvent.VK_NUMPAD9) {
                    texto += "9";
                    display.setText(texto);
                    display.updateUI();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = display.getText();
                texto += "0";
                display.setText(texto);
                display.updateUI();
            }
        });
        cero.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String texto = display.getText();
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_0 || key == KeyEvent.VK_NUMPAD0) {
                    texto += "0";
                    display.setText(texto);
                    display.updateUI();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        /*
        punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto=display.getText();
                if(existePunto(texto)){
                    texto+="";
                }
                else{
                    texto+=".";
                }
                display.setText(texto);
                display.updateUI();
            }
        });
        */
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(" ");
                display.updateUI();
            }
        });
        clear.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String texto = display.getText();
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_ESCAPE || key == KeyEvent.VK_DELETE) {
                    texto = " ";
                    display.setText(texto);
                    display.updateUI();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

    private boolean existePunto(String texto) {
        boolean resultado = false;
        for (int indice = 0; indice < texto.length(); indice++) {
            if (texto.charAt(indice) == '.')
                return true;
        }
        return resultado;
    }

}
