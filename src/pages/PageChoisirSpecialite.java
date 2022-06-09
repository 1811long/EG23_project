package pages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import components.CustomizedButton;
import components.RetournerButton;

public class PageChoisirSpecialite {
    private JFrame frame;

    CustomizedButton[] buttons = new CustomizedButton[]{
            new CustomizedButton("ISI"),
            new CustomizedButton("RT"),
            new CustomizedButton("A2I"),
            new CustomizedButton("GM"),
            new CustomizedButton("GI"),
            new CustomizedButton("MTE"),
            new CustomizedButton("MM")
    };


    int[][] location = new int[][]{
            {149,77},
            {507,77},
            {149,183},
            {507,183},
            {149,279},
            {507,279},
            {324,401}
    };
    String[] branches = new String[]{"ISI","RT","A2I","GM","GI","MTE","MM"};

    CustomizedButton continuerButton = new CustomizedButton("CONTINUER");

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PageChoisirSpecialite window = new PageChoisirSpecialite();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public PageChoisirSpecialite() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 963, 617);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        RetournerButton retourner = new RetournerButton();
        retourner.setBounds(0, 0, 53, 50);
        frame.getContentPane().add(retourner);

        JLabel titreLabel = new JLabel("Choisir votre programme avant de combattre");
        titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titreLabel.setOpaque(true);
        titreLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        titreLabel.setBackground(new Color(255,0,0));
        titreLabel.setBounds(53,0,910,50);
        frame.getContentPane().add(titreLabel);

        for (int i = 0; i < 7; i++){
            CustomizedButton button = buttons[i];
            String branche = branches[i];
            String iconURL = "../img/" + branche + ".png";
            ImageIcon icon = new ImageIcon(getClass().getResource(iconURL));
            Image image = icon.getImage();
            Image newimg = image.getScaledInstance(60,60, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(newimg);

            button = new CustomizedButton(branche,icon);
            buttons[i] = button;
            button.setLocation(location[i][0],location[i][1]);
            frame.getContentPane().add(button);
        }

        continuerButton.setLocation(668,482);
        continuerButton.setBackground(new Color(150,224,240));
        frame.getContentPane().add(continuerButton);
        
        for (int i = 0; i < 7; i++){
            CustomizedButton button = buttons[i];
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i < 7; i++){
                        if (buttons[i] != button){
                            buttons[i].setBackground(null);
                        }
                    }
                }
            });
        }
        continuerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PageConfigurerSoldat page_configuration = new PageConfigurerSoldat();

                page_configuration.setVisible(true);
                frame.setVisible(false);
            }
        });
    }
}
