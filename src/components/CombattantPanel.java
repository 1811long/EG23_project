package components;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import pages.PageConfiguration;

public class CombattantPanel extends JPanel {

    private Font FONT_DEFAULT = new Font("Tahoma", Font.BOLD, 20);
    private JButton configurerButton = new JButton();

    public CombattantPanel(String text, ImageIcon icon){
        setSize(630,95);
        setBackground(new Color(163,170,225));
        setLayout(null);

        ImageLabel imageLabel = new ImageLabel(icon,80,80);
        imageLabel.setBounds(10,0,95,95);
        add(imageLabel);

        JLabel textLabel = new JLabel(text);
        textLabel.setFont(FONT_DEFAULT);
        textLabel.setBounds(100,0,300,95);
        add(textLabel);

        setBorder(new LineBorder(new Color(0,0,0)));
        ImageIcon imgButton = resizeImageIcon(new ImageIcon(getClass().getResource("/img/configurerButton.png")),70,70);

        configurerButton.setBounds(550,0,95,95);
        configurerButton.setIcon(imgButton);
        configurerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PageConfiguration page = null;
                try {
                    page = new PageConfiguration();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                page.setVisible(true);
            }
        });
        add(configurerButton);
    }

    private ImageIcon resizeImageIcon(ImageIcon icon,int width, int height){
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(width,height, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);
        return icon;
    }

}
