import components.CustomizedButton;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class page_accueil {

	private JFrame frame;

	private CustomizedButton jouerButton = new CustomizedButton("JOUER");
	private CustomizedButton parametrageButton = new CustomizedButton("PARAMETRAGE");
	private CustomizedButton aideButton = new CustomizedButton("AIDE");
	private final JLabel background = new JLabel("");
	private final JLabel samurai = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_accueil window = new page_accueil();
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
	public page_accueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 807, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		jouerButton.setLocation(143,140);
		parametrageButton.setLocation(143,238);
		aideButton.setLocation(143,349);

		frame.getContentPane().add(jouerButton);
		frame.getContentPane().add(parametrageButton);
		frame.getContentPane().add(aideButton);
		
		
		samurai.setHorizontalAlignment(SwingConstants.CENTER);
		
		ImageIcon samurai1 = new ImageIcon(page_accueil.class.getResource("/img/samurai.png"));
		Image samurai2 = samurai1.getImage();
		Image samuraiModify = samurai2.getScaledInstance(400,400,java.awt.Image.SCALE_SMOOTH);
		samurai1 = new ImageIcon(samuraiModify);
		
		samurai.setIcon(samurai1);
		samurai.setBounds(129, 33, 586, 452);
		
		frame.getContentPane().add(samurai);
		
		ImageIcon background1 = new ImageIcon(page_accueil.class.getResource("/img/background.jpeg"));
		Image background2 = background1.getImage();
		Image backgroundModify = background2.getScaledInstance(800,800,java.awt.Image.SCALE_SMOOTH);
		background1 = new ImageIcon(backgroundModify);
		background.setIcon(background1);
		background.setBounds(0, -16, 917, 560);
		
		frame.getContentPane().add(background);

	}

}
