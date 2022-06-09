package pages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import components.RetournerButton;
import components.ImageLabel;

public class PageEnGuerre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageEnGuerre window = new PageEnGuerre();
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
	public PageEnGuerre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		RetournerButton retourner = new RetournerButton(); 
		retourner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		retourner.setBounds(0, 0, 53, 50);
		frame.getContentPane().add(retourner);

		JLabel titreLabel = new JLabel("En Guerre");
		titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titreLabel.setOpaque(true);
		titreLabel.setFont(new Font("Tahoma",Font.BOLD,20));
		titreLabel.setForeground(Color.white);
		titreLabel.setBackground(new Color(255,0,0));
		titreLabel.setBounds(53,0,640,50);
		frame.getContentPane().add(titreLabel);


		ImageIcon double_sword_1 = new ImageIcon(getClass().getResource("/img/double_sword.png"));
		ImageLabel double_sword = new ImageLabel(double_sword_1, 50,50);
		double_sword.setBounds(315, 292, 60, 66);
		frame.getContentPane().add(double_sword);
		

		ImageIcon icon_tank_1 = new ImageIcon(getClass().getResource("/img/icon_tank.png"));
		ImageLabel icon_tank = new ImageLabel(icon_tank_1, 150, 150);
		icon_tank.setBounds(63, 28, 200, 200);
		frame.getContentPane().add(icon_tank);
		
		
		ImageIcon icon_tank_opponent_lose_1 = new ImageIcon(getClass().getResource("/img/icon_tank_opponent_lose.png"));
		ImageIcon team_win_1 = new ImageIcon(getClass().getResource("/img/team_win.png"));
		ImageLabel team_win = new ImageLabel(team_win_1, 300, 250);
		team_win.setBounds(0, 250, 303, 292);
		frame.getContentPane().add(team_win);
		
		ImageIcon team_lose_1 = new ImageIcon(getClass().getResource("/img/team_lose.png"));
		ImageLabel team_lose = new ImageLabel(team_lose_1, 300, 250);
		team_lose.setBounds(385, 250, 309, 292);
		frame.getContentPane().add(team_lose);
		
		ImageLabel icon_tank_opponent_lose = new ImageLabel(icon_tank_opponent_lose_1, 150, 150);
		icon_tank_opponent_lose.setBounds(474, 28, 182, 200);
		frame.getContentPane().add(icon_tank_opponent_lose);

		JLabel isiLabel = new JLabel("ISI");
		isiLabel.setFont(new Font("Taroma",Font.BOLD, 30));
		isiLabel.setForeground(Color.BLUE);
		isiLabel.setBounds(130,220,300,50);

		JLabel giLabel = new JLabel("GI");
		giLabel.setFont(new Font("Taroma",Font.BOLD, 30));
		giLabel.setForeground(Color.BLUE);
		giLabel.setBounds(530,220,300,50);

		frame.getContentPane().add(isiLabel);
		frame.getContentPane().add(giLabel);
	}
}
