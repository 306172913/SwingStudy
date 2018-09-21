package org.lanqiao.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import org.lanqiao.entity.Admin;
import org.lanqiao.service.AdminService;
import org.lanqiao.service.impl.AdminServiceImpl;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField jtfname;
	private JPasswordField pwdf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 658, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("餐饮系统");
		title.setFont(new Font("宋体", Font.PLAIN, 25));
		title.setBounds(148, 30, 239, 66);
		frame.getContentPane().add(title);
		
		JLabel lblNewLabel_1 = new JLabel("用户名：");
		lblNewLabel_1.setBounds(65, 172, 54, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("密  码：");
		lblNewLabel_2.setBounds(65, 239, 54, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		jtfname = new JTextField();
		jtfname.setBounds(125, 169, 187, 21);
		frame.getContentPane().add(jtfname);
		jtfname.setColumns(10);
		
		pwdf = new JPasswordField();
		pwdf.setBounds(125, 236, 187, 21);
		frame.getContentPane().add(pwdf);
		
		JButton b1 = new JButton("登录");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = jtfname.getText();
				String psw = new String(pwdf.getPassword());
				AdminService adminService = new AdminServiceImpl();
				boolean b = adminService.adminLogin(new Admin(name,psw));
				if(b) {
					
				}else {
					JOptionPane.showMessageDialog(null, "用户名密码错误！", "提示", 0);
				}				
			}
		});
		b1.setFont(new Font("宋体", Font.PLAIN, 16));
		b1.setForeground(new Color(0, 0, 0));
		b1.setBackground(new Color(0, 139, 139));
		b1.setBounds(65, 306, 100, 34);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("重置");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtfname.setText("");
				pwdf.setText("");
			}
		});
		b2.setBounds(212, 307, 100, 34);
		frame.getContentPane().add(b2);
		
		JLabel lblNewLabel = new JLabel("background");
		lblNewLabel.setIcon(new ImageIcon("C:\\eclipse-workspace\\XT\\image\\55D58PICfIs.jpg"));
		lblNewLabel.setBounds(0, 0, 650, 406);
		frame.getContentPane().add(lblNewLabel);
	}
}
