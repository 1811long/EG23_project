import components.ConfigurationPanel;

import java.awt.*;

import javax.swing.*;
import java.io.IOException;

public class main {

	private JFrame frame;

	private ConfigurationPanel[] panels = new ConfigurationPanel[]{
			new ConfigurationPanel("Force",new ImageIcon(getClass().getResource("img/force_sign.png"))),
			new ConfigurationPanel("Dextérité",new ImageIcon(getClass().getResource("img/dexterite_sign.png"))),
			new ConfigurationPanel("Résistance",new ImageIcon(getClass().getResource("img/resistance_sign.png"))),
			new ConfigurationPanel("Constitution",new ImageIcon(getClass().getResource("img/constitution_sign.png"))),
			new ConfigurationPanel("Initiative",new ImageIcon(getClass().getResource("img/initiative_sign.png"))),
	};

	JRadioButton offensifRadioButton = new JRadioButton("Defensif");
	JRadioButton aleatoireRadioButton = new JRadioButton("Aléatoire");
	JRadioButton defensifRadioButton = new JRadioButton("Offensif");

	private ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 553, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		int x = 120;
		int y = 10;
		for (int i = 0; i < 5; i++){
			ConfigurationPanel panel = panels[i];
			panel.setLocation(x,y);
			frame.getContentPane().add(panel);
			y += 60;
		}

		offensifRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		aleatoireRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		defensifRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));

		offensifRadioButton.setBounds(70,349,103,21);
		aleatoireRadioButton.setBounds(230,349,103,21);
		defensifRadioButton.setBounds(400,349,103,21);

		buttonGroup.add(offensifRadioButton);
		buttonGroup.add(aleatoireRadioButton);
		buttonGroup.add(defensifRadioButton);

		frame.getContentPane().add(offensifRadioButton);
		frame.getContentPane().add(aleatoireRadioButton);
		frame.getContentPane().add(defensifRadioButton);


	}
}
