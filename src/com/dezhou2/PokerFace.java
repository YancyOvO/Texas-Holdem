package com.dezhou2;

import java.awt.Image;

import javax.swing.JPanel;
/**
 * 扑克牌图片加载及选择
 * @author Administrator
 *
 */
public class PokerFace extends JPanel{
	Image pf0 = Object.getImage("images/poker/0.jpg");
	Image pf1 = Object.getImage("images/poker/1.jpg");
	Image pf2 = Object.getImage("images/poker/2.jpg");
	Image pf3 = Object.getImage("images/poker/3.jpg");
	Image pf4 = Object.getImage("images/poker/4.jpg");
	Image pf5 = Object.getImage("images/poker/5.jpg");
	Image pf6 = Object.getImage("images/poker/6.jpg");
	Image pf7 = Object.getImage("images/poker/7.jpg");
	Image pf8 = Object.getImage("images/poker/8.jpg");
	Image pf9 = Object.getImage("images/poker/9.jpg");
	Image pf10 = Object.getImage("images/poker/10.jpg");
	Image pf11 = Object.getImage("images/poker/11.jpg");
	Image pf12 = Object.getImage("images/poker/12.jpg");
	Image pf13 = Object.getImage("images/poker/13.jpg");
	Image pf14 = Object.getImage("images/poker/14.jpg");
	Image pf15 = Object.getImage("images/poker/15.jpg");
	Image pf16 = Object.getImage("images/poker/16.jpg");
	Image pf17 = Object.getImage("images/poker/17.jpg");
	Image pf18 = Object.getImage("images/poker/18.jpg");
	Image pf19 = Object.getImage("images/poker/19.jpg");
	Image pf20 = Object.getImage("images/poker/20.jpg");
	Image pf21 = Object.getImage("images/poker/21.jpg");
	Image pf22 = Object.getImage("images/poker/22.jpg");
	Image pf23 = Object.getImage("images/poker/23.jpg");
	Image pf24 = Object.getImage("images/poker/24.jpg");
	Image pf25 = Object.getImage("images/poker/25.jpg");
	Image pf26 = Object.getImage("images/poker/26.jpg");
	Image pf27 = Object.getImage("images/poker/27.jpg");
	Image pf28 = Object.getImage("images/poker/28.jpg");
	Image pface ;

	
	public Image ac(int a){
		
		if (a ==1)
			pface = pf1;
		if(a == 2)
			pface = pf2;
		if(a == 3)
			pface = pf3;
		if(a == 4)
			pface = pf4;
		if(a == 5)
			pface = pf5;
		if(a == 6)
			pface = pf6;
		if(a == 7)
			pface = pf7;
		if(a == 8)
			pface = pf8;
		if(a == 9)
			pface = pf9;
		if(a == 10)
			pface = pf10;
		if(a == 11)
			pface = pf11;
		if(a == 12)
			pface = pf12;
		if(a == 13)
			pface = pf13;
		if(a == 14)
			pface = pf14;
		if(a == 15)
			pface = pf15;
		if(a == 16)
			pface = pf16;
		if(a == 17)
			pface = pf17;
		if(a == 18)
			pface = pf18;
		if(a == 19)
			pface = pf19;
		if(a == 20)
			pface = pf20;
		if(a == 21)
			pface = pf21;
		if(a == 22)
			pface = pf22;
		if(a == 23)
			pface = pf23;
		if(a == 24)
			pface = pf24;
		if(a == 25)
			pface = pf25;
		if(a == 26)
			pface = pf26;
		if(a == 27)
			pface = pf27;
		if(a == 28)
			pface = pf28;
//System.out.println("gg"+a);

		return pface;
	}

}
