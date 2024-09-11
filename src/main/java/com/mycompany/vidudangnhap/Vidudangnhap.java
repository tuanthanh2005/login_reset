/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vidudangnhap;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class Vidudangnhap extends JFrame {
private  JLabel lbUser, lbPass;
private JTextField txtUser;
private JPasswordField txtPass;
private JButton btLogin ,btReset;
public Vidudangnhap(String title){
 
super(title);
createGUI();
    setSize(300,200);
 setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
   
}

    private void createGUI() {
        JPanel p = new JPanel();
       
        p.setLayout(new GridLayout(3,2,10,10));
        p.add(lbUser=new JLabel("Name"));
        p.add(txtUser=new JTextField(10));
        p.add(lbPass=new JLabel("Password"));
        p.add(txtPass=new JPasswordField(10));
        p.add(btLogin=new JButton("Login"));
        p.add(btReset=new JButton("Reset"));
        
        
        btLogin.setIcon(new ImageIcon(this.getClass().getResource("/aaa.png")));
        
        btReset.setIcon(new ImageIcon(this.getClass().getResource("/reset.png")));
        
        
        
        
        
//        lbUser.setBounds(10,10,100,40);
//        txtUser.setBounds(120, 10, 150, 40);
//        
//        lbPass.setBounds(10,60,100,40);
//        txtPass.setBounds(120, 60, 150, 40);
//      
//        lbUser.setBounds(10,110,100,40);
//        txtUser.setBounds(120, 110, 100, 40);

        add(p);
      btLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user =txtUser.getText();
                String pass = txtPass.getText();
                if (user.equals("admin")||pass.equals("admin")) {
                    JOptionPane.showMessageDialog(null,"Dang Nhap Thanh Cong" );
                    
                } else {
                    JOptionPane.showMessageDialog(null," That Bai" );
                }
            }
      });
        
         btReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               txtUser.setText("");
               txtPass.setText("");
               txtUser.requestFocus();
            }
      });
        
        
        
        
        
        
        
        
    }
    public static void main(String[] args) {
        Vidudangnhap frm = new Vidudangnhap("Login system");
        frm.setVisible(true);
    }
}
