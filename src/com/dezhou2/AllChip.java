package com.dezhou2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AllChip extends JPanel{
	Image cp0 = Object.getImage("images/chip/0.png");
	Image cp1 = Object.getImage("images/chip/1.png");
	Image cp2 = Object.getImage("images/chip/2.png");
	Image cp3 = Object.getImage("images/chip/3.png");
	Image cp4 = Object.getImage("images/chip/4.png");
	Image cp5 = Object.getImage("images/chip/5.png");
	Image z0 = Object.getImage("images/chip/z0.png");
	Image z1 = Object.getImage("images/chip/z1.png");
	Image z2 = Object.getImage("images/chip/z2.png");
	Image z3 = Object.getImage("images/chip/z3.png");
	Image n0 = Object.getImage("images/character/0.png");
	Image n1 = Object.getImage("images/character/1.png");
	Image n2 = Object.getImage("images/character/2.png");
	Image n3 = Object.getImage("images/character/3.png");
	Image n4 = Object.getImage("images/character/4.png");
	Image win = null;
	ArrayList<Image> cp=new ArrayList<Image>();
	static int i=0;
	private int n=0,a=0,b=0;
	private int allmoney = 0;
	private int pay = 0;
	private int myallpay = 0;
	private int cpx[] = new int[200];
	private int cpy[] = new int[200];
	private int bi = 0;
	private int c1=0,c2=0,c3=0,c4=0;
	private int cc1=0,cc2=0,cc3=0,cc4=0;
	PlayerMoney pm = new PlayerMoney();
	Computer co = new Computer();
	

	
	//所有场上押入的砝码
	public void allchip(int money){

		if (money == 10)
			cp.add(cp0);
		if (money == 20)
			cp.add(cp1);
		if (money == 50)
			cp.add(cp2);
		if (money == 100)
			cp.add(cp3);
		if (money == 200)
			cp.add(cp4);
		if (money == 500)
			cp.add(cp5);
		a++;
		cpx[i]=(int) (Math.random()*120);
		cpy[i]=(int) (Math.random()*100+80);
		allmoney = allmoney + money;
		i++;
		switch(Background.n){
		//画出和统计押注筹码，并判断是否没钱或者已弃牌
		case 4:if(Computer4.c4m>0&&Computer4.jg4!=0){	
		cpx[i]=(int) (Math.random()*120);
		cpy[i]=(int) (Math.random()*100+80);
		allmoney = allmoney + money;
		i++;
		c4++;
		}
		case 3:if(Computer3.c3m>0&&Computer3.jg3!=0){	
		cpx[i]=(int) (Math.random()*120);
		cpy[i]=(int) (Math.random()*100+80);
		allmoney = allmoney + money;
		i++;
		c3++;
		}
		case 2:if(Computer2.c2m>0&&Computer2.jg2!=0){
		cpx[i]=(int) (Math.random()*120);
		cpy[i]=(int) (Math.random()*100+80);
		allmoney = allmoney + money;
		i++;
		c2++;
		}
		case 1:if(Computer1.c1m>0&&Computer1.jg1!=0){
		cpx[i]=(int) (Math.random()*120);
		cpy[i]=(int) (Math.random()*100+80);
		allmoney = allmoney + money;
		i++;
		c1++;
		}
		}
		//判定最终赢家
		if(Computer1.c1m<=0&&Computer2.c2m<=0&&Computer3.c3m<=0&&Computer4.c4m<=0){
			JOptionPane.showConfirmDialog(null, "所有人都已被你击败，传说中的赌王!", "不可思议", JOptionPane.YES_NO_OPTION);
			System.exit(0);
		}
	}
	
	//返回场上所有已押注的筹码
	public int allchip(){
	return allmoney;
	}
	
	//我押入的砝码
	public void mychip(int money){
		myallpay += money;
		pm.mymoney(myallpay,money);
		co.comm(money);
//System.out.println("pay"+pay+"myallpay"+myallpay);
	
	}
	
	
	
	
	//每轮打印最低标准
	public void mychip(){		
		if(Background.i==2&&bi==0){
			 pay = myallpay;
			 bi++;
		}
		if(Background.i==3&&bi==1){
			 pay = myallpay;
			 bi++;
		}
		if(Background.i==4&&bi==2){
			 pay = myallpay;
			 bi++;
		}
		if(Background.i==5&&bi==3){
			 pay = myallpay;
			 bi++;
		}
	}
	
	//判断画出赢家
	public void whowin(int[] g){
		 if(g == Computer4.c4){
			 win = n4;
		 }
		 if(g == Computer3.c3){
			 win = n3;
		 }
		 if(g == Computer2.c2){
			 win = n2;
		 }
		 if(g == Computer1.c1){
			 win = n1;
		 }
		 if(g == Player.p0){
			 win = n0;
		 }

	}
	
	//数据清零
	public void restart(){
		win = null;
		i=0;
		n=0;
		a=0;
		b=0;
		allmoney = 0;
		pay = 0;
		myallpay = 0;
		cpx = new int[200];
		cpy = new int[200];
		bi = 0;
		c1=0;
		c2=0;
		c3=0;
		c4=0;
		cc1=0;
		cc2=0;
		cc3=0;
		cc4=0;
		cp=new ArrayList<Image>();
	}
	
	 public void paint(Graphics g) {
		 	super.paint(g);
			setOpaque(false);
			
			//画最小筹码要求
			if(myallpay < 10)
				g.drawImage(z0,20,0,100,20,null);
			else if(myallpay - pay < 60 && Background.i == 2)
				g.drawImage(z1,10,0,120,20,null);
			else if(myallpay - pay < 100 && Background.i == 3)
				g.drawImage(z2,10,0,120,20,null);
			else if(myallpay - pay < 100 && Background.i == 4)
				g.drawImage(z2,10,0,120,20,null);
			else if(myallpay - pay < 200 && Background.i == 5)
				g.drawImage(z3,10,0,120,20,null);
			
			if(win==null){
				
			//已押注筹码显示
			if(i>0){
				n = 0;b = 0;cc4 = 0; cc3 = 0; cc2 = 0; cc1 = 0;
			do{
			g.drawImage(cp.get(b),cpx[n],cpy[n],25,25,null);
			n++;
			switch(Background.n){
			
			//画出押注筹码，并判断是否没钱或者已弃牌
			case 4:if(cc4<c4){	
				g.drawImage(cp.get(b),cpx[n],cpy[n],25,25,null);
				n++;
				cc4++;
			}
			case 3:if(cc3<c3){
				g.drawImage(cp.get(b),cpx[n],cpy[n],25,25,null);
				n++;
				cc3++;
			}
			case 2:if(cc2<c2){	
				g.drawImage(cp.get(b),cpx[n],cpy[n],25,25,null);
				n++;
				cc2++;
			}
			case 1:if(cc1<c1){	
				g.drawImage(cp.get(b),cpx[n],cpy[n],25,25,null);
				n++;
				cc1++;
			}
			}
			b++;
			}while(n < i);
			}
			}
			
			//谁赢了
			else{
			g.drawImage(win,30,20,80,80,null);
			g.setColor(Color.yellow);
			g.drawString("WIN!", 10, 10);
			g.setColor(Color.black);

	
			}
			}
}
