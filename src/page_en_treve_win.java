import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import components.RetournerButton;
import components.CustomizedLabel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class page_en_treve_win {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_en_treve_win window = new page_en_treve_win();
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
	public page_en_treve_win() {
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
		
		
		
		ImageIcon titre_en_treve_1 = new ImageIcon(page_en_treve_win.class.getResource("/img/titre_en_treve.png"));
		CustomizedLabel titre_en_treve= new CustomizedLabel(titre_en_treve_1, 120,100);
		titre_en_treve.setBounds(283, 28, 121, 66);
		frame.getContentPane().add(titre_en_treve);
		
		
		ImageIcon double_sword_1 = new ImageIcon(page_en_treve_win.class.getResource("/img/double_sword.png"));
		CustomizedLabel double_sword = new CustomizedLabel(double_sword_1, 50,50);
		double_sword.setBounds(315, 292, 60, 66);
		frame.getContentPane().add(double_sword);
		
		
		
		
		ImageIcon icon_tank_1 = new ImageIcon(page_accueil.class.getResource("/img/icon_tank.png"));
		CustomizedLabel icon_tank = new CustomizedLabel(icon_tank_1, 150, 150);
		icon_tank.setBounds(63, 28, 200, 200);
		frame.getContentPane().add(icon_tank);
		
		
		ImageIcon icon_tank_opponent_lose_1 = new ImageIcon(page_accueil.class.getResource("/img/icon_tank_opponent_lose.png"));
		
		
		
		ImageIcon team_win_1 = new ImageIcon(page_en_treve_win.class.getResource("/img/team_win.png"));
		CustomizedLabel team_win = new CustomizedLabel(team_win_1, 300, 250);
		team_win.setBounds(0, 196, 303, 292);
		frame.getContentPane().add(team_win);
		
		ImageIcon team_lose_1 = new ImageIcon(page_en_treve_win.class.getResource("/img/team_lose.png"));
		CustomizedLabel team_lose = new CustomizedLabel(team_lose_1, 300, 250);
		team_lose.setBounds(385, 196, 309, 292);
		frame.getContentPane().add(team_lose);
		
		CustomizedLabel icon_tank_opponent_lose = new CustomizedLabel(icon_tank_opponent_lose_1, 150, 150);
		icon_tank_opponent_lose.setBounds(474, 28, 182, 200);
		frame.getContentPane().add(icon_tank_opponent_lose);
		
		
		
		
		
	}
}
