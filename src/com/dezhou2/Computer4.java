package com.dezhou2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Computer4 extends PokerFace{
	 static int[] c4 = new int[5];
	 static int d;
	 static int c4m = 0;
	 static int jg4 = -1; 
	
	//第4电脑
	 public void com4(int po){
		 if(d<5){
		 c4[d] = po;
		 System.out.println("com4第"+d+"张牌是"+c4[d]);
		 }
		 d++;
		 
		 
		 if(d>=2&&jg4!=0)
			 jg4 = (int)(Math.random()*10);
		 if(jg4 != 0){
			 c4m-=Computer.compaymoney;
		 }
	//		System.out.println("dsfds"+c4m);
	 }
	 
	 public void com4(){
		 d++;
		 
		 
		 if(d>=2&&jg4!=0)
			 jg4 = (int)(Math.random()*10);
		 if(jg4 != 0){
			 c4m-=Computer.compaymoney;
		 }
		//	System.out.println("dsfds"+c4m);
	 }
	 
	 public void restart(){
		 c4 = new int[5];
		 d = 0;
		 jg4 = -1; 
	 }
	 
	 public void paint(Graphics g) {
			super.paint(g);
			setOpaque(false);
			if(c4m > 0){
			switch(d){
			case 6:
			case 5: //Image im5=image.get(4);
				if(jg4!=0)
				g.drawImage(ac(c4[4]),0,0,30,42,null);
			case 4:	//Image im4=image.get(3);
				if(jg4!=0)
				g.drawImage(ac(c4[3]),35,0,30,42,null);
			case 3:	//Image im3=image.get(2);
				if(jg4!=0)
				g.drawImage(ac(c4[2]),70,0,30,42,null);
			case 2:	//Image im2=image.get(1);
				if(jg4!=0)
				g.drawImage(ac(c4[1]),105,0,30,42,null);
			case 1:	//Image im1=image.get(0);
				if(jg4!=0)
				g.drawImage(pf0,140,0,30,42,null);

		}
			
			if(d == 6){
				if(jg4!=0)
				g.drawImage(ac(c4[0]),140,0,30,42,null);
			}
			}
			else{
				g.setColor(Color.yellow);
				g.drawString("你很厉害", 90, 20);
				g.setColor(Color.BLACK);
			}

}
}
