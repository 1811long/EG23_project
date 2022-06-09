import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import components.CustomizedLabel;
import components.RetournerButton;

public class page_en_guerre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_en_guerre window = new page_en_guerre();
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
	public page_en_guerre() {
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
		
		
		
		ImageIcon titre_en_guerre_1 = new ImageIcon(page_en_treve_win.class.getResource("/img/titre_en_guerre.png"));
		CustomizedLabel titre_en_guerre= new CustomizedLabel(titre_en_guerre_1, 120,100);
		titre_en_guerre.setBounds(283, 28, 121, 66);
		frame.getContentPane().add(titre_en_guerre);
		
		
		ImageIcon double_sword_1 = new ImageIcon(page_en_treve_win.class.getResource("/img/double_sword.png"));
		CustomizedLabel double_sword = new CustomizedLabel(double_sword_1, 50,50);
		double_sword.setBounds(315, 292, 60, 66);
		frame.getContentPane().add(double_sword);
		
		
		
		
		ImageIcon icon_tank_1 = new ImageIcon(page_accueil.class.getResource("/img/icon_tank.png"));
		CustomizedLabel icon_tank = new CustomizedLabel(icon_tank_1, 150, 150);
		icon_tank.setBounds(63, 28, 200, 200);
		frame.getContentPane().add(icon_tank);
		
		
		ImageIcon icon_tank_opponent_1 = new ImageIcon(page_accueil.class.getResource("/img/icon_tank_opponent.png"));
		CustomizedLabel icon_tank_opponent = new CustomizedLabel(icon_tank_opponent_1, 150, 150);
		icon_tank_opponent.setBounds(474, 28, 182, 200);
		frame.getContentPane().add(icon_tank_opponent);
		
		
		ImageIcon team_fight_11 = new ImageIcon(page_en_treve_win.class.getResource("/img/team_fight_1.png"));
		CustomizedLabel team_fight_1 = new CustomizedLabel(team_fight_11, 300, 250);
		team_fight_1.setBounds(0, 196, 303, 292);
		frame.getContentPane().add(team_fight_1);
		
		ImageIcon team_fight_21 = new ImageIcon(page_en_treve_win.class.getResource("/img/team_fight_2.png"));
		CustomizedLabel team_fight_2 = new CustomizedLabel(team_fight_21, 300, 250);
		team_fight_2.setBounds(385, 196, 309, 292);
		frame.getContentPane().add(team_fight_2);
		
		
	}

}
