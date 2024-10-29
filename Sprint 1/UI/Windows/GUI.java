package UI.Windows;

import UI.Parts.*;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.UIManager;

public class GUI{

    public static void main(String args[]){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e){
            return;
        }

        Window window = new Window("Test", 0, 0, 0, 0);
        MainPanel mainPanel = new MainPanel(true);
        GroupLayoutPanel otherPanel = new GroupLayoutPanel();

        Button button1 = new Button("test", 15, 10, 115, 20);
        TextInput input1 = new TextInput("", 12);
        Button button2 = new Button("test", 15, 10, 115, 20);
        Button button3 = new Button("test", 15, 10, 115, 20);
        // Button button4 = new Button("test", 15, 10, 115, 20);

        String options[] = {"Test1", "Test2", "Test3"};
        Dropdown dropdown = new Dropdown(options);

        // int[] gridx = {0, 1};
        Component items1[] = {button1, button2, dropdown};
        Component items2[] = {input1, button3};

        Component items3[] = {button1, input1};
        Component items4[] = {button2, button3};

        otherPanel.addHorizontalParallelGroup(items1, GroupLayout.Alignment.LEADING);
        otherPanel.addHorizontalParallelGroup(items2, GroupLayout.Alignment.LEADING);

        otherPanel.addVerticalParallelGroup(items3, GroupLayout.Alignment.LEADING);
        otherPanel.addVerticalParallelGroup(items4, GroupLayout.Alignment.LEADING);
        otherPanel.addVerticalItem(dropdown);
        otherPanel.finish();

        ScrollPanel scrollPanel = new ScrollPanel(otherPanel);

        mainPanel.addItem(scrollPanel);
        window.setContentPanel(mainPanel);
        window.setVisible(true);

        // button.addActionListener(new ActionListener() {

        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         textArea.append("Button was clicked\n");

        //     }
        // });
    }

}