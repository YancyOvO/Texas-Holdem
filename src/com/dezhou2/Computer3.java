package com.dezhou2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Computer3 extends PokerFace{
	 static int[] c3 = new int[5];
	 static int d;
	 static int c3m = 0;
	 static int jg3 = -1; 
	
	//第3电脑
	 public void com3(int po){
		 if(d<5){
		 c3[d] = po;
		 System.out.println("com3第"+d+"张牌是"+c3[d]);
		 }
		 d++;
		 
		 
		 if(d>=2&&jg3!=0)
			 jg3 = (int)(Math.random()*10);
		 if(jg3 != 0){
			 c3m-=Computer.compaymoney;
		 }
	//		System.out.println("dsfds"+c3m);
	 }
	 
	 public void com3(){
		 d++;
		 
		 
		 if(d>=2&&jg3!=0)
			 jg3 = (int)(Math.random()*10);
		 if(jg3 != 0){
			 c3m-=Computer.compaymoney;
		 }
	//		System.out.println("dsfds"+c3m);
	 }
	 
	 public void restart(){
		 c3 = new int[5];
		 d = 0;
		 jg3 = -1; 
	 }
	 
	 public void paint(Graphics g) {
			super.paint(g);
			setOpaque(false);
			if(c3m > 0){
			switch(d){
			case 6:
			case 5: //Image im5=image.get(4);
				if(jg3!=0)
				g.drawImage(ac(c3[4]),0,0,30,42,null);
			case 4:	//Image im4=image.get(3);
				if(jg3!=0)
				g.drawImage(ac(c3[3]),35,0,30,42,null);
			case 3:	//Image im3=image.get(2);
				if(jg3!=0)
				g.drawImage(ac(c3[2]),70,0,30,42,null);
			case 2:	//Image im2=image.get(1);
				if(jg3!=0)
				g.drawImage(ac(c3[1]),105,0,30,42,null);
			case 1:	//Image im1=image.get(0);
				if(jg3!=0)
				g.drawImage(pf0,140,0,30,42,null);

		}
			if(d == 6){
				if(jg3!=0)
				g.drawImage(ac(c3[0]),140,0,30,42,null);
			}
			}
			else{
				g.setColor(Color.yellow);
				g.drawString("手气太差-.-", 90, 20);
				g.setColor(Color.BLACK);
			}

}
}
