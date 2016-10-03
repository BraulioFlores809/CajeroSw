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
public class Deposito extends JFrame implements ActionListener {

    JButton Home;
    private float saldo=0f;
    private float num=0f;
        JTextField Depositos ; 

    JLabel Deposito, TextBienvenida;

    public Deposito() {
        
        setLayout(null);
        setSize(545, 150);
        setLocationRelativeTo(null);
        setTitle("Deposito");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        
        Deposito = new JLabel("Ingresa la cantidad que deseas depositar");
	Deposito.setBounds(170, 10, 250, 25);
	add(Deposito);
        
        Depositos = new JTextField(" ");
        Depositos.setBounds(170, 30, 200, 25);
        add(Depositos);
        Depositos.addActionListener(this);
                //--------------------------------------------------------------

        Home = new JButton("Depositar");
        Home.setBounds(10, 80, 150, 25);
        add(Home);
        Home.addActionListener(this);
        
      
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                String cadb = e.getActionCommand();
        if(cadb.equals("Depositar"))
        {
            dispose();
             Primera1 Home = new Primera1();
        }
    }
}