package components;

import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JButton;

public class RetournerButton extends JButton {
	public RetournerButton() {
		ImageIcon retourner_1 = new ImageIcon(CustomizedButton.class.getResource("/img/retourner.png"));
		Image retourner_2 = retourner_1.getImage();
		Image retournerModify  = retourner_2.getScaledInstance(60,60,java.awt.Image.SCALE_SMOOTH);
		retourner_1 = new ImageIcon(retournerModify);
		setIcon(retourner_1);
		
	}

}
