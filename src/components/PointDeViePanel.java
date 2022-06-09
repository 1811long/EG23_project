package components;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PointDeViePanel extends JPanel {

    private Font FONT_DEFAULT = new Font("Tahoma", Font.BOLD, 20);
    private final Color COLOR_POINT_DE_VIE = new Color(0,255,0);
    private final Color COLOR_POINT_PERDU = new Color(255,0,0);
    private final Color COLOR_TUE = new Color(128,128,128);

    private final int width = 250;
    private final int height = 100;

    public PointDeViePanel (String text, int pointDeVie, ImageIcon icon){
        setSize(width,height);

        JPanel panelPointDeVie = new JPanel();
        JPanel panelPointPerdu = new JPanel();

        panelPointDeVie.setBackground(COLOR_POINT_DE_VIE);
        panelPointPerdu.setBackground(COLOR_POINT_PERDU);

        int widthPointDeVie = pointDeVie*(width-50)/100;
        panelPointDeVie.setBounds(50,0,widthPointDeVie,50);
        panelPointPerdu.setBounds(50+widthPointDeVie,0,width-50-widthPointDeVie,50);

        add(panelPointDeVie);
        add(panelPointPerdu);

        setLayout(null);
        DragListener dragListener = new DragListener();
        addMouseListener(dragListener);
        addMouseMotionListener(dragListener);

        ImageLabel imageLabel = new ImageLabel(icon,50,50);
        imageLabel.setBounds(0,0,50,50);
        add(imageLabel);

        JLabel textLabel = new JLabel(text);
        textLabel.setFont(FONT_DEFAULT);
        textLabel.setBounds(90,45,300,50);
        add(textLabel);
    }
}

