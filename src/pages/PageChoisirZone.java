package pages;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import components.CustomizedButton;
import components.RetournerButton;
import components.ImageLabel;
import components.ZonePanel;

public class PageChoisirZone {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageChoisirZone window = new PageChoisirZone();
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
	public PageChoisirZone() {
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
		retourner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PageConfigurerSoldat pageConfigurerSoldat = new PageConfigurerSoldat();
				pageConfigurerSoldat.setVisible(true);
				frame.setVisible(false);
			}
		});

		JLabel titreLabel = new JLabel("Choisir une zone pour organiser votre troupe");
		titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titreLabel.setOpaque(true);
		titreLabel.setFont(new Font("Tahoma",Font.BOLD,20));
		titreLabel.setBackground(new Color(255,0,0));
		titreLabel.setBounds(53,0,638,50);

		ImageIcon biblioImage = new ImageIcon(getClass().getResource("/img/bibliotheque.png"));
		ZonePanel biblioZone = new ZonePanel(biblioImage,"Bibliothèque");
		biblioZone.setLocation(26,140);

		ImageIcon bdeImage = new ImageIcon(getClass().getResource("/img/BDE.png"));
		ZonePanel bdeZone = new ZonePanel(bdeImage, "BDE");
		bdeZone.setLocation(156,140);

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

		CustomizedButton buttonLancer = new CustomizedButton("Lancer un combat", sword_1);
		buttonLancer.setSize(250,55);
		buttonLancer.setLocation(230, 432);
		buttonLancer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PageEnCombat pageEnCombat = new PageEnCombat();
				pageEnCombat.setVisible(true);
				frame.setVisible(false);
			}
		});

		frame.getContentPane().add(buttonLancer);
		frame.getContentPane().add(titreLabel);
		frame.getContentPane().add(retourner);
		frame.getContentPane().add(biblioZone);
		frame.getContentPane().add(bdeZone);
		frame.getContentPane().add(quartierZone);
		frame.getContentPane().add(industriellePanel);
		frame.getContentPane().add(sportivePanel);

	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}
}
