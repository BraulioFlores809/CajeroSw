/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerosw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Braulio Flores
 */
public class Retiro extends JFrame implements ActionListener {

    JButton Home;
    JTextField Retiro ; 
    JLabel Saldo, TextBienvenida;

    public Retiro() {
        
        setLayout(null);
        setSize(545, 150);
        setLocationRelativeTo(null);
        setTitle("Retiro");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        
        Saldo = new JLabel("Ingresa la cantidad que deseas retirar");
	Saldo.setBounds(170, 10, 250, 25);
	add(Saldo);
        
        Retiro = new JTextField(" ");
        Retiro.setBounds(170, 30, 200, 25);
        add(Retiro);
        Retiro.addActionListener(this);
                //--------------------------------------------------------------

        Home = new JButton("Retirar");
        Home.setBounds(10, 80, 150, 25);
        add(Home);
        Home.addActionListener(this);
        
      
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                String cadb = e.getActionCommand();
        if(cadb.equals("Retirar"))
        {
            dispose();
             Primera1 Home = new Primera1();
        }
    }
}