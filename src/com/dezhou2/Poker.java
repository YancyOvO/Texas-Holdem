package com.dezhou2;
/**
 * 发牌机制
 * @author Administrator
 *
 */

public class Poker extends Background{
	

		private int[] aPoker = new int[53];
		private int k;
		private int i = 0;
		PokerFace a = new PokerFace();
	//发牌
		public void dealOne(){
			Player pl = new Player();
			Computer1 co1 = new Computer1();
			Computer2 co2 = new Computer2();
			Computer3 co3 = new Computer3();
			Computer4 co4 = new Computer4();
			if(i == 5)
			{
				switch(n){
				case 4:if(Computer4.c4m>0&&Computer4.c4m>0&&Computer4.jg4!=0)
					co4.com4();
				case 3:if(Computer3.c3m>0&&Computer3.c3m>0&&Computer3.jg3!=0)
					co3.com3();
				case 2:if(Computer2.c2m>0&&Computer2.c2m>0&&Computer2.jg2!=0)
					co2.com2();
				case 1:if(Computer1.c1m>0&&Computer1.c1m>0&&Computer1.jg1!=0)
					co1.com1();
				
				}
			}
			////第5张牌
			if(i == 4)
			{
				do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
				   aPoker[k] = k;
				   pl.me(k);
				   a.ac(k);
				switch(n){
					case 4:if(Computer4.c4m>0&&Computer4.c4m>0&&Computer4.jg4!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co4.com4(k);
					   a.ac(k);
					}
					case 3:if(Computer3.c3m>0&&Computer3.c3m>0&&Computer3.jg3!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co3.com3(k);
					   a.ac(k);
					}
					case 2:if(Computer2.c2m>0&&Computer2.c2m>0&&Computer2.jg2!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co2.com2(k);
					   a.ac(k);
					}
					case 1:if(Computer1.c1m>0&&Computer1.c1m>0&&Computer1.jg1!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co1.com1(k);
					   a.ac(k);
					}
			}
				i++;
			}
			
			////第4张牌
			if(i == 3)
			{
				do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
				   aPoker[k] = k;
				   pl.me(k);
				   a.ac(k);
				switch(n){
					case 4:if(Computer4.c4m>0&&Computer4.c4m>0&&Computer4.jg4!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co4.com4(k);
					   a.ac(k);
					}
					case 3:if(Computer3.c3m>0&&Computer3.c3m>0&&Computer3.jg3!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co3.com3(k);
					   a.ac(k);
					}
					case 2:if(Computer2.c2m>0&&Computer2.c2m>0&&Computer2.jg2!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co2.com2(k);
					   a.ac(k);
					}
					case 1:if(Computer1.c1m>0&&Computer1.c1m>0&&Computer1.jg1!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co1.com1(k);
					   a.ac(k);
					}
			}
				i++;
			}
			
			////第3张牌
			if(i == 2)
			{
				do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
				   aPoker[k] = k;
				   pl.me(k);
				   a.ac(k);
				switch(n){
			
					case 4:if(Computer4.c4m>0&&Computer4.c4m>0&&Computer4.jg4!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co4.com4(k);
					   a.ac(k);
					}
					case 3:if(Computer3.c3m>0&&Computer3.c3m>0&&Computer3.jg3!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co3.com3(k);
					   a.ac(k);
					}
					case 2:if(Computer2.c2m>0&&Computer2.c2m>0&&Computer2.jg2!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co2.com2(k);
					   a.ac(k);
					}
					case 1:if(Computer1.c1m>0&&Computer1.c1m>0&&Computer1.jg1!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co1.com1(k);
					   a.ac(k);
					}
				
			}
				i++;
			}
			
			////第2张牌
			if(i == 1)
			{
				do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
				   aPoker[k] = k;
				   pl.me(k);
				   a.ac(k);
				switch(n){
					case 4:if(Computer4.c4m>0&&Computer4.c4m>0&&Computer4.jg4!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co4.com4(k);
					   a.ac(k);
					}
					case 3:if(Computer3.c3m>0&&Computer3.c3m>0&&Computer3.jg3!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co3.com3(k);
					   a.ac(k);
					}
					case 2:if(Computer2.c2m>0&&Computer2.c2m>0&&Computer2.jg2!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co2.com2(k);
					   a.ac(k);
					}
					case 1:if(Computer1.c1m>0&&Computer1.c1m>0&&Computer1.jg1!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					   aPoker[k] = k;
					   co1.com1(k);
					   a.ac(k);
					}
			}
				i++;
			}
			
		////第1张牌
			if(i == 0)
			{
				do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
					aPoker[k] = k;
					pl.me(k);
					a.ac(k);
				switch(n){
					case 4:if(Computer4.c4m>0&&Computer4.c4m>0&&Computer4.jg4!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
						aPoker[k] = k;
						co4.com4(k);
						a.ac(k);
					}
					case 3:if(Computer3.c3m>0&&Computer3.c3m>0&&Computer3.jg3!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
				   	    aPoker[k] = k;
						co3.com3(k);
						a.ac(k);
					}
					case 2:if(Computer2.c2m>0&&Computer2.c2m>0&&Computer2.jg2!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
						aPoker[k] = k;
						co2.com2(k);
						a.ac(k);
					}
					case 1:if(Computer1.c1m>0&&Computer1.c1m>0&&Computer1.jg1!=0){
						do{k=(int)(Math.random()*28+1);}while(aPoker[k] != 0);
						aPoker[k] = k;
						co1.com1(k);
						a.ac(k);
					}
						
				}
					i++;
				}
		}
		
		public void restart(){
			aPoker = new int[53];
			
			i = 0;
		}
		
/*		public void deal(int xx,int yy){
			int x0 = xx;
			int y0 = yy;
			int k;
			k = (yy-(y+120))/(xx-(x+25));
			
		}*/

}
