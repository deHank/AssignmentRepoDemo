package UI;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;

public class Panel extends JPanel{
    GridBagConstraints gbc = null;

    public Panel(boolean isYAxis){ //For main panel
        super();
        if(isYAxis){super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));}
        else{super.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));}
    }

    
    public Panel(int rows, int cols, int hgap, int vgap){ //for panels taht need a grid based layout
        super(new GridLayout(rows, cols, hgap, vgap));
    }

    public Panel(){
        super();
        super.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridwidth = 0;
        gbc.gridheight = 1;
    }

    public void addItem(Component comp){
        super.add(comp);
        super.validate();
    }

    public void addItem(int gridx, int gridy, Component comp){
        if(gbc != null){
            System.out.println("oihsohsf");
            gbc.gridx = gridx;
            gbc.gridy = gridy;
        }
        this.addItem(comp);
    }
}
