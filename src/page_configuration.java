import components.ConfigurationPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class page_configuration {
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
	private JLabel pointLabel = new JLabel("Point Restant = ");
	private JLabel valPointLabel = new JLabel("300");
	private JButton confirmerButton = new JButton("Confirmer");

	private Font FONT_DEFAULT = new Font("Tahoma", Font.PLAIN, 15);

	public page_configuration() throws IOException {
		initialize();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_configuration window = new page_configuration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
			panel.plusButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int value = Integer.parseInt(valPointLabel.getText());
					valPointLabel.setText(String.valueOf(value-1));
				}
			});
			panel.minusButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int value = Integer.parseInt(valPointLabel.getText());
					if (value < 300) valPointLabel.setText(String.valueOf(value+1));
				}
			});
			panel.setLocation(x,y);
			frame.getContentPane().add(panel);
			y += 60;
		}

		offensifRadioButton.setFont(FONT_DEFAULT);
		aleatoireRadioButton.setFont(FONT_DEFAULT);
		defensifRadioButton.setFont(FONT_DEFAULT);

		offensifRadioButton.setBounds(70,349,103,21);
		aleatoireRadioButton.setBounds(230,349,103,21);
		defensifRadioButton.setBounds(400,349,103,21);

		buttonGroup.add(offensifRadioButton);
		buttonGroup.add(aleatoireRadioButton);
		buttonGroup.add(defensifRadioButton);

		frame.getContentPane().add(offensifRadioButton);
		frame.getContentPane().add(aleatoireRadioButton);
		frame.getContentPane().add(defensifRadioButton);

		pointLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pointLabel.setBounds(10, 399, 135, 42);
		pointLabel.setFont(FONT_DEFAULT);
		frame.getContentPane().add(pointLabel);

		valPointLabel.setBounds(130,414,45,13);
		valPointLabel.setFont(FONT_DEFAULT);
		frame.getContentPane().add(valPointLabel);

		confirmerButton.setBounds(426, 404, 103, 32);
		confirmerButton.setFont(FONT_DEFAULT);
		confirmerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(confirmerButton);


	}
}
