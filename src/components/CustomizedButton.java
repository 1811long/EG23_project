package components;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CustomizedButton extends JButton{
	
    public final Font FONT_DEFAULT = new Font("Purisa", Font.BOLD, 13);
    public final Color BACKGROUND_COLOR = new Color(164,200,225);
    
    public CustomizedButton(String text){
        setFont(FONT_DEFAULT);
        setBorder(new RoundBtn(15));
        setText(text);
        setBackground(BACKGROUND_COLOR);
        setSize(200,60);
    }
}


class RoundBtn implements Border
{
    private int r;
    RoundBtn(int r) {
        this.r = r;
    }
    public Insets getBorderInsets(Component c) {
        return new Insets(this.r+1, this.r+1, this.r+2, this.r);
    }
    public boolean isBorderOpaque() {
        return true;
    }
    public void paintBorder(Component c, Graphics g, int x, int y,
                            int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, r, r);
    }
}