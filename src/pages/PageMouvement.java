

import java.awt.*;
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
    private final Font FONT_DEFAULT = new Font("Taroma",Font.BOLD,15);

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
        frame.setBounds(100, 100, 1200, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);


        RetournerButton retourner = new RetournerButton();
        retourner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        retourner.setBounds(0, 0, 53, 50);
        frame.getContentPane().add(retourner);

        JLabel titreLabel = new JLabel("Faire votre mouvement des troupes");
        titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titreLabel.setOpaque(true);
        titreLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        titreLabel.setBackground(new Color(255,0,0));
        titreLabel.setBounds(53,0,1147,50);
        frame.getContentPane().add(titreLabel);

        ImageIcon imgZone = new ImageIcon(getClass().getResource("/img/zone_mouvement.png"));
        JLabel zoneBiblio = new JLabel();
        JLabel zoneBDE = new JLabel();
        JLabel zoneQuartier = new JLabel();
        JLabel zoneHalleIndustrielles = new JLabel();
        JLabel zoneHalleSportive = new JLabel();

        zoneBiblio.setIcon(imgZone);
        zoneBDE.setIcon(imgZone);
        zoneQuartier.setIcon(imgZone);
        zoneHalleIndustrielles.setIcon(imgZone);
        zoneHalleSportive.setIcon(imgZone);

        zoneBiblio.setBounds(100,100,180,250);
        zoneBDE.setBounds(300,100,180,250);
        zoneQuartier.setBounds(500,100,180,250);
        zoneHalleIndustrielles.setBounds(700,100,180,250);
        zoneHalleSportive.setBounds(900,100,180,250);

        ImageIcon imgSoldat = new ImageIcon(getClass().getResource("/img/soldat.png"));
        ImageIcon imgSoldatElite = new ImageIcon(getClass().getResource("/img/soldat_elite.png"));
        ImageIcon imgMaitreDeGuerre = new ImageIcon(getClass().getResource("/img/maitre_de_guerre.png"));

        PointDeViePanel soldat1 = new PointDeViePanel("Soldat 1", 60,imgSoldat);
        PointDeViePanel soldat3 = new PointDeViePanel("Soldat 3", 80, imgSoldat);
        PointDeViePanel soldat4 = new PointDeViePanel("Soldat 4", 0,imgSoldat);
        PointDeViePanel soldat5 = new PointDeViePanel("Soldat 5",0 ,imgSoldat);
        PointDeViePanel soldat8 = new PointDeViePanel("Soldat 6", 90, imgSoldat);
        PointDeViePanel soldat12 = new PointDeViePanel("Soldat 12", 95, imgSoldat);
        PointDeViePanel maitreDeGuerre = new PointDeViePanel("Maitre De Guerre", 100, imgMaitreDeGuerre);
        PointDeViePanel soldatElite = new PointDeViePanel("Soldat d'elite 1", 100, imgSoldatElite);

        soldat1.setLocation(100,110);
        soldat3.setLocation(100,180);
        soldat4.setLocation(300,110);
        soldat5.setLocation(500,180);
        soldat8.setLocation(500,110);
        soldat12.setLocation(500,180);
        maitreDeGuerre.setLocation(700,110);
        soldatElite.setLocation(900,110);

        JLabel titreBiblio = new JLabel("Bibliothèque");
        JLabel titreBDE = new JLabel("BDE");
        JLabel titreQuartier = new JLabel("Quartier Administratif");
        JLabel titreHalle = new JLabel("Halles Industrielles");
        JLabel titreSportive = new JLabel("Halle Sportive");

        titreBiblio.setFont(FONT_DEFAULT);
        titreBDE.setFont(FONT_DEFAULT);
        titreHalle.setFont(FONT_DEFAULT);
        titreSportive.setFont(FONT_DEFAULT);
        titreQuartier.setFont(FONT_DEFAULT);

        titreBiblio.setBounds(150,340,300,50);
        titreBiblio.setForeground(Color.RED);

        titreBDE.setBounds(370,340,300,50);
        titreBDE.setForeground(Color.RED);

        titreQuartier.setBounds(510,340,300,50);
        titreQuartier.setForeground(Color.RED);

        titreHalle.setBounds(725,340,300,50);
        titreHalle.setForeground(Color.RED);

        titreSportive.setBounds(940,340,300,50);
        titreSportive.setForeground(Color.RED);

        PointDeViePanel soldat2 = new PointDeViePanel("Soldat 2", 80, imgSoldat);
        PointDeViePanel soldatElite2 = new PointDeViePanel("Soldat d'elite 2", 100, imgSoldatElite);
        PointDeViePanel soldat15 = new PointDeViePanel("Soldat d'elite 3", 100, imgSoldat);
        PointDeViePanel soldatElite4 = new PointDeViePanel("Soldat d'elite 4", 100, imgSoldatElite);
        PointDeViePanel soldatElite5 = new PointDeViePanel("Soldat d'elite 5", 100, imgSoldatElite);

        soldat2.setLocation(100,450);
        soldatElite2.setLocation(320,450);
        soldat15.setLocation(540,450);

        soldatElite4.setLocation(180,550);
        soldatElite5.setLocation(400,550);

        ImageIcon sword_1 = new ImageIcon(getClass().getResource("/img/sword.png"));
        Image sword_2 = sword_1.getImage();
        Image swordModify  = sword_2.getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH);
        sword_1 = new ImageIcon(swordModify);

        CustomizedButton buttonLancer = new CustomizedButton("Lancer la prochaine mêlé", sword_1);
        buttonLancer.setSize(280,55);
        buttonLancer.setLocation(800, 530);

        frame.getContentPane().add(titreBiblio);
        frame.getContentPane().add(titreBDE);
        frame.getContentPane().add(titreQuartier);
        frame.getContentPane().add(titreHalle);
        frame.getContentPane().add(titreSportive);

        frame.getContentPane().add(soldat1);
        frame.getContentPane().add(soldat2);
        frame.getContentPane().add(soldatElite2);
        frame.getContentPane().add(soldat3);
        frame.getContentPane().add(soldat4);
        frame.getContentPane().add(soldat5);
        frame.getContentPane().add(soldat15);
        frame.getContentPane().add(soldatElite5);
        frame.getContentPane().add(soldatElite4);
        frame.getContentPane().add(soldat8);
        frame.getContentPane().add(soldat12);
        frame.getContentPane().add(maitreDeGuerre);
        frame.getContentPane().add(soldatElite);

        frame.getContentPane().add(zoneBiblio);
        frame.getContentPane().add(zoneBDE);
        frame.getContentPane().add(zoneQuartier);
        frame.getContentPane().add(zoneHalleIndustrielles);
        frame.getContentPane().add(zoneHalleSportive);
        frame.getContentPane().add(buttonLancer);

    }


}


