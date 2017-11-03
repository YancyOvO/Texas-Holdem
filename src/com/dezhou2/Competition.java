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
 * ��������������
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
    
   
    
    //������
	public static void main(String[] args){
	
		

		
		//�������д���
		Start.rule();//��ӭ����
		Competition example = new Competition();

	
		example.tough();

	}

	
	public void tough(){
		
		
	
		Background.n = Computer.num();//��Computer�д���ѡ��˵��ѵ�����������Computer�е�c�ٴ���n��
		
		abc.setLayout(null);//�������
		frame.setResizable(false);//���ڹ̶�
		frame.setVisible(true);//���ڿɼ�
		frame.setSize(800,500);//���ƴ��ڴ�С
		frame.setLocation(100,100);//ȷ������λ��
	    frame.setContentPane(abc);//��abc��Ϊ�ײ�
	    
	    //����Bet��ť
	    b.setBounds (320, 330, 70, 25);
	    b.addActionListener(this);
		frame.getContentPane().add(b);
		
		//����Discard��ť
		d.setBounds (420, 330, 70, 25);
		d.addActionListener(this);
		frame.getContentPane().add(d);
		
		//�����ҵ�����
		pl.setBounds (x0+70, y0+40, 170, 42);
		frame.getContentPane().add(pl);
		
		//�����ҵ��ʽ�
		plm.setBounds (x0-10, y0-50, 100, 40);
		frame.getContentPane().add(plm);
		
		//��������
		ach.setBounds (330, 90, 150, 210);
		frame.getContentPane().add(ach);

		//�����ҵĳ���
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
		
		//��������
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
		

		
		//�����ػ�
		 new PaintThread().start();
		 //��������
		 new Sounds().start();
		}
	
	//��������
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
	
	
	//��ť����
	public void actionPerformed(ActionEvent arg0) {
		
		//Ѻע��ť����
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
	
	
		//����Bet��ť
		if (arg0.getSource() == b){
			//���ÿ��Ͷ��Ľ�Ǯͳ��
			ach.mychip();
			//����������ˣ������Ǯ
			if((Computer1.jg1==0||Computer1.jg1==-1)
					&&(Computer2.jg2==0||Computer2.jg2==-1)
					&&(Computer3.jg3==0||Computer3.jg3==-1)
					&&(Computer4.jg4==0||Computer4.jg4==-1)&&i>=1){
				 PlayerMoney.myallmoney += ach.allchip();
				 restart();
			}
//			System.out.println("paymoney"+paymoney);
//			System.out.println("mymoney"+pay);
			//////��ʾ����
			if(i == 5 && pay - paymoney >= 200)  //�ж��������Ƿ�ﵽ��Ͷ���
			{
            de.dealOne();						 //����
			System.out.println("��");			 //
			i++;							     //������һ
			paymoney=pay;			   			 //ÿ�ֶ���ͳ��
			Computer.compaymoney = 0; 			 //ÿ�ֶ��ʹ���
			//����
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
			System.out.println("Ӯ�Ƶ���"+g[0]+" "+g[1]+" "+g[2]+" "+g[3]+" "+g[4]);
			 //Ӯ����Ǯ
			 if(g == Computer4.c4){
				 Computer4.c4m += ach.allchip();
				 System.out.println("com4��Ӯ��");
			 }
			 if(g == Computer3.c3){
				 Computer3.c3m += ach.allchip();
				 System.out.println("com3��Ӯ��");
			 }
			 if(g == Computer2.c2){
				 Computer2.c2m += ach.allchip();
				 System.out.println("com2��Ӯ��");
			 }
			 if(g == Computer1.c1){
				 Computer1.c1m += ach.allchip();
				 System.out.println("com1��Ӯ��");
			 }
			 if(g == Player.p0){
				 PlayerMoney.myallmoney += ach.allchip();
				 System.out.println("player��Ӯ��");
			 }
			 ach.whowin(g);//��Ӯ��
			 
			 //���¿�ʼ
			  if (g == Player.p0){
					JOptionPane.showConfirmDialog(null, "This bureau you win!", "������", JOptionPane.YES_NO_OPTION);
					restart();
				}
			  else{
					JOptionPane.showConfirmDialog(null, "This bureau you lose!", "������", JOptionPane.YES_NO_OPTION);
					restart();
				}
			}	
		    //////��������
			if(i == 4 &&  pay - paymoney >= 100)
			{
            de.dealOne();
			System.out.println("��������");
			i++;
			paymoney=pay;
			 Computer.compaymoney = 0;
			}	
			
			//////��������
			if(i == 3 &&  pay - paymoney >= 100)
			{
			de.dealOne();
			System.out.println("��������");
			i++;
			paymoney=pay;
			 Computer.compaymoney = 0;
			}	
			//////��������
			if(i == 2 && pay - paymoney >= 50)
			{
			de.dealOne();
			System.out.println("��������");
			i++;
			paymoney=pay;
			 Computer.compaymoney = 0;
			}
			
//			//////�ڶ�����
//			if(i == 1)
//			{
//			de.dealOne();
//			System.out.println("��");
//			i++;
//			}
			
			///////��һ��������
			if(i == 0&& pay == 10)
			{
			de.dealOne();
			System.out.println("��һ����");	
			i++;
			de.dealOne();
			System.out.println("�ڶ�����");
			i++;
			paymoney+=pay;
			 Computer.compaymoney = 0;
			}
			
		
		}
	

		//����Discard��ť
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
			JOptionPane.showConfirmDialog(null, "This bureau you lose!", "������", JOptionPane.YES_NO_OPTION);
			restart();
		}
	}

	//ˢ�����
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
	
	//BGM��ȡ����
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


