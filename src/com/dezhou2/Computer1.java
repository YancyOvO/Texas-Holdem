package com.dezhou2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Vector;

public class Computer1 extends PokerFace{
	 static int[] c1 = new int[5];
	 static int d = 0;
	 static int c1m = 0;
	 static int jg1 = -1; 
	// Vector<Image> image= new Vector<Image>();
	// private Image i = null;
	
	//第一电脑
	 public void com1(int po){
		 if(d<5){
		 c1[d] = po;//将牌存入int数组
		 System.out.println("com1第"+d+"张牌是"+c1[d]);
		 }
		 d++;
		 
		 if(d>=2&&jg1!=0)
			 jg1 = (int)(Math.random()*10);//弃牌概率
		 if(jg1 != 0){
			 c1m-=Computer.compaymoney;    //减去押注筹码
		 }
			//System.out.println("dsfds"+c1m);
	 }
	 
	 public void com1(){
		 d++;	 
		 if(d>=2&&jg1!=0)
			 jg1 = (int)(Math.random()*10);
		 if(jg1 != 0){
			 c1m-= Computer.compaymoney;
		 }
		//	System.out.println("dsfds"+c1m);
	 }
	 
	 public void restart(){
		 c1 = new int[5];
		 d = 0;
		 jg1 = -1; 
	 }
	 
	 public void paint(Graphics g) {
			super.paint(g);
			setOpaque(false);
			if(c1m > 0){
			switch(d){
			case 6:
			case 5: //Image im5=image.get(4);
				if(jg1!=0)								//判断是否已弃牌
				g.drawImage(ac(c1[4]),0,0,30,42,null);
			case 4:	//Image im4=image.get(3);
				if(jg1!=0)
				g.drawImage(ac(c1[3]),35,0,30,42,null);
			case 3:	//Image im3=image.get(2);
				if(jg1!=0)
				g.drawImage(ac(c1[2]),70,0,30,42,null);
			case 2:	//Image im2=image.get(1);
				if(jg1!=0)
				g.drawImage(ac(c1[1]),105,0,30,42,null);
			case 1:	//Image im1=image.get(0);
				if(jg1!=0)
				g.drawImage(pf0,140,0,30,42,null);
			}
			if(d == 6)
				if(jg1!=0)
			g.drawImage(ac(c1[0]),140,0,30,42,null);
			}
			else{
				g.setColor(Color.yellow);
				g.drawString("输光了嘛", 90, 20);
				g.setColor(Color.BLACK);
			}
//			System.out.println("ssssss");
		}
	 
}
