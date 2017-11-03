package com.dezhou2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 玩家资金
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
			JOptionPane.showConfirmDialog(null, "保安请你离开！", "你的裤兜里已经没有一分钱了", JOptionPane.YES_NO_OPTION);
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
	    g.drawString("本局押注："+mypaymoney, 5, 12);
	    g.drawString("剩余筹码："+myallmoney, 5, 30);//在坐标在75，75的位置输出文本

		g.setColor(Color.BLACK);
	}
}
