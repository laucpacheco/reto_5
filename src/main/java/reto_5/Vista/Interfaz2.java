package reto_5.Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import reto_5.Modelo.VO.Consulta2VO;

import java.awt.*;
import java.util.ArrayList;

public class Interfaz2 extends JFrame {
    JPanel panelg;
    JTable tabla;
    JScrollPane scpanel01;
    DefaultTableModel modelo;

    public Interfaz2(){
        setTitle("Informe 2");
        setSize(500,320);
        setResizable(false);
        
        panelg= new JPanel();
        panelg.setBackground(new Color(235, 222, 240));
        
        String[] columnas={"ID","Constructora","Número de Habitaciones","Ciudad"};
        ArrayList<String[]> d=Consulta2VO.valores();
        String[][] Datos= new String[d.size()][4];

        for (int i = 0; i < d.size(); i++) {
            int j=0;
            for (String s : d.get(i)) {
                Datos[i][j]=s;
                j++;
            }
            
        }
        
        //String[][] Datos={{"","","",""},{"","","",""}};
        modelo=new DefaultTableModel(Datos,columnas);
        tabla=new JTable(modelo);
        tabla.setSelectionBackground(Color.GRAY);
        tabla.setShowHorizontalLines(true);
        tabla.setShowVerticalLines(true);

        scpanel01=new JScrollPane(tabla);
        scpanel01.setBounds(20,20,460,250);
        add(scpanel01);


        add(panelg);
        setVisible(true);
    }
}
    
