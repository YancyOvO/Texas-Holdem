package com.dezhou2;
/**
 * 总电脑
 * @author Administrator
 *
 */
public class Computer extends Background{
	 static final int c = Start.optCom();
	 int d=0;
		static int compaymoney  = 0;

	 
	 //电脑数量
	 public static int num(){
		 //为电脑资金赋值
		 switch(c){
		 case 4:Computer4.c4m = 8000;
		 case 3:Computer3.c3m = 7000;
		 case 2:Computer2.c2m = 6000;
		 case 1:Computer1.c1m = 3000;
		 }
		return c;
	 }

	 public void comm( int pay){
		 compaymoney += pay;
		// System.out.println("dsfdsggg"+compaymoney);
	 }
	 
	 public void restart(){
		 d=0;
		 compaymoney  = 0;
	 }

}
