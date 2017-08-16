
package aula03exercicios;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class aula03exercicioA extends JFrame{
    private final JLabel LabelNum1,LabelNum2, LabelValor; 
    private final JTextField EntradaNum1,EntradaNum2;
    private Integer num1,num2;

    public aula03exercicioA() throws HeadlessException {
        super("Soma");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        LabelNum1 = new JLabel("Primeiro numero:");
        EntradaNum1 = new JTextField(15);
        add(LabelNum1);
        add(EntradaNum1);
        
        LabelNum2 = new JLabel("Segundo numero:");
        EntradaNum2 = new JTextField(15);
        add(LabelNum2);
        add(EntradaNum2); 
        
        LabelValor = new JLabel("");
        add(LabelValor);
        
        EntradaNum1.addActionListener(new Entrada1());
        EntradaNum2.addActionListener(new Entrada2());
    }

    private class Entrada1 implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            num1 = Integer.parseInt(EntradaNum1.getText());
            EntradaNum2.requestFocus();
            
        }
    }
    private class Entrada2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            num2 = Integer.parseInt(EntradaNum2.getText());
            LabelValor.setText("O valor da soma é: " + Integer.toString(num1+num2));
        }
    }


    /*private class EscreveMensagem implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            LabelValor.setText("O valor da soma é ");
        }
    }*/
    
}
