package pages;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import components.CustomizedButton;
import components.RetournerButton;
import components.ZonePanel;

public class PageEnCombat {

	private JFrame frame;
	private final Color COLOR_CONTROL = new Color(56,158,146);
	private final Color COLOR_PERDU = new Color(226,94,94);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageEnCombat window = new PageEnCombat();
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
	public PageEnCombat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 697, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		RetournerButton retourner = new RetournerButton();
		retourner.setBounds(0, 0, 53, 50);

		JLabel titreLabel = new JLabel("Choisir une zone pour inspecter");
		titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titreLabel.setOpaque(true);
		titreLabel.setFont(new Font("Tahoma",Font.BOLD,20));
		titreLabel.setBackground(new Color(255,0,0));
		titreLabel.setBounds(53,0,638,50);

		ImageIcon biblioImage = new ImageIcon(getClass().getResource("/img/bibliotheque.png"));
		ZonePanel biblioZone = new ZonePanel(biblioImage,"Bibliothèque");
		biblioZone.setBackgroundButton(COLOR_CONTROL);
		biblioZone.setLocation(26,140);

		ImageIcon bdeImage = new ImageIcon(getClass().getResource("/img/BDE.png"));
		ZonePanel bdeZone = new ZonePanel(bdeImage, "BDE");
		bdeZone.setLocation(156,140);
		bdeZone.setBackgroundButton(COLOR_PERDU);

		ImageIcon quartierImage = new ImageIcon(getClass().getResource("/img/quartier.png"));
		ZonePanel quartierZone = new ZonePanel(quartierImage,"Bibliothèque");
		quartierZone.setLocation(286,140);

		ImageIcon industrielleImage = new ImageIcon(getClass().getResource("/img/industrielle.png"));
		ZonePanel industriellePanel = new ZonePanel(industrielleImage,"Halle Industrielle");
		industriellePanel.setLocation(416,140);

		ImageIcon sportiveImage = new ImageIcon(getClass().getResource("/img/sportive.png"));
		ZonePanel sportivePanel = new ZonePanel(sportiveImage,"Halle Sportive");
		sportivePanel.setLocation(546,140);

		ImageIcon sword_1 = new ImageIcon(getClass().getResource("/img/sword.png"));
		Image sword_2 = sword_1.getImage();
		Image swordModify  = sword_2.getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH);
		sword_1 = new ImageIcon(swordModify);

		CustomizedButton butConfirmer = new CustomizedButton("Faire des mouvements des troupes", sword_1);
		butConfirmer.setSize(350,55);
		butConfirmer.setLocation(170, 432);

		frame.getContentPane().add(butConfirmer);
		frame.getContentPane().add(titreLabel);
		frame.getContentPane().add(retourner);
		frame.getContentPane().add(biblioZone);
		frame.getContentPane().add(bdeZone);
		frame.getContentPane().add(quartierZone);
		frame.getContentPane().add(industriellePanel);
		frame.getContentPane().add(sportivePanel);
	}

	public void setVisible(boolean b) {
		setVisible(b);
	}
}
