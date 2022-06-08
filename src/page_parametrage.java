import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import components.CustomizedButton;

public class page_parametrage {
    private JFrame frame;

    CustomizedButton[] buttons = new CustomizedButton[]{
            new CustomizedButton("ISI"),
            new CustomizedButton("RT"),
            new CustomizedButton("A2I"),
            new CustomizedButton("GM"),
            new CustomizedButton("GI"),
            new CustomizedButton("MTE"),
            new CustomizedButton("MM")
    };

    CustomizedButton continuerButton = new CustomizedButton("CONTINUER");

    int[][] location = new int[][]{
            {149,77},
            {507,77},
            {149,183},
            {507,183},
            {149,279},
            {507,279},
            {324,401}
    };

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    page_parametrage window = new page_parametrage();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public page_parametrage() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 963, 617);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        for (int i = 0; i < 7; i++){
            CustomizedButton button = buttons[i];
<<<<<<< HEAD
            String branche = branches[i];
            String iconURL = "img/" + branche + ".png";
            ImageIcon icon = new ImageIcon(getClass().getResource(iconURL));
            Image image = icon.getImage();
            Image newimg = image.getScaledInstance(60,60, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(newimg);
            button = new CustomizedButton(branche,icon);
=======
>>>>>>> 13725a7d5acefd99b7929dbd9996cbefc5195089
            button.setLocation(location[i][0],location[i][1]);
            frame.getContentPane().add(button);
        }

        continuerButton.setLocation(668,482);
        continuerButton.setBackground(new Color(150,224,240));

        frame.getContentPane().add(continuerButton);
        
        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 929, 54);
        frame.getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("New label");
        panel.add(lblNewLabel);
    }
}
