import components.CustomizedButton;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class page_accueil {

	private JFrame frame;

	private CustomizedButton jouerButton = new CustomizedButton("JOUER");
	private CustomizedButton parametrageButton = new CustomizedButton("PARAMETRAGE");
	private CustomizedButton aideButton = new CustomizedButton("AIDE");

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
		frame.setBounds(100, 100, 963, 617);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		jouerButton.setLocation(143,140);
		parametrageButton.setLocation(143,238);
		aideButton.setLocation(143,349);

		frame.getContentPane().add(jouerButton);
		frame.getContentPane().add(parametrageButton);
		frame.getContentPane().add(aideButton);

	}

}
