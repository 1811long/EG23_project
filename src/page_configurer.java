import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

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
		frame.setBounds(100, 100, 701, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel titre = new JLabel("New label");
		titre.setBounds(0, 0, 687, 50);
		frame.getContentPane().add(titre);
		
		ImageIcon titre1 = new ImageIcon(page_accueil.class.getResource("/img/titre_configurer.png"));
		Image titre2 = titre1.getImage();
		Image titreModify = titre2.getScaledInstance(690,50,java.awt.Image.SCALE_SMOOTH);
		titre1 = new ImageIcon(titreModify);
		titre.setIcon(titre1);
		
		JLabel soldat1 = new JLabel("");
		
		ImageIcon soldat1_1 = new ImageIcon(page_accueil.class.getResource("/img/soldat1_configurer.png"));
		Image soldat1_2 = soldat1_1.getImage();
		Image soldat1Modify  = soldat1_2.getScaledInstance(600,80,java.awt.Image.SCALE_SMOOTH);
		soldat1_1 = new ImageIcon(soldat1Modify);
		soldat1.setIcon(soldat1_1);
		soldat1.setBounds(23, 60, 630, 95);
		frame.getContentPane().add(soldat1);
		
		JLabel soldat2 = new JLabel("");
		
		ImageIcon soldat2_1 = new ImageIcon(page_accueil.class.getResource("/img/soldat2_configurer.png"));
		Image soldat2_2 = soldat2_1.getImage();
		Image soldat2Modify  = soldat2_2.getScaledInstance(600,80,java.awt.Image.SCALE_SMOOTH);
		soldat2_1 = new ImageIcon(soldat2Modify);
		soldat2.setIcon(soldat2_1);
		
		
		soldat2.setBounds(23, 178, 600, 80);
		frame.getContentPane().add(soldat2);
		
		JLabel soldat3 = new JLabel("");
		
		ImageIcon soldat3_1 = new ImageIcon(page_accueil.class.getResource("/img/soldat3_configurer.png"));
		Image soldat3_2 = soldat3_1.getImage();
		Image soldat3Modify  = soldat3_2.getScaledInstance(600,80,java.awt.Image.SCALE_SMOOTH);
		soldat3_1 = new ImageIcon(soldat3Modify);
		soldat3.setIcon(soldat3_1);
		
		soldat3.setBounds(23, 284, 600, 80);
		frame.getContentPane().add(soldat3);
	}

}
