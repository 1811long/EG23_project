package components;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CustomizedLabel extends JLabel{
	public CustomizedLabel(ImageIcon icon, int x , int y ) {
		
		Image icon_1 = icon.getImage();
		Image iconModify  = icon_1.getScaledInstance(x,y,java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(iconModify);
		setIcon(icon);
		
		
	}

}
