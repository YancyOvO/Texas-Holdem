package com.dezhou2;

import javax.swing.JOptionPane;

//��ʼ�˵�
public class Start {
	static int num;
	//�������
	public static void rule() {
		JOptionPane.showMessageDialog(null, "��ӭ���������˿�", "GAME",JOptionPane.PLAIN_MESSAGE);
	}
	//ѡ�������
	public static int optCom(){
		java.lang.Object[] opt = {"1","2","3","4"};
		String com =  (String) JOptionPane.showInputDialog(null,"��ѡ��Կ���������\n","ѡ��",
				JOptionPane.PLAIN_MESSAGE,null,opt,1);
		if(com==null)
			System.exit(0);
		else{
			num=Integer.parseInt(com);
		}
		return num;
	}
}
