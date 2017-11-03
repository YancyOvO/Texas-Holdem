package com.dezhou2;

import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * ÆúÅÆ°´Å¥
 * @author Administrator
 *
 */
public class Discard extends JButton{
	public void paintComponent ( Graphics g ){

		 super.paintComponent(g);

		URL imgURL = getClass().getResource("/images/button/0.png"); 
        ImageIcon icon=new ImageIcon(imgURL); 
        g.drawImage(icon.getImage(),0,0,getSize().width,getSize().height,this);

	}
}
