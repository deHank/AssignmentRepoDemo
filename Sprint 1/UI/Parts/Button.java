package UI.Parts;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class Button extends JButton{
    int width;
    int height;
    int x;
    int y;
    String text;

    public Button(String text, int x, int y, int width, int height){
        super(text);
        super.setBounds(x, y, width, height);
        
        this.setDimensions(width, height);
        this.text = text;
        this.x = x;
        this.y = y;
    }

    public void setDimensions(int width, int height){
        super.setMinimumSize(new Dimension(width, height));
        super.setPreferredSize(new Dimension(width, height));
        super.setMaximumSize(new Dimension(width, height));
    }

    public void setOnClick(ActionListener action){
        super.addActionListener(action);
    }
}
