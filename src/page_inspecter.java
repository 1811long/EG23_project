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
import components.CustomizedLabel;

public class page_inspecter {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_inspecter window = new page_inspecter();
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
	public page_inspecter() {
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
		retourner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		retourner.setBounds(0, 0, 53, 50);
		frame.getContentPane().add(retourner);
		
		
		
		
		
		ImageIcon titre1 = new ImageIcon(page_choisirZone.class.getResource("/img/titre_inspecter.png"));
		
		CustomizedLabel titre = new CustomizedLabel(titre1, 690, 50);
		titre.setBounds(0, 0, 687, 50);
		frame.getContentPane().add(titre);
		
		
		CustomizedButton butConfirmer = new CustomizedButton("Mouvements des troupes", 250 , 50 );
		butConfirmer.setSize(293, 50);
		ImageIcon sword_1 = new ImageIcon(page_accueil.class.getResource("/img/sword.png"));
		Image sword_2 = sword_1.getImage();
		Image swordModify  = sword_2.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		sword_1 = new ImageIcon(swordModify);
		butConfirmer.setIcon(sword_1);
		butConfirmer.setFont(new Font("Dialog", Font.BOLD, 13));
		butConfirmer.setForeground(new Color(0, 0, 0));
		butConfirmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		
	
		
		
		butConfirmer.setBackground(new Color(164, 200, 225));
		butConfirmer.setHorizontalAlignment(SwingConstants.LEFT);
		butConfirmer.setLocation(215, 410);
		frame.getContentPane().add(butConfirmer);
		
		ImageIcon BDE_1 = new ImageIcon(page_accueil.class.getResource("/img/BDE.png"));
		CustomizedButton BDE = new CustomizedButton(BDE_1, 70, 70);
		BDE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BDE.setBounds(165, 168, 103, 170);
		frame.getContentPane().add(BDE);
		
		
		ImageIcon quartier_1 = new ImageIcon(page_accueil.class.getResource("/img/quartier.png"));
		CustomizedButton quartier = new CustomizedButton(quartier_1, 70, 70);
		quartier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		quartier.setBounds(307, 168, 103, 170);
		frame.getContentPane().add(quartier);
		
		ImageIcon industrielle_1 = new ImageIcon(page_accueil.class.getResource("/img/industrielle.png"));
		CustomizedButton industrielle = new CustomizedButton(industrielle_1, 70, 70);
		industrielle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		industrielle.setBounds(441, 168, 103, 170);
		frame.getContentPane().add(industrielle);
		
		
		ImageIcon sportive_1 = new ImageIcon(page_accueil.class.getResource("/img/sportive.png"));
		CustomizedButton sportive = new CustomizedButton(sportive_1, 70, 70);
		
	
		sportive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sportive.setBounds(570, 168, 103, 170);
		frame.getContentPane().add(sportive);
		
		ImageIcon library_1 = new ImageIcon(page_accueil.class.getResource("/img/bibliotheque.png"));
		CustomizedButton library = new CustomizedButton(library_1, 70, 70);
		
	
		library.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		library.setBounds(21, 168, 103, 170);
		frame.getContentPane().add(library);
		
		
		ImageIcon en_guerre_1 = new ImageIcon(page_accueil.class.getResource("/img/en_guerre.png"));
		CustomizedLabel en_guerre = new CustomizedLabel(en_guerre_1, 200, 50);
		
		en_guerre.setBounds(230, 86, 226, 70);
		frame.getContentPane().add(en_guerre);
	}
}
