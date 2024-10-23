package UI;

// import java.awt.BorderLayout;
// import java.awt.Component;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JTextArea;
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
        Panel mainPanel = new Panel(true);
        Panel otherPanel = new Panel(/*3, 3, 4, 4*/);

        Button button1 = new Button("balls", 15, 10, 100, 20);
        // Dropdown dropdown = new Dropdown({"a", "b", "c"});
        TextInput input1 = new TextInput("", 24);
        Button button2 = new Button("balls", 15, 10, 100, 20);
        Button button3 = new Button("balls", 15, 10, 100, 20);
        Button button4 = new Button("balls", 15, 10, 100, 20);

        // int[] gridx = {0, 1};
        // Component items = {button1, input1};

        otherPanel.addItem(0, 0, button1);
        otherPanel.addItem(0, 1, input1);
        otherPanel.addItem(1, 0, button2);


        mainPanel.addItem(otherPanel);
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