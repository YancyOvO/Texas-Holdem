package com.dezhou2;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.*;
import java.net.URL;
/**
 * Ñº×¢°´Å¥
 * @author Administrator
 *
 */
public class Bet extends JButton{
	public void paintComponent ( Graphics g ){
		super.paintComponent(g);
		URL imgURL = getClass().getResource("/images/button/1.png"); 
        ImageIcon icon=new ImageIcon(imgURL); 
        g.drawImage(icon.getImage(),0,0,getSize().width,getSize().height,this);
	}
}
