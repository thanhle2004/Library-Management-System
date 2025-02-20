package com.src.frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.src.auth.Login;



public class LoginPage extends JFrame {
    private JPanel Panel1;
    private JPanel LeftPanel;
    private JPanel RightPanel;
    private JLabel Background;
    private JPanel TopRightPanel;
    private JPanel BottomRightPanel;
    private JLabel UserIcon;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;


    public LoginPage() {
      
        setTitle("LOGIN");
        setPreferredSize(new Dimension(1000, 640));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
        pack();

        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
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
        LeftPanel.setLayout(null);

        Background = new JLabel();
        Background.setIcon(new ImageIcon(getClass().getResource("/com/res/LeftPanel.png")));
        Background.setBounds(0, 0, 710, 640);
        LeftPanel.add(Background);
        Panel1.add(LeftPanel);

        // Right Panel (for login form)
        RightPanel = new JPanel();
        RightPanel.setBackground(Color.WHITE);
        RightPanel.setBounds(710, 0, 290, 640);
        RightPanel.setLayout(null);
        Panel1.add(RightPanel);

        // Top Panel (Username & Icon)
        TopRightPanel = new JPanel();
        TopRightPanel.setBounds(-5, -5, 290, 320);
        RightPanel.add(TopRightPanel);

        UserIcon = new JLabel();
        UserIcon.setIcon(new ImageIcon(getClass().getResource("/com/res/TopRightPanel.png")));
        UserIcon.setBounds(0, 0, 290, 320);
        TopRightPanel.add(UserIcon);

        // Bottom Panel (Login Form)
        BottomRightPanel = new JPanel();
        BottomRightPanel.setBackground(Color.WHITE);
        BottomRightPanel.setBounds(0, 320, 290, 320);
        BottomRightPanel.setLayout(null);

        // Username Field
        usernameField = new JTextField(15);
        usernameField.setBounds(19, 10, 240, 45);
        usernameField.setBackground(new Color(220, 238, 229));
        usernameField.setForeground(new Color(5, 77, 120));
        usernameField.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(new Color(5, 77, 120)),
                new EmptyBorder(5, 10, 5, 10)
        ));
        BottomRightPanel.add(usernameField);

        // Password Field
        passwordField = new JPasswordField(15);
        passwordField.setBounds(19, 65, 240, 45);
        passwordField.setBackground(new Color(220, 238, 229));
        passwordField.setForeground(new Color(5, 77, 120));
        passwordField.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(new Color(5, 77, 120)),
                new EmptyBorder(5, 10, 5, 10)
        ));
        BottomRightPanel.add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(158, 120, 100, 30);
        loginButton.setBackground(new Color(220, 238, 229));
        loginButton.setForeground(new Color(5, 77, 120));
        loginButton.addActionListener(new ActionListener() {
            //Notification access successfully
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                if (login.login(usernameField,passwordField)) {
                    // parent.showPage("SearchPage");
                    new SearchPage();
                }
            }
        });

        BottomRightPanel.add(loginButton);
        RightPanel.add(BottomRightPanel);
    }

    //
    

    
}
