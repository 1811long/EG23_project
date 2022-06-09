package pages;

import components.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PageOrganisationTroupe {

    private JFrame frame;
    private final Font FONT_DEFAULT_TITRE = new Font("Taroma", Font.BOLD, 20);

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PageOrganisationTroupe window =new PageOrganisationTroupe();
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
    public PageOrganisationTroupe() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 928, 699);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        RetournerButton retourner = new RetournerButton();
        retourner.setBounds(0, 0, 53, 50);

        JLabel titreLabel = new JLabel("Préparer votre troupe");

        titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titreLabel.setOpaque(true);
        titreLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        titreLabel.setBackground(new Color(255,0,0));
        titreLabel.setBounds(53,0,875,50);

        ImageLabel imageBiblio = new ImageLabel(new ImageIcon(getClass().getResource("../img/biblio_organiser.jpg")),300,600);
        imageBiblio.setBounds(60,100,500,500);

        ImageIcon imgSoldat = new ImageIcon(getClass().getResource("../img/soldat.png"));
        ImageIcon imgMaitreDeGuerre = new ImageIcon(getClass().getResource("../img/maitre_de_guerre.png"));
        ImageIcon imgSoldatElite = new ImageIcon(getClass().getResource("../img/soldat_elite.png"));

        JLabel label1 = new JLabel("Combattant dans la zone de combat");
        JLabel label2 = new JLabel("Combattant réservistes");

        label1.setFont(FONT_DEFAULT_TITRE);
        CombattantPanelDraggable soldat1 = new CombattantPanelDraggable("Soldat 1", imgSoldat);
        CombattantPanelDraggable MaitreDeGuerre = new CombattantPanelDraggable("Maitre De Guerre", imgMaitreDeGuerre);

        label1.setBounds(450,100,500,50);
        soldat1.setLocation(450,150);
        MaitreDeGuerre.setLocation(450,220);

        CombattantPanelDraggable soldat3 = new CombattantPanelDraggable("Soldat 3", imgSoldat);
        CombattantPanelDraggable soldat_elite2 = new CombattantPanelDraggable("Soldat d'elite 2", imgSoldatElite);
        CombattantPanelDraggable soldat4 = new CombattantPanelDraggable("Soldat 4", imgSoldat);

        label2.setFont(FONT_DEFAULT_TITRE);
        label2.setBounds(450,360,500,50);
        soldat3.setLocation(450,410);
        soldat_elite2.setLocation(450,480);
        soldat4.setLocation(450,550);

        frame.getContentPane().add(soldat1);
        frame.getContentPane().add(MaitreDeGuerre);

        frame.getContentPane().add(soldat3);
        frame.getContentPane().add(soldat4);
        frame.getContentPane().add(soldat_elite2);

        frame.getContentPane().add(label1);
        frame.getContentPane().add(label2);
        frame.add(imageBiblio);
        frame.add(retourner);
        frame.add(titreLabel);
    }
}
