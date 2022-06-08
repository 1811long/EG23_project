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
		
		JLabel titre = new JLabel("");
		titre.setBounds(0, 0, 687, 50);
		
		
		ImageIcon titre1 = new ImageIcon(page_choisirZone.class.getResource("/img/titre_inspecter.png"));
		Image titre2 = titre1.getImage();
		Image titreModify = titre2.getScaledInstance(690,50,java.awt.Image.SCALE_SMOOTH);
		titre1 = new ImageIcon(titreModify);
		titre.setIcon(titre1);
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
		
		JButton BDE = new JButton("");
		BDE.setBackground(Color.RED);
		ImageIcon BDE_1 = new ImageIcon(page_accueil.class.getResource("/img/BDE.png"));
		Image BDE_2 = BDE_1.getImage();
		Image BDEModify  = BDE_2.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
		BDE_1 = new ImageIcon(BDEModify);
		BDE.setIcon(BDE_1);
		
	
		BDE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BDE.setBounds(166, 175, 103, 170);
		frame.getContentPane().add(BDE);
		
		JButton quartier = new JButton("");
		ImageIcon quartier_1 = new ImageIcon(page_accueil.class.getResource("/img/quartier.png"));
		Image quartier_2 = quartier_1.getImage();
		Image quartierModify  = quartier_2.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
		quartier_1 = new ImageIcon(quartierModify);
		quartier.setIcon(quartier_1);
		
	
		quartier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		quartier.setBounds(306, 175, 103, 170);
		frame.getContentPane().add(quartier);
		
		JButton industrielle = new JButton("");
		ImageIcon industrielle_1 = new ImageIcon(page_accueil.class.getResource("/img/industrielle.png"));
		Image industrielle_2 = industrielle_1.getImage();
		Image industrielleModify  = industrielle_2.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
		industrielle_1 = new ImageIcon(industrielleModify);
		industrielle.setIcon(industrielle_1);
		
	
		industrielle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		industrielle.setBounds(445, 175, 103, 170);
		frame.getContentPane().add(industrielle);
		
		JButton sportive = new JButton("");
		ImageIcon sportive_1 = new ImageIcon(page_accueil.class.getResource("/img/sportive.png"));
		Image sportive_2 = sportive_1.getImage();
		Image sportiveModify  = sportive_2.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
		sportive_1 = new ImageIcon(sportiveModify);
		sportive.setIcon(sportive_1);
		
	
		sportive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sportive.setBounds(558, 175, 103, 170);
		frame.getContentPane().add(sportive);
		
		JButton library = new JButton("");
		library.setBackground(new Color(50, 205, 50));
		
		ImageIcon library_1 = new ImageIcon(page_accueil.class.getResource("/img/bibliotheque.png"));
		Image library_2 = library_1.getImage();
		Image libraryModify  = library_2.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
		library_1 = new ImageIcon(libraryModify);
		library.setIcon(library_1);
		
	
		library.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		library.setBounds(32, 175, 103, 170);
		frame.getContentPane().add(library);
		
		JLabel en_guerre = new JLabel("");
		
		ImageIcon en_guerre_1 = new ImageIcon(page_accueil.class.getResource("/img/en_guerre.png"));
		Image en_guerre_2 = en_guerre_1.getImage();
		Image en_guerreModify  = en_guerre_2.getScaledInstance(200,50,java.awt.Image.SCALE_SMOOTH);
		en_guerre_1 = new ImageIcon(en_guerreModify);
		en_guerre.setIcon(en_guerre_1);
		
		en_guerre.setBounds(230, 86, 226, 70);
		frame.getContentPane().add(en_guerre);
	}
}
