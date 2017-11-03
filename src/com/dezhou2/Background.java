package com.dezhou2;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JPanel;


public class Background extends JPanel{

	static int n;
	final int x = 360;
	final int y = 0;
	int x0 = 120, y0 = 330;
	int x1 = 600, y1 = 330;
	int x2 = 680, y2 = 250;
	int x3 = 680, y3 = 130;
	int x4 = 600, y4 = 10;
	int x5 = 120, y5 = 10;
	int x6 = 40, y6 = 110;
	int x7 = 40, y7 = 250;
	Image imgt = Object.getImage("images/table.jpg");
	Image pockerBack = Object.getImage("images/poker/0.jpg");
	Image n0 = Object.getImage("images/character/0.png");
	Image n1 = Object.getImage("images/character/1.png");
	Image n2 = Object.getImage("images/character/2.png");
	Image n3 = Object.getImage("images/character/3.png");
	Image n4 = Object.getImage("images/character/4.png");
	static int i = 0;
	int gx = 50, gy = 50;
	
	public void paintComponent(Graphics g){
			//super.paintComponent(g);
		//new PaintThread().start();
		

		
		g.drawImage(imgt, 0, 0, null);

		g.drawImage(pockerBack, x+25, y+120, null);
		
		//ª≠»ÀŒÔ
		g.drawImage(n0, x0, y0, null);
		switch(n)
		{
		case 4:g.drawImage(n4, x4, y4, null);
		case 3:g.drawImage(n3, x3, y3, null);
		case 2:g.drawImage(n2, x2, y2, null);
		case 1:g.drawImage(n1, x1, y1, null);
			}
		
	}
	
}
