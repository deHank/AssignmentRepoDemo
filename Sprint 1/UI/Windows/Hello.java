package UI.Windows;
import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class Hello {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(690, 372);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JButton element2 = new JButton("Click Me");
     element2.setBounds(233, 224, 106, 29);
     element2.setBackground(Color.decode("#bca8e4"));
     element2.setForeground(Color.decode("#000"));
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element2.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element2.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element2, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element2);

     frame.add(panel);
     frame.setVisible(true);

  }
}