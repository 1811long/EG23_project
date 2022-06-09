package components;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageLabel extends JLabel {

	public ImageLabel(ImageIcon icon, int width, int height) {
		Image icon_1 = icon.getImage();
		Image iconModify = icon_1.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(iconModify);
		setIcon(icon);
	}

}
