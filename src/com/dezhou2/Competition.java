package com.dezhou2;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 主函数（比赛）
 * @author Administrator
 *
 */

public class Competition extends Background implements ActionListener{
		
	JFrame frame = new JFrame();
	Bet b = new Bet();
	Poker de = new Poker();
    Discard d = new Discard();
    Background abc = new Background();
    Player pl = new Player();
    PlayerMoney plm = new PlayerMoney();
    Computer co = new Computer();
    Computer1 c1 = new Computer1();
    Computer2 c2 = new Computer2();
    Computer3 c3 = new Computer3();
    Computer4 c4 = new Computer4();
    Compare cm = new Compare();
    AllChip ach = new AllChip();
    Chip0 ch0 = new Chip0();
    Chip1 ch1 = new Chip1();
    Chip2 ch2 = new Chip2();
    Chip3 ch3 = new Chip3();
    Chip4 ch4 = new Chip4();
    Chip5 ch5 = new Chip5();
    private int pay = 0;
    private int paymoney = 0;
 
    static int i1 = 0;
    static int m = 0;
    
    private int[] g = new int[5];
    
   
    
    //主函数
	public static void main(String[] args){
	
		

		
		//创建运行窗口
		Start.rule();//欢迎界面
		Competition example = new Competition();

	
		example.tough();

	}

	
	public void tough(){
		
		
	
		Background.n = Computer.num();//在Computer中触发选项菜单把电脑数量赋给Computer中的c再传给n，
		
		abc.setLayout(null);//清空容器
		frame.setResizable(false);//窗口固定
		frame.setVisible(true);//窗口可见
		frame.setSize(800,500);//绘制窗口大小
		frame.setLocation(100,100);//确定窗口位置
	    frame.setContentPane(abc);//将abc作为底层
	    
	    //创建Bet按钮
	    b.setBounds (320, 330, 70, 25);
	    b.addActionListener(this);
		frame.getContentPane().add(b);
		
		//创建Discard按钮
		d.setBounds (420, 330, 70, 25);
		d.addActionListener(this);
		frame.getContentPane().add(d);
		
		//创建我的人物
		pl.setBounds (x0+70, y0+40, 170, 42);
		frame.getContentPane().add(pl);
		
		//创建我的资金
		plm.setBounds (x0-10, y0-50, 100, 40);
		frame.getContentPane().add(plm);
		
		//创建桌面
		ach.setBounds (330, 90, 150, 210);
		frame.getContentPane().add(ach);

		//创建我的筹码
		ch0.setBounds(270, 418, 28, 28);
		ch0.addActionListener(this);
		frame.getContentPane().add(ch0); 
		ch1.setBounds(320, 418, 28, 28);
		ch1.addActionListener(this);
		frame.getContentPane().add(ch1); 
		ch2.setBounds(370, 418, 28, 28);
		ch2.addActionListener(this);
		frame.getContentPane().add(ch2); 
		ch3.setBounds(420, 418, 28, 28);
		ch3.addActionListener(this);
		frame.getContentPane().add(ch3); 
		ch4.setBounds(470, 418, 28, 28);
		ch4.addActionListener(this);
		frame.getContentPane().add(ch4); 
		ch5.setBounds(520, 418, 28, 28);
		ch5.addActionListener(this);
		frame.getContentPane().add(ch5); 
		
		//创建对手
		switch(n){
		case 4:c4.setBounds (x4-165, y4+40, 170, 42);
		frame.getContentPane().add(c4);
		case 3:c3.setBounds (x3-165, y3+40, 170, 42);
		frame.getContentPane().add(c3);
		case 2:c2.setBounds (x2-165, y2+40, 170, 42);
		frame.getContentPane().add(c2);
		case 1:c1.setBounds (x1-165, y1+40, 170, 42);
		frame.getContentPane().add(c1); 
		}
		

		
		//开启重画
		 new PaintThread().start();
		 //声音开启
		 new Sounds().start();
		}
	
