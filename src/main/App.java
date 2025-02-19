package main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        new LoginPage();
    }
}

class LoginPage extends JFrame {
    private JPanel Panel1;
    private JPanel LeftPanel;
    private JPanel RightPanel;
    private JLabel Background;
    private JPanel TopRightPanel;
    private JPanel BottomRightPanel;
    private JLabel UserIcon;
    private JPasswordField passwordField1;
    private JButton button1;

    public LoginPage() {
        setTitle("LOGIN");
        setPreferredSize(new Dimension(1000, 640));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
        pack();

        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        // Main Panel
        Panel1 = new JPanel();
        Panel1.setBackground(Color.WHITE);
        Panel1.setPreferredSize(new Dimension(1050, 640));
        Panel1.setLayout(null);
        add(Panel1);

        // Left Panel (for Background Image)
        LeftPanel = new JPanel();
        LeftPanel.setBackground(Color.WHITE);
        LeftPanel.setBounds(0, 0, 710, 640);
        LeftPanel.setLayout(null); // Allow manual placement of background image

        Background = new JLabel();
        Background.setIcon(new ImageIcon(getClass().getResource("/LeftPanel.png")));
        Background.setBounds(0, 0, 710, 640);
        LeftPanel.add(Background);

        Panel1.add(LeftPanel);

        // Right Panel (for login form)
        RightPanel = new JPanel();
        RightPanel.setBackground(Color.WHITE);
        RightPanel.setBounds(710, 0, 290, 640);
        RightPanel.setLayout(null);

        // Top Panel (Username & Icon)
        TopRightPanel = new JPanel();
        TopRightPanel.setBounds(-5, -5, 290, 320);
        RightPanel.add(TopRightPanel);
        UserIcon = new JLabel();
        UserIcon.setIcon(new ImageIcon(getClass().getResource("/TopRightPanel.png")));
        UserIcon.setBounds(0, 0, 290, 320);
        TopRightPanel.add(UserIcon);

        BottomRightPanel = new JPanel();
        BottomRightPanel.setBackground(Color.WHITE);
        BottomRightPanel.setBounds(0, 320, 290, 320);
        BottomRightPanel.setLayout(null); // Tắt layout quản lý tự động

        passwordField1 = new JPasswordField(15);
        button1 = new JButton("Login");

        passwordField1.setBounds(19, 10, 240, 45);
        passwordField1.setBackground(new Color(220, 238, 229));
        passwordField1.setForeground(new Color(5, 77, 120));
        passwordField1.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(new Color(5, 77, 120)),
                new EmptyBorder(5, 10, 5, 10)
        ));

        button1.setBounds(158, 70, 100, 30);
        button1.setBackground(new Color(220, 238, 229));
        button1.setForeground(new Color(5, 77, 120));

        BottomRightPanel.add(passwordField1);
        BottomRightPanel.add(button1);
        RightPanel.add(BottomRightPanel);


        Panel1.add(RightPanel);

    }
}

