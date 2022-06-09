package components;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

public class CombattantPanelDraggable extends JPanel {

    private Font FONT_DEFAULT = new Font("Tahoma", Font.BOLD, 20);

    public CombattantPanelDraggable(String text, ImageIcon icon){
        setSize(400,50);
        setBackground(new Color(163,170,225));
        setLayout(null);

        DragListener dragListener = new DragListener();
        addMouseListener(dragListener);
        addMouseMotionListener(dragListener);

        ImageLabel imageLabel = new ImageLabel(icon,50,50);
        imageLabel.setBounds(0,0,50,50);
        add(imageLabel);

        JLabel textLabel = new JLabel(text);
        textLabel.setFont(FONT_DEFAULT);
        textLabel.setBounds(70,0,300,50);
        add(textLabel);
    }

}



