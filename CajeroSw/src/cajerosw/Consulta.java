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
import javax.swing.WindowConstants;

/**
 *
 * @author Braulio Flores
 */
public class Consulta extends JFrame implements ActionListener {

    JButton Home;
    private float saldo=0f;
    JLabel Saldo, TextSaldo;

    public Consulta() {
        
        setLayout(null);
        setSize(545, 150);
        setLocationRelativeTo(null);
        setTitle("Consulta de Saldo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        
        Saldo = new JLabel("Tu saldo actual es de:");
	Saldo.setBounds(215, 10, 140, 25);
	add(Saldo);
        
        TextSaldo = new JLabel("Tu saldo es "+saldo);
        
	TextSaldo.setBounds(170, 30, 200, 25);
	add(TextSaldo);
                //--------------------------------------------------------------

        Home = new JButton("Menu");
        Home.setBounds(10, 80, 150, 25);
        add(Home);
        Home.addActionListener(this);
        
      
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                String cadb = e.getActionCommand();
        if(cadb.equals("Menu"))
        {
            dispose();
             Primera1 Home = new Primera1();
        }
    }
}