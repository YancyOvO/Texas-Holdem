package com.dezhou2;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
/**
 * Í¼Æ¬Â·¾¶¹¤¾ß
 * @author Administrator
 *
 */
public class Object {
	public static Image getImage(String path){
		URL u = Computer.class.getClassLoader().getResource(path);
		BufferedImage img = null;
		try {
			img = ImageIO.read(u);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return img;
	}
	
}
