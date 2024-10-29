package UI.Windows;

import UI.Parts.*;
import java.awt.Component;
import javax.swing.GroupLayout;

public class HomePage {
    public static void main(String[] args) {
        Window homeWindow = new Window("Home", 500, 500);
        homeWindow.setVisible(true);
        MainPanel mainPanel = new MainPanel(true);
        GroupLayoutPanel groupPanel = new GroupLayoutPanel();

        Button button1 = new Button("Test", 15, 10, 225, 75);
        TextInput input1 = new TextInput("", 12);
        Button button2 = new Button("Test", 15, 10, 225, 75);
        Button button3 = new Button("Test", 15, 10, 225, 75);

        String options[] = {"Test1", "Test2", "Test3"};
        Dropdown dropdown = new Dropdown(options);

        Component items1[] = {button1, button2, dropdown};
        Component items2[] = {input1, button3};

        Component items3[] = {button1, input1};
        Component items4[] = {button2, button3};

        groupPanel.addHorizontalParallelGroup(items1, GroupLayout.Alignment.LEADING);
        groupPanel.addHorizontalParallelGroup(items2, GroupLayout.Alignment.LEADING);

        groupPanel.addVerticalParallelGroup(items3, GroupLayout.Alignment.LEADING);
        groupPanel.addVerticalParallelGroup(items4, GroupLayout.Alignment.LEADING);
        groupPanel.addVerticalItem(dropdown);
        groupPanel.finish();

        ScrollPanel scrollPanel = new ScrollPanel(groupPanel);

        mainPanel.addItem(scrollPanel);
        homeWindow.setContentPanel(mainPanel);

        mainPanel.addItem(scrollPanel);
        homeWindow.setContentPanel(mainPanel);
        homeWindow.setVisible(true);
    }
}
