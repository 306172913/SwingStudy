package org.lanqiao.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.lanqiao.entity.Menu;
import org.lanqiao.service.MenuService;
import org.lanqiao.service.impl.MenuServiceImpl;

import javax.swing.JComboBox;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView {

	private JFrame frame;
	private JTextField jtfaddname;
	private JTextField jtfaddkind;
	private JTextField jtfaddprice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView window = new MainView();
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
	public MainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("菜谱管理");
		menuBar.add(mnFile);
		
		JMenuItem menuItem = new JMenuItem("新增菜品");
		mnFile.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("修改信息");
		mnFile.add(menuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("查询菜谱");
		mnFile.add(mntmNewMenuItem);
		
		JMenu menu = new JMenu("顾客点餐");
		menuBar.add(menu);
		
		JMenuItem menuItem_3 = new JMenuItem("新建订单");
		menu.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("订单修改");
		menu.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("删除订单");
		menu.add(menuItem_5);
		
		JMenuItem menuItem_6 = new JMenuItem("查询订单");
		menu.add(menuItem_6);
		
		JMenu menu_1 = new JMenu("关于我们");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_7 = new JMenuItem("版本信息");
		menu_1.add(menuItem_7);
		frame.getContentPane().setLayout(null);
		
		Panel addGreens = new Panel();
		addGreens.setBounds(0, 0, 710, 411);
		frame.getContentPane().add(addGreens);
		addGreens.setLayout(null);
		
		JLabel lblicon = new JLabel("添加菜品icon");
		lblicon.setBounds(29, 10, 79, 23);
		addGreens.add(lblicon);
		
		jtfaddname = new JTextField();
		jtfaddname.setBounds(127, 108, 115, 21);
		addGreens.add(jtfaddname);
		jtfaddname.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(209, 144, 32, 21);
		addGreens.add(comboBox);
		
		jtfaddkind = new JTextField();
		jtfaddkind.setBounds(127, 144, 86, 21);
		addGreens.add(jtfaddkind);
		jtfaddkind.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("种类");
		lblNewLabel_1.setBounds(63, 147, 54, 15);
		addGreens.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("价格");
		lblNewLabel_2.setBounds(63, 206, 54, 15);
		addGreens.add(lblNewLabel_2);
		
		jtfaddprice = new JTextField();
		jtfaddprice.setBounds(127, 203, 66, 21);
		addGreens.add(jtfaddprice);
		jtfaddprice.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("￥");
		lblNewLabel_3.setBounds(202, 206, 54, 15);
		addGreens.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("菜名");
		lblNewLabel.setBounds(63, 111, 54, 15);
		addGreens.add(lblNewLabel);
		
		JButton button = new JButton("添加");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = jtfaddname.getText();	//菜名
				int kind = Integer.parseInt(jtfaddkind.getText());//种类
				int price = Integer.parseInt(jtfaddprice.getText());//价格
				MenuService menuService = new MenuServiceImpl();
				boolean b = menuService.addMenu(new Menu(name,kind,price));
				if(b) {//添加成功
					JOptionPane.showMessageDialog(null, "添加成功", "提示", 0);
				}else {//添加失败
					JOptionPane.showMessageDialog(null, "添加失败", "提示", 1);
				}
			}
		});
		button.setBounds(120, 267, 93, 23);
		addGreens.add(button);
		
		Panel main = new Panel();
		main.setBounds(0, 0, 710, 411);
		frame.getContentPane().add(main);
		main.setLayout(null);
		
		JLabel label = new JLabel("菜谱");
		label.setBounds(10, 10, 54, 15);
		main.add(label);
		
		Panel AllGreens = new Panel();
		AllGreens.setBounds(0, 0, 710, 411);
		frame.getContentPane().add(AllGreens);
		AllGreens.setLayout(null);
	}
}
