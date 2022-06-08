import java.awt.Color;
import java.awt.EventQueue;
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
import java.awt.Font;

public class page_configurer {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_configurer window = new page_configurer();
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
	public page_configurer() {
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
		
		JButton butConfigurer = new JButton("");
		
		
		ImageIcon butConfigurer_1 = new ImageIcon(page_accueil.class.getResource("/img/configurerButton.png"));
		Image butConfigurer_2 = butConfigurer_1.getImage();
		Image butConfigurerModify  = butConfigurer_2.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH);
		butConfigurer_1 = new ImageIcon(butConfigurerModify);
		butConfigurer.setIcon(butConfigurer_1);
		butConfigurer.setBounds(550, 77, 62, 59);
		
		frame.getContentPane().add(butConfigurer);
		
		JButton butConfigurer_3 = new JButton("");
		butConfigurer_3.setBounds(550, 189, 62, 59);
		butConfigurer_3.setIcon(butConfigurer_1);
		frame.getContentPane().add(butConfigurer_3);
		
		JButton butConfigurer_3_1 = new JButton("");
		butConfigurer_3_1.setBounds(550, 292, 62, 59);
		butConfigurer_3_1.setIcon(butConfigurer_1);
		frame.getContentPane().add(butConfigurer_3_1);
		
		
		JLabel titre = new JLabel("");
		titre.setBounds(0, 0, 687, 50);
		frame.getContentPane().add(titre);
		
		ImageIcon titre1 = new ImageIcon(page_accueil.class.getResource("/img/titre_configurer.png"));
		Image titre2 = titre1.getImage();
		Image titreModify = titre2.getScaledInstance(690,50,java.awt.Image.SCALE_SMOOTH);
		titre1 = new ImageIcon(titreModify);
		titre.setIcon(titre1);
		
		
		
		ImageIcon soldat1_1 = new ImageIcon(page_accueil.class.getResource("/img/soldat1_configurer.png"));
		
		CustomizedLabel soldat1 = new CustomizedLabel(soldat1_1, 600 , 80);
		
		soldat1.setBounds(23, 60, 630, 95);
		frame.getContentPane().add(soldat1);
		
		
		
		ImageIcon soldat2_1 = new ImageIcon(page_accueil.class.getResource("/img/soldat2_configurer.png"));
		
		CustomizedLabel soldat2 = new CustomizedLabel(soldat2_1, 600 , 80);
		
		
		soldat2.setBounds(23, 178, 600, 80);
		frame.getContentPane().add(soldat2);
		
		ImageIcon soldat3_1 = new ImageIcon(page_accueil.class.getResource("/img/soldat3_configurer.png"));
		
		CustomizedLabel soldat3 = new CustomizedLabel(soldat3_1, 600 , 80);
		
		soldat3.setBounds(23, 284, 600, 80);
		frame.getContentPane().add(soldat3);
		
		CustomizedButton butConfirmer = new CustomizedButton("Confirmer", 150 , 50 );
		butConfirmer.setSize(187, 50);
		
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
		butConfirmer.setLocation(244, 422);
		frame.getContentPane().add(butConfirmer);
		
		
		
		
	}
}
