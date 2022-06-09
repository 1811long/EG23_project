package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZonePanel extends JPanel {

    JButton zoneButton = new JButton();
    JLabel zoneLabel = new JLabel();

    private final Font FONT_DEFAULT = new Font("Taroma", Font.BOLD,15);

    public ZonePanel(ImageIcon imageIcon, String text){
        setLayout(null);
        setSize(103,500);

        Image image = imageIcon.getImage();
        Image imageModify  = image.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(imageModify);

        zoneButton.setIcon(imageIcon);
        zoneButton.setBounds(0,0,103,170);
        zoneButton.setBackground(new Color(196, 196, 196));

       zoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        add(zoneButton);

        zoneLabel.setText(text);
        zoneLabel.setBounds(0,190,103,50);
        zoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
        zoneLabel.setFont(FONT_DEFAULT);
        add(zoneLabel);
    }

    public void setBackgroundButton(Color color) {
        zoneButton.setBackground(color);
    }
}
