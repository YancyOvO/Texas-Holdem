package com.dezhou2;

import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 * ���밴ť3
 * @author Administrator
 *
 */
public class Chip3 extends JButton{
	public void paintComponent ( Graphics g ){
//		super.paintComponent(g);
		URL imgURL = getClass().getResource("/images/chip/3.png"); 
        ImageIcon icon=new ImageIcon(imgURL); 
        g.drawImage(icon.getImage(),0,0,getSize().width,getSize().height,this);
	}
}
