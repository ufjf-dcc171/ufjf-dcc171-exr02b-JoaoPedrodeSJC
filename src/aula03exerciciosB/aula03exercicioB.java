/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03exerciciosB;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class aula03exercicioB extends JFrame{
    private final JLabel Labeltxt1,Labeltxt2; 
    private final JTextField entrada;
    private StringBuffer texto;

    public aula03exercicioB() throws HeadlessException {
        super("Inversão de texto");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        Labeltxt1 = new JLabel("Digite o texto a ser invertido:");
        entrada = new JTextField(15);
        add(Labeltxt1);
        add(entrada);
        
        Labeltxt2 = new JLabel("");
        add(Labeltxt2);
        
        entrada.addActionListener(new Entrada());
    }

    private class Entrada implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            texto = new StringBuffer();
            texto.append(entrada.getText());
            Labeltxt2.setText(texto.reverse().toString());
        }
    }
}