package com.dezhou2;

import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 * ³ïÂë°´Å¥4
 * @author Administrator
 *
 */
public class Chip4 extends JButton{
	public void paintComponent ( Graphics g ){
//		super.paintComponent(g);
		URL imgURL = getClass().getResource("/images/chip/4.png"); 
        ImageIcon icon=new ImageIcon(imgURL); 
        g.drawImage(icon.getImage(),0,0,getSize().width,getSize().height,this);
	}
}
