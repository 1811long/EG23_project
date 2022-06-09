package components;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ConfigurationPanel extends JPanel {
     private JLabel valueLabel = new JLabel("0");
     public CustomizedButton plusButton = new CustomizedButton(new ImageIcon(getClass().getResource("../img/plus_sign.png")));
     public CustomizedButton minusButton = new CustomizedButton(new ImageIcon(getClass().getResource("../img/minus_sign.png")));

    public ConfigurationPanel(String text, ImageIcon imageIcon) throws IOException {
            setBackground(new Color(255, 250, 205));
            setBorder(new LineBorder(new Color(0, 0, 0), 2));
            setSize(301,53);
            setLayout(null);

            plusButton.setBounds(249,0, 52, 53);
            add(plusButton);
            plusButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int val = Integer.parseInt(valueLabel.getText());
                    valueLabel.setText(String.valueOf(val+1));
                }
            });

            minusButton.setBounds(197,0, 52, 53);
            add(minusButton);
            minusButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int val = Integer.parseInt(valueLabel.getText());
                    if (val > 0){
                        valueLabel.setText(String.valueOf(val-1));
                    }
                }
            });

            JLabel picLabel = new JLabel(getLeftIcon(imageIcon));
            picLabel.setBounds(0,0,52,53);
            add(picLabel);

            JLabel textLabel = new JLabel(text);
            textLabel.setBounds(52,0,100,53);
            add(textLabel);

            valueLabel.setBounds(167,0,30,53);
            add(valueLabel);
        }

        private ImageIcon getLeftIcon(ImageIcon icon){
            Image image = icon.getImage();
            Image newimg = image.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(newimg);
            return icon;
        }

}
