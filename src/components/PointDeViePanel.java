package components;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PointDeViePanel extends JPanel {

    private Font FONT_DEFAULT = new Font("Tahoma", Font.BOLD, 13);

    private final Color COLOR_POINT_DE_VIE = new Color(0,255,0);
    private final Color COLOR_POINT_PERDU = new Color(255,0,0);
    private final Color COLOR_TUE = new Color(158,147,147);

    private final int width = 180;
    private final int height = 50;

    public PointDeViePanel (String text, int pointDeVie, ImageIcon icon){
        setSize(width,height);
        setLayout(null);

        JLabel textLabel = new JLabel(text);
        textLabel.setFont(FONT_DEFAULT);
        textLabel.setForeground(Color.BLUE);
        textLabel.setBounds(55,7,300,35);
        add(textLabel);

        JPanel panelPointDeVie = new JPanel();
        JPanel panelPointPerdu = new JPanel();

        if (pointDeVie > 0){
            panelPointDeVie.setBackground(COLOR_POINT_DE_VIE);
            panelPointPerdu.setBackground(COLOR_POINT_PERDU);
        }else{
            panelPointDeVie.setBackground(COLOR_TUE);
            panelPointPerdu.setBackground(COLOR_TUE);
        }

        int widthPointDeVie = pointDeVie*(width-50)/100;
        panelPointDeVie.setBounds(50,0,widthPointDeVie,50);
        panelPointPerdu.setBounds(50+widthPointDeVie,0,width-50-widthPointDeVie,50);

        add(panelPointDeVie);
        add(panelPointPerdu);

        ImageLabel imageLabel = new ImageLabel(icon,50,50);
        imageLabel.setBounds(0,0,50,50);
        add(imageLabel);

        DragListener dragListener = new DragListener();
        addMouseListener(dragListener);
        addMouseMotionListener(dragListener);
    }
}

