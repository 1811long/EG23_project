

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import components.CustomizedButton;
import components.PointDeViePanel;
import components.RetournerButton;
import javax.swing.JPanel;


public class PageMouvement {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PageMouvement window = new PageMouvement();
                    window.frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public PageMouvement() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);


        RetournerButton retourner = new RetournerButton();
        retourner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        JLabel titreLabel = new JLabel("Mouvement des troupes");
        titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titreLabel.setOpaque(true);
        titreLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        titreLabel.setBackground(new Color(255,0,0));
        titreLabel.setBounds(53,0,638,50);

        retourner.setBounds(0, 0, 53, 50);
        frame.getContentPane().add(retourner);

        ImageIcon zone = new ImageIcon(getClass().getResource("/img/zone_mouvement.png"));
        JLabel zoneLabel = new JLabel();
        zoneLabel.setIcon(zone);
        zoneLabel.setBounds(50,100,150,250);

        ImageIcon imgSoldat = new ImageIcon(getClass().getResource("../img/soldat.png"));
        ImageIcon imgSoldatElite = new ImageIcon(getClass().getResource("../img/soldat_elite.png"));
        ImageIcon imgMaitreDeGuerre = new ImageIcon(getClass().getResource("../img/maitre_de_guerre.png"));

        PointDeViePanel soldat1 = new PointDeViePanel("Soldat 1")

        frame.getContentPane().add(zoneLabel);
    }
}


