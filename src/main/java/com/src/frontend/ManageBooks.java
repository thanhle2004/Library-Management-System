package com.src.frontend;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

import com.src.frontend.LoginPage.RoundedButton;


public class ManageBooks extends JFrame{
    private JPanel MainPanel;
    private JPanel NavigationPanel;

    private JLabel IconUser;
    private JLabel Rewind;

    private JButton rewindButton;
    private JButton addButton;
    private JButton deleteButton;
    private JButton updateButton;




    public ManageBooks(){
        setPreferredSize(new Dimension(1000, 640));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
        pack();

         initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }



    private void initComponents(){

        Color DarkColor = new Color(5, 77, 120);
        Color LightColor = new Color(220,238,229);
        int heightButton = 45;

         // Main Panel
         MainPanel = new JPanel();
         MainPanel.setBackground(Color.WHITE);
         MainPanel.setPreferredSize(new Dimension(1050, 640));
         MainPanel.setLayout(null);
         add(MainPanel);

        NavigationPanel = new JPanel();
        NavigationPanel.setBackground(new Color(5, 77, 120));
        NavigationPanel.setBounds(0,0,200,640);
        NavigationPanel.setLayout(null);
        MainPanel.add(NavigationPanel);

        //rewindButton
        rewindButton = new RoundedButton("Back");
        rewindButton.setBounds(-1, 10, 100, 30);
        rewindButton.setBackground(new Color(47, 120, 152));
        rewindButton.setForeground(new Color(220, 238, 229));
        rewindButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        rewindButton.setFocusPainted(false);
        rewindButton.setBorder(null);
        NavigationPanel.add(rewindButton);

        rewindButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPage();
                setVisible(false);
            }
        });

        ImageIcon Rewind = new ImageIcon(getClass().getResource("/com/res/Rewind.png"));
        Image scaledImageRewind = Rewind.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Rewind = new JLabel(new ImageIcon(scaledImageRewind));


        NavigationPanel.add(rewindButton);
        
    } 




    class RoundedButton extends JButton {
        private int radius = 10;
        private Color normalColor = new Color(220, 238, 229);
        private Color hoverColor = new Color(0, 0, 0, 50);
        private Color borderColor = new Color(5, 77, 120);

        public RoundedButton(String text) {
            super(text);
            setOpaque(false);
            setFocusPainted(false);
            setContentAreaFilled(false);
            setBorderPainted(false);

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    setBackground(hoverColor);
                    repaint();
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    setBackground(normalColor);
                    repaint();
                }
            });
        }
    }
}
