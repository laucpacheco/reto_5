package reto_5.Vista;
import javax.swing.*;
import java.awt.event.*;

public class InterfazG extends JFrame implements ActionListener{
    JPanel panelN;
    JButton btn01;
    JButton btn02;
    JButton btn03;
    
    public InterfazG(){
        setTitle("Proyecto Construcción");
        setSize(550,120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        btn01=new JButton("Informe 1");
        btn01.setBounds(60, 20, 100, 60);
        btn01.addActionListener(this);
        add(btn01);

        btn02=new JButton("Informe 2");
        btn02.setBounds(220, 20, 100, 60);
        btn02.addActionListener(this);
        add(btn02);
        
        btn03=new JButton("Informe 3");
        btn03.setBounds(380, 20, 100, 60);
        btn03.addActionListener(this);
        add(btn03);

        panelN=new JPanel();
        add(panelN);
    
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==btn01){
            new Interfaz1();
        }
        else if(e.getSource()==btn02){
            new Interfaz2();
        }
        else if(e.getSource()==btn03){
            new Interfaz3();
        }
    }
}
