import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import components.CustomizedButton;
import components.CustomizedLabel;
import components.RetournerButton;
import javax.swing.JLabel;

public class page_vainqueur {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_vainqueur window = new page_vainqueur();
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
	public page_vainqueur() {
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
		
		
		
		
		ImageIcon icon_firework1_1 = new ImageIcon(page_vainqueur.class.getResource("/img/icon_firework1.png"));
		CustomizedLabel icon_firework1 = new CustomizedLabel(icon_firework1_1, 80,80 );
		icon_firework1.setBounds(67, 28, 119, 95);
		frame.getContentPane().add(icon_firework1);
		
		
		
		
		ImageIcon icon_firework2_1 = new ImageIcon(page_vainqueur.class.getResource("/img/icon_firework2.png"));
		CustomizedLabel icon_firework2 = new CustomizedLabel(icon_firework2_1, 80,80 );
		icon_firework2.setBounds(527, 10, 119, 110);
		frame.getContentPane().add(icon_firework2);
		
		
		ImageIcon icon_cup_1 = new ImageIcon(page_vainqueur.class.getResource("/img/icon_cup.png"));
		CustomizedLabel icon_cup = new CustomizedLabel(icon_cup_1, 40,50 );
		icon_cup.setBounds(487, 48, 45, 75);
		frame.getContentPane().add(icon_cup);
		
		
		RetournerButton retourner = new RetournerButton(); 
		retourner.setBounds(0, 0, 53, 50);
		frame.getContentPane().add(retourner);
		retourner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		ImageIcon titre_vainqueur_1 = new ImageIcon(page_vainqueur.class.getResource("/img/titre_vainqueur.png"));
		CustomizedLabel titre_vainqueur = new CustomizedLabel(titre_vainqueur_1, 300,50);
		
		titre_vainqueur.setBounds(167, 63, 300, 50);
		frame.getContentPane().add(titre_vainqueur);
		
		
		
		
		
		


		
		
		
		
		
		CustomizedButton butConfirmer = new CustomizedButton("Combattre", 150 , 50 );
		butConfirmer.setText("Retour à l'accueil");
		butConfirmer.setSize(213, 50);
		
		ImageIcon icon_accueil = new ImageIcon(page_accueil.class.getResource("/img/icon_accueil.png"));
		Image icon_accueil_1 = icon_accueil.getImage();
		Image iconModify  = icon_accueil_1.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		icon_accueil = new ImageIcon(iconModify);
		butConfirmer.setIcon(icon_accueil);
		butConfirmer.setFont(new Font("Dialog", Font.BOLD, 13));
		butConfirmer.setForeground(new Color(0, 0, 0));
		butConfirmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		butConfirmer.setLocation(244, 432);
		frame.getContentPane().add(butConfirmer);
		
		
		ImageIcon BDE_1 = new ImageIcon(page_accueil.class.getResource("/img/BDE.png"));
		CustomizedButton BDE = new CustomizedButton(BDE_1, 70, 70);
		BDE.setBackground(new Color(255, 0, 0));
		BDE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BDE.setBounds(167, 177, 103, 170);
		frame.getContentPane().add(BDE);
		
		
		ImageIcon quartier_1 = new ImageIcon(page_accueil.class.getResource("/img/quartier.png"));
		CustomizedButton quartier = new CustomizedButton(quartier_1, 70, 70);
		quartier.setBackground(new Color(95, 158, 160));
		quartier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		quartier.setBounds(306, 177, 103, 170);
		frame.getContentPane().add(quartier);
		
		ImageIcon industrielle_1 = new ImageIcon(page_accueil.class.getResource("/img/industrielle.png"));
		CustomizedButton industrielle = new CustomizedButton(industrielle_1, 70, 70);
		industrielle.setBackground(new Color(255, 0, 0));
		industrielle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		industrielle.setBounds(445, 177, 103, 170);
		frame.getContentPane().add(industrielle);
		
		
		ImageIcon sportive_1 = new ImageIcon(page_accueil.class.getResource("/img/sportive.png"));
		CustomizedButton sportive = new CustomizedButton(sportive_1, 70, 70);
		sportive.setBackground(new Color(95, 158, 160));
		
	
		sportive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sportive.setBounds(570, 177, 103, 170);
		frame.getContentPane().add(sportive);
		
		ImageIcon library_1 = new ImageIcon(page_accueil.class.getResource("/img/bibliotheque.png"));
		CustomizedButton library = new CustomizedButton(library_1, 70, 70);
		library.setBackground(new Color(95, 158, 160));
		
	
		library.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		library.setBounds(31, 177, 103, 170);
		frame.getContentPane().add(library);
	}

}
