/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerosw;

import java.awt.Color;
import java.awt.Font;
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
public class Primera1 extends JFrame implements ActionListener {

    JButton ConsultaSaldo, Depositar, Retirar;
    
    JLabel Bienvenida, TextBienvenida;

    public Primera1() {
        
        setLayout(null);
        setSize(545, 150);
        setLocationRelativeTo(null);
        setTitle("Cajero Automatico");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        
        Bienvenida = new JLabel("Bienvenido");
	Bienvenida.setBounds(225, 10, 80, 25);
	add(Bienvenida);
        
        TextBienvenida = new JLabel("Selecciona Una opcion");
	TextBienvenida.setBounds(190, 20, 200, 25);
	add(TextBienvenida);
                //--------------------------------------------------------------

        ConsultaSaldo = new JButton("Consultar Saldo");
        ConsultaSaldo.setBounds(10, 80, 150, 25);

        add(ConsultaSaldo);
        ConsultaSaldo.addActionListener(this);
        
        Depositar = new JButton("Depositar");
        Depositar.setBounds(180, 80, 150, 25);
        
        add(Depositar);
        Depositar.addActionListener(this);
        
        Retirar = new JButton("Retirar");
        Retirar.setBounds(360, 80, 150, 25);
        add(Retirar);
        Retirar.addActionListener(this);
      
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                String cadb = e.getActionCommand();
        if(cadb.equals("Consultar Saldo"))
        {
            dispose();
             Consulta con = new Consulta();
        }
        else
        if(cadb.equals("Depositar"))
        {
            dispose();
            Deposito dep = new Deposito();
        }
        else
            if(cadb.equals("Retirar"))
        {
            dispose();
            Retiro ret = new Retiro();
        }

        
    }

}