package com.dezhou2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Computer2 extends PokerFace{
	 static int[] c2 = new int[5];
	 static int d = 0;
	 static int c2m = 0;
	 static int jg2 = -1; 
	
	//第2电脑
	 public void com2(int po){
		 if(d<5){
		 c2[d] = po;
		 System.out.println("com2第"+d+"张牌是"+c2[d]);
		 }
		 d++;
		 
		 
		 if(d>=2&&jg2!=0)
			 jg2 = (int)(Math.random()*10);
		 if(jg2 != 0){
			 c2m-=Computer.compaymoney;
		 }
			System.out.println("dsfds"+c2m);
	 }
	 
	 public void com2(){
		 d++;
		 
		 
		 if(d>=2&&jg2!=0)
			 jg2 = (int)(Math.random()*10);
		 if(jg2 != 0){
			 c2m-=Computer.compaymoney;
		 }
			System.out.println("dsfds"+c2m);
	 }
	 
	 public void restart(){
		 c2 = new int[5];
		 d = 0;
		 jg2 = -1; 
	 }
	 
	 public void paint(Graphics g) {
			super.paint(g);
			setOpaque(false);
			if(c2m > 0){
			switch(d){
			case 6:
			case 5: //Image im5=image.get(4);
				if(jg2!=0)
				g.drawImage(ac(c2[4]),0,0,30,42,null);
			case 4:	//Image im4=image.get(3);
				if(jg2!=0)
				g.drawImage(ac(c2[3]),35,0,30,42,null);
			case 3:	//Image im3=image.get(2);
				if(jg2!=0)
				g.drawImage(ac(c2[2]),70,0,30,42,null);
			case 2:	//Image im2=image.get(1);
				if(jg2!=0)
				g.drawImage(ac(c2[1]),105,0,30,42,null);
			case 1:	//Image im1=image.get(0);
				if(jg2!=0)
				g.drawImage(pf0,140,0,30,42,null);

		}
			if(d == 6){
				if(jg2!=0)
				g.drawImage(ac(c2[0]),140,0,30,42,null);
			}
			}
			else{
				g.setColor(Color.yellow);
				g.drawString("没钱了，走了", 90, 20);
				g.setColor(Color.BLACK);
			}

}
}
