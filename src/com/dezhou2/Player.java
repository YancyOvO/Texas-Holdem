package com.dezhou2;

import java.awt.Graphics;
/**
 * 玩家
 * @author Administrator
 *
 */
public class Player extends PokerFace{
	
	
	 static int[] p0 = new int[5];
	 static int d = 0;

	 public void me(int po){
		 p0[d] = po;//将牌存入int数组
		 System.out.println("player第"+d+"张牌是"+p0[d]);
		 d++;
	 }
	 
	 
	 public void restart(){
		 p0 = new int[5];
		 d = 0;
	 }
	 
	 public void paint(Graphics g) {
			super.paint(g);
			setOpaque(false);
			switch(d){
			case 5: //Image im5=image.get(4);
				g.drawImage(ac(p0[4]),0,0,30,42,null);
			case 4:	//Image im4=image.get(3);
				g.drawImage(ac(p0[3]),35,0,30,42,null);
			case 3:	//Image im3=image.get(2);
				g.drawImage(ac(p0[2]),70,0,30,42,null);
			case 2:	//Image im2=image.get(1);
				g.drawImage(ac(p0[1]),105,0,30,42,null);
			case 1:	//Image im1=image.get(0);
				g.drawImage(ac(p0[0]),140,0,30,42,null);break;
			case 0:	setOpaque(false);
			}
//			System.out.println("ccv"+d);
//			System.out.println("eeeee");

		}
	
	 

}
