package reto_5.Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import reto_5.Modelo.VO.Consulta1VO;
import java.awt.*;
import java.util.ArrayList;

public class Interfaz1 extends JFrame{
    JPanel panelg;
    JTable tabla;
    JScrollPane scpane101;
    DefaultTableModel modelo;
    

    public Interfaz1(){
        setTitle("Informe 1");
        setSize(500, 800);
        setResizable(false);

        panelg = new JPanel();
        panelg.setBackground(new Color(235, 222, 240));

        String[] columnas = {"ID", "Nombre", "Apellido", "Ciudad"};
        ArrayList<String[]> d = Consulta1VO.valores();
        String[][] Datos = new String[d.size()][4];

        for (int i = 0; i < d.size(); i++) {
            //String[] s = d.get(i);
            int j = 0;
            for (String s : d.get(i)) {
                Datos[i][j] = s;
                j++;
            }
            
        }

        //String[][] Datos={{"", "", "", ""},{"", "", "", ""}};
        modelo = new DefaultTableModel(Datos, columnas);
        tabla = new JTable(modelo);
        tabla.setSelectionBackground(Color.GRAY);
        tabla.setShowHorizontalLines(true);
        tabla.setShowVerticalLines(true);
        
        
        scpane101 = new JScrollPane(tabla);
        scpane101.setBounds(20, 20, 460, 740);
        
        
        add(scpane101);
        add(panelg);
        setVisible(true);

        

    }
    
}
