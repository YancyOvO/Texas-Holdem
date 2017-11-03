package com.dezhou2;

import javax.swing.JOptionPane;

//开始菜单
public class Start {
	static int num;
	//规则介绍
	public static void rule() {
		JOptionPane.showMessageDialog(null, "欢迎来到德州扑克", "GAME",JOptionPane.PLAIN_MESSAGE);
	}
	//选择电脑数
	public static int optCom(){
		java.lang.Object[] opt = {"1","2","3","4"};
		String com =  (String) JOptionPane.showInputDialog(null,"请选择对抗电脑数：\n","选择",
				JOptionPane.PLAIN_MESSAGE,null,opt,1);
		if(com==null)
			System.exit(0);
		else{
			num=Integer.parseInt(com);
		}
		return num;
	}
}
