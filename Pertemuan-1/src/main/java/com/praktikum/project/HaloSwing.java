package com.praktikum.project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class HaloSwing
{
	public static void main(String[] xx)
	{
		JFrame fr = new JFrame();
		fr.setTitle("Halo Swing");
		
		fr.setSize(200,200);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fr.setResizable(false);
		
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("Label Pada JPanel");
		pnl.add(lbl);
		fr.add(pnl);
		JOptionPane.showMessageDialog(null,"Halo Dialog");
		fr.setVisible(true);
	}
}