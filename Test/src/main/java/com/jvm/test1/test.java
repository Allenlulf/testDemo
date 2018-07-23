package com.jvm.test1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton jb;
	
	public test(){
		this.setBounds(200, 200, 400, 200);
		this.setTitle("test jframe");
		
		jb=new JButton("Lambda");
		
		jb.addActionListener(e -> System.out.println("111"));
//		jb.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("222");
//			}
//		});
		
		
		this.add(jb);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new test();
	}
	

}
