package br.com.gafr.sample.gui;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JPanelExemplo1 {

    private JFrame jFrame;
    private JPanel panel1;
    private JPanel panel2;
    private JTextField textFieldNome;
    private JTextField textFieldSobrenome;

    public JPanelExemplo1() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        jFrame = new JFrame("Frame test");
        jFrame.getContentPane().setLayout(new GridLayout(2,2));

        /*
         * A JPainel to add the jLabel and jTextField componnents 
         * which contains the label: "name:" and the field for editing 
         */
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 0));

        /* 
         * Another JPainel to add the JLabel and JTextField components
         * which contains the label "Lastname:" and the field for editing.
         */
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 0));

        textFieldNome = new JTextField(15);
        textFieldSobrenome = new JTextField(15);

        //Adding components to JPanel
        panel1.add(new JLabel("Name: "));
        panel1.add(textFieldNome);

        //Adding JPanel components to JFrame
        panel2.add(new JLabel("Last Name:"));
        panel2.add(textFieldSobrenome);

        //Adição dos componentes JPanel ao JFrame
        jFrame.getContentPane().add(panel1);
        jFrame.getContentPane().add(panel2);

        //Automatically adjusts window size, alternative to setSize ()
        jFrame.pack();

        //Center the Screen
        jFrame.setLocationRelativeTo(null);

        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new JPanelExemplo1();
    }
}