	//数据重置
	public void restart(){
		i = 0;
	    pay = 0;
	    paymoney = 0;	 
	    i1 = 0;
	    m = 0;	    
	    g = new int[5];
	    co.restart();
	    ach.restart();
	    c1.restart();
	    c2.restart();
	    c3.restart();
	    c4.restart();
	    pl.restart();
	    plm.restart();
	    de.restart();
	}
	
	
	//按钮监听
	public void actionPerformed(ActionEvent arg0) {
		
		//押注按钮触发
		if(i == 0&&pay<10){
			if (arg0.getSource() == ch0){
				pay += 10;
				ach.allchip(10);
				ach.mychip(10);
			}
		}
		
	if(i>=2){	
		if (arg0.getSource() == ch0){
			pay += 10;
			ach.allchip(10);
			ach.mychip(10);
		}
		
		if (arg0.getSource() == ch1){
			pay += 20;
			ach.allchip(20);
			ach.mychip(20);
		}
		
		
		if (arg0.getSource() == ch2){
			pay += 50;
			ach.allchip(50);
			ach.mychip(50);
		}
		
		
		if (arg0.getSource() == ch3){
			pay += 100;
			ach.allchip(100);
			ach.mychip(100);
		}
		
		if (arg0.getSource() == ch4){
			pay += 200;
			ach.allchip(200);
			ach.mychip(200);
		}
		
		if (arg0.getSource() == ch5){
			pay += 500;
			ach.allchip(500);
			ach.mychip(500);
		}
	}
	
	
		//触发Bet按钮
		if (arg0.getSource() == b){
			//玩家每轮投入的金钱统计
			ach.mychip();
			//如果都弃牌了，玩家拿钱
			if((Computer1.jg1==0||Computer1.jg1==-1)
					&&(Computer2.jg2==0||Computer2.jg2==-1)
					&&(Computer3.jg3==0||Computer3.jg3==-1)
					&&(Computer4.jg4==0||Computer4.jg4==-1)&&i>=1){
				 PlayerMoney.myallmoney += ach.allchip();
				 restart();
			}
//			System.out.println("paymoney"+paymoney);
//			System.out.println("mymoney"+pay);
			//////显示底牌
			if(i == 5 && pay - paymoney >= 200)  //判断轮数和是否达到最低赌资
			{
            de.dealOne();						 //发牌
			System.out.println("六");			 //
			i++;							     //轮数加一
			paymoney=pay;			   			 //每轮赌资统计
			Computer.compaymoney = 0; 			 //每轮赌资归零
			//比牌
			g = Player.p0;
			 		switch(n){
				case 4:if(Computer4.c4m>0&&Computer4.c4m>0&&Computer4.jg4!=0)
					g = cm.results(Player.p0,Computer4.c4);
				case 3:if(Computer3.c3m>0&&Computer3.c3m>0&&Computer3.jg3!=0)
					g = cm.results(g,Computer3.c3);
				case 2:if(Computer2.c2m>0&&Computer2.c2m>0&&Computer2.jg2!=0)
					g = cm.results(g,Computer2.c2);
				case 1:if(Computer1.c1m>0&&Computer1.c1m>0&&Computer1.jg1!=0)
					g = cm.results(g,Computer1.c1);
				}
			System.out.println("赢牌的是"+g[0]+" "+g[1]+" "+g[2]+" "+g[3]+" "+g[4]);
			 //赢家拿钱
			 if(g == Computer4.c4){
				 Computer4.c4m += ach.allchip();
				 System.out.println("com4是赢家");
			 }
			 if(g == Computer3.c3){
				 Computer3.c3m += ach.allchip();
				 System.out.println("com3是赢家");
			 }
			 if(g == Computer2.c2){
				 Computer2.c2m += ach.allchip();
				 System.out.println("com2是赢家");
			 }
			 if(g == Computer1.c1){
				 Computer1.c1m += ach.allchip();
				 System.out.println("com1是赢家");
			 }
			 if(g == Player.p0){
				 PlayerMoney.myallmoney += ach.allchip();
				 System.out.println("player是赢家");
			 }
			 ach.whowin(g);//画赢家
			 
			 //重新开始
			  if (g == Player.p0){
					JOptionPane.showConfirmDialog(null, "This bureau you win!", "！！！", JOptionPane.YES_NO_OPTION);
					restart();
				}
			  else{
					JOptionPane.showConfirmDialog(null, "This bureau you lose!", "！！！", JOptionPane.YES_NO_OPTION);
					restart();
				}
			}	
		    //////第五张牌
			if(i == 4 &&  pay - paymoney >= 100)
			{
            de.dealOne();
			System.out.println("第五张牌");
			i++;
			paymoney=pay;
			 Computer.compaymoney = 0;
			}	
			
			//////第四张牌
			if(i == 3 &&  pay - paymoney >= 100)
			{
			de.dealOne();
			System.out.println("第四张牌");
			i++;
			paymoney=pay;
			 Computer.compaymoney = 0;
			}	
			//////第三张牌
			if(i == 2 && pay - paymoney >= 50)
			{
			de.dealOne();
			System.out.println("第三张牌");
			i++;
			paymoney=pay;
			 Computer.compaymoney = 0;
			}
			
//			//////第二张牌
//			if(i == 1)
//			{
//			de.dealOne();
//			System.out.println("二");
//			i++;
//			}
			
			///////第一、二张牌
			if(i == 0&& pay == 10)
			{
			de.dealOne();
			System.out.println("第一张牌");	
			i++;
			de.dealOne();
			System.out.println("第二张牌");
			i++;
			paymoney+=pay;
			 Computer.compaymoney = 0;
			}
			
		
		}
	

		//触发Discard按钮
		if (arg0.getSource() == d){
			System.out.println("ddddd");
			 if(Computer4.c4m>0&&Computer4.jg4!=0){
				 Computer4.c4m += ach.allchip();
			 }
			 else if(Computer3.c3m>0&&Computer3.jg3!=0){
				 Computer3.c3m += ach.allchip();
			 }
			 else if(Computer2.c2m>0&&Computer2.jg2!=0){
				 Computer2.c2m += ach.allchip();
			 }
			 else if(Computer1.c1m>0&&Computer1.jg1!=0){
				 Computer1.c1m += ach.allchip();
			 }
			JOptionPane.showConfirmDialog(null, "This bureau you lose!", "！！！", JOptionPane.YES_NO_OPTION);
			restart();
		}
	}

	//刷新组件
	class PaintThread extends Thread{
		public void run()
		{

			while(true){
//				System.out.println(i1);
//				i1++;
				pl.repaint();
				plm.repaint();
				ach.repaint();
				switch(n){
				case 4:c4.repaint();
				case 3:c3.repaint();
				case 2:c2.repaint();
				case 1:c1.repaint();
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//BGM读取播放
	class Sounds extends Thread{
		public void run()
		{
		try {
			URL cb;
			File f = new File("/tworoguesonemark.wav");
			   cb = f.toURI().toURL();
			AudioClip auu;
			auu = Applet.newAudioClip(cb);
			auu.loop();
			Thread.sleep(600000);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}


	}


