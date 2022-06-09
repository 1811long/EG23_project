package pages;

import components.CombattantPanel;
import components.CustomizedButton;
import components.RetournerButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PageConfigurerSoldat {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageConfigurerSoldat window = new PageConfigurerSoldat();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setVisible(boolean bool){
		frame.setVisible(bool);
	}
	/**
	 * Create the application.
	 */
	public PageConfigurerSoldat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 928, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		RetournerButton retourner = new RetournerButton();
		retourner.setBounds(0, 0, 53, 50);

		JLabel titreLabel = new JLabel("Choisir votre programme avant de combattre");
		titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titreLabel.setOpaque(true);
		titreLabel.setFont(new Font("Tahoma",Font.BOLD,20));
		titreLabel.setBackground(new Color(255,0,0));
		titreLabel.setBounds(53,0,910,50);

		JPanel mainPanel = new JPanel();

		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		for (int i = 0; i < 15; i++){
			ImageIcon soldat = new ImageIcon(getClass().getResource("/img/soldat.png"));
			int j = i + 1;
			CombattantPanel combattantPanel = new CombattantPanel("Soldat " + j, soldat);
			combattantPanel.setPreferredSize(new Dimension(2800,95));
			combattantPanel.setMaximumSize(combattantPanel.getPreferredSize());
			mainPanel.add(combattantPanel);
		}

		for (int i = 0; i < 4; i++){
			ImageIcon soldat_elite = new ImageIcon(getClass().getResource("/img/soldat_elite.png"));
			int j = i + 1;
			CombattantPanel combattantPanel = new CombattantPanel("Soldat Elite " + j, soldat_elite);
			combattantPanel.setPreferredSize(new Dimension(2800,95));
			combattantPanel.setMaximumSize(combattantPanel.getPreferredSize());
			mainPanel.add(combattantPanel);
		}

		CombattantPanel maitreDeGuerre = new CombattantPanel("Maitre de Guerre", new ImageIcon(getClass().getResource("/img/maitre_de_guerre.png")));
		maitreDeGuerre.setPreferredSize(new Dimension(2800,95));
		maitreDeGuerre.setMaximumSize(maitreDeGuerre.getPreferredSize());
		mainPanel.add(maitreDeGuerre);

		JScrollPane scrollPane = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(148, 72, 660, 500);

		CustomizedButton chargerButton = new CustomizedButton("Charger Vos Troupes");
		chargerButton.setBounds(350,600,250,50);
		frame.getContentPane().add(retourner);

		frame.getContentPane().add(titreLabel);
		frame.getContentPane().add(chargerButton);
		frame.getContentPane().add(scrollPane);
	}
}
