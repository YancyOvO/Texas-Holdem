package com.dezhou2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * ����ʽ�
 * @author Administrator
 *
 */

public class PlayerMoney extends JPanel{
	
	static int mypaymoney  = 0;
	static int myallmoney  = 5000;
	
	public void mymoney(int mypay, int pay){
		mypaymoney = mypay;
		myallmoney = myallmoney - pay;
//		System.out.println("henduo"+mypaymoney);
		if (myallmoney <= 0){
			JOptionPane.showConfirmDialog(null, "���������뿪��", "��Ŀ㶵���Ѿ�û��һ��Ǯ��", JOptionPane.YES_NO_OPTION);
			System.exit(0);
		}
	}
	
	public void restart(){
		mypaymoney  = 0;
	}
	
	public void paint(Graphics g){
		super.paint(g);
		setOpaque(false);
//		System.out.println("henduo"+mypaymoney);
		g.setColor(Color.YELLOW);
	    g.drawString("����Ѻע��"+mypaymoney, 5, 12);
	    g.drawString("ʣ����룺"+myallmoney, 5, 30);//��������75��75��λ������ı�

		g.setColor(Color.BLACK);
	}
}
