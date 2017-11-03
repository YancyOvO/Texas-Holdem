package com.dezhou2;
/**
 * 两个牌面进行比较
 * @author Administrator
 *
 */
public class Compare {
	 public int[] results(int[] m,int[] n) 
	 {	
		 int[] a1 = new int[5]; int[] a2 = new int[5];
	     int[] b1 = new int[5]; int[] b2 = new int[5];
	     int[] c1 = new int[5]; int[] c2 = new int[5];
		 int f1=0,f2=0,g10=0,g20=0,h1=0,h2=0,sc1=0,sc2=0,e1=0,e2=0;
		 int i,j,k,m1,m2,n1,n2;
		//取用牌面大小
			for(i=0;i<=4;i++)
			{
				a1[i]=m[i]-1;
				a2[i]=n[i]-1;
			}
			
			for(i=0;i<=4;i++)
			{
				b1[i]=a1[i]/4;
				b2[i]=a2[i]/4;
			}
		
		 //取用花色
			for(i=0;i<=4;i++)
			{
				c1[i]=a1[i]%4;
				c2[i]=a2[i]%4;
			}
		 
		//排序
	////////////////////////////////////
	   for(j=0;j<=4;j++)
         {for(i=0;i<=3;i++)
			{
				if(b1[i]>b1[i+1])
				{
					k=b1[i];
					b1[i]=b1[i+1];
					b1[i+1]=k;
					
				}
			}}
	//////////////////////////////////////////////
	    for(j=0;j<=4;j++)
			{for(i=0;i<=3;i++)
				{
					if(b2[i]>b2[i+1])
					{
						k=b2[i];
						b2[i]=b2[i+1];
						b2[i+1]=k;
						
					}
				}}
	//////////////////////////////////////////////tong hua 
		for (i=4;i>0;i--)
			{
				if(c1[i]==c1[i-1])
					{g10++;
				    continue;}
			}
		for (i=4;i>0;i--)
		{
			if(c2[i]==c2[i-1])
			{g20++;
		    continue;}
		}
//////////////////////////////////////////////	dui zi 		
		for(i=4;i>=1;i--)
			{
				if(b1[i]==b1[i-1])
				{
					f1++;
					continue;
				}
			}
		for(i=4;i>=1;i--)
		{
			if(b2[i]==b2[i-1])
			{
				f2++;
				continue;
			}
		}
		
	///////////////////////////////////////////// shun zi
		for(i=4;i>=1;i--)
			{
				if(b1[i]==b1[i-1]+1)
				{
					h1++;
					continue;
				}
			}
		for(i=4;i>=1;i--)
		{
			if(b2[i]==b2[i-1]+1)
			{
				h2++;
				continue;
			}
		}
		
	    if(b1[0]!=b1[1]||b1[3]!=b1[4])  e1=1;
	    if(b2[0]!=b2[1]||b2[3]!=b2[4])  e2=1;
		
	 if(h1==4&&g10==4) sc1=800000;//tong hua shun
	 if(h2==4&&g20==4) sc2=800000;
	 
	 if(f1==3)
		 {
		 if(e1==1) sc1=700000;//zha dan 
	     else  sc1=600000;//hu lu
		 }
	 if(f2==3)
	 {
	 if(e2==1) sc2=700000;//zha dan 
     else  sc2=600000;//hu lu
	 }
	 
	 if(g10==4&&f1==0) sc1=500000;//tong hua
	 if(g20==4&&f2==0) sc2=500000;
	 
	 if(h1==4&&g10<4)  sc1=400000;//shun zi
	 if(h2==4&&g20<4)  sc2=400000;
	 
	 if(f1==2)//3 tiao and 2 dui
	 {
		 if(b1[0]==b1[1]&&b1[1]==b1[2]) sc1=300000;
		 else if(b1[2]==b1[3]&&b1[1]==b1[2]) sc1=300000;
		 else if(b1[2]==b1[3]&&b1[3]==b1[4]) sc1=300000;
		 else sc1=200000;
	 }
	 if(f2==2)
	 {
		 if(b2[0]==b2[1]&&b2[1]==b2[2]) sc2=300000;
		 else if(b2[2]==b2[3]&&b2[1]==b2[2]) sc2=300000;
		 else if(b2[2]==b2[3]&&b2[3]==b2[4]) sc2=300000;
		 else sc2=200000;
	 }
	 
	 if(f1==1)  sc1=100000;//1 dui
	 if(f2==1)  sc2=100000;
	 
	 sc1+=b1[4]*10000+b1[3]*1000+b1[2]*100+b1[1]*10+b1[0];
	 sc2+=b2[4]*10000+b2[3]*1000+b2[2]*100+b2[1]*10+b2[0];
	 
	 if(f1==f2&&sc1<700000&&sc1>600000&&sc2<700000&&sc2>600000)//同是葫芦的比较
	 {
		 j=0;
		 for(i=4;i>=0;i--)
		 {
			 if(b1[i]>b2[i])
				 j++;
		 }
		 if(j==3) {
//			 System.out.println(sc1+"m"+sc2);
//			 System.out.println("m ying");
			 return (m);
		 }
		 else {
//			 System.out.println(sc1+"n"+sc2);
//			 System.out.println("n ying");
			 return (n);
		 }
	 }
	 else if(f1==f2&&sc1<800000&&sc1>700000&&sc2<800000&&sc2>700000)
	 {
		 if(b1[2]>b2[2]) {
//			 System.out.println(sc1+"m"+sc2);
//			 System.out.println("m ying");
			 return (m);}
		 else {
//			 System.out.println(sc1+"n"+sc2);
//			 System.out.println("n ying");
			 return (n);
		 }
	 }
	 else if(f1==f2&&sc1<400000&&sc1>300000&&sc2<400000&&sc2>300000)//同是3条的比较
	 {
		 j=0;
		 for(i=4;i>=0;i--)
		 {
			 if(b1[i]>b2[i])
				 j++;
		 }
		 if(j==3) {
//			 System.out.println(sc1+"m"+sc2);
//			 System.out.println("m ying");
			 return (m);
		 }
		 else {
//			 System.out.println(sc1+"n"+sc2);
//			 System.out.println("n ying");
			 return (n);
		 }
	 }
	 else if(f1==f2&&sc1<300000&&sc1>200000&&sc2<300000&&sc2>200000)//同是2对的比较
	 {
		  m1=b1[3];
		  m2=b1[1];
		  n1=b2[3];
		  n2=b2[1];
		 if(m1>n1) {
//			 System.out.println(sc1+"m"+sc2);
//			 System.out.println("m ying");
			 return (m);
		 }
		 else if(m1<n1){
//			 System.out.println(sc1+"n"+sc2);
//			 System.out.println("n ying");
			 return (n);
		 }
		 else
		 {
			 if(m2>n2) {
//				 System.out.println(sc1+"m"+sc2);
//				 System.out.println("m ying");
				 return (m);
			 }
			 else if(m2<n2) {
//				 System.out.println(sc1+"n"+sc2);
//				 System.out.println("n ying");
				 return (n);
			 }
			 else
			 {
				 if(sc1>sc2)
				 {
//					 System.out.println(sc1+"m"+sc2);//m ying
					 return (m);
				 }
				 else if(sc1<sc2)
				 {
//					 System.out.println(sc1+"n"+sc2);//n ying
					 return (n);
				 }
				 else
				 {
					
					  if(c1[4]>c2[4])  {
//						  System.out.println(sc1+"m"+sc2);//m ying
						 return (m);
					  }
					 else  {
//						 System.out.println(sc1+"n"+sc2);//n ying
						 return (n);
					 }
				 }
			 }
		 }
	 }
	 
	 else if(f1==f2&&sc1<200000&&sc1>100000)//同是一对的比较
	 {
		 
		 for(i=4;i>=1;i--)
		 {
			 if(b1[i]==b1[i-1])
				 break;
		 }
		 for(j=4;j>=1;j--)
		 {
			 if(b2[j]==b2[j-1])
				 break;
		 }
		 if(b1[i]<b2[j]) {
//			 System.out.println("n ying");
			 return (n);
		 }
		 else if(b1[i]>b2[j]) {
//			 System.out.println("m ying");
			 return (m);
		 }
		 else
		 {
				 if(sc1>sc2)
				 {
//					 System.out.println(sc1+"m"+sc2);//m ying
					 return (m);
				 }
				 else if(sc1<sc2)
				 {
//					 System.out.println(sc1+"n"+sc2);//n ying
					 return (n);
				 }
				 else
				 {
					
					  if(c1[4]>c2[4])  {
//						 System.out.println(c1[4]+"+"+c2[4]);//m ying
						 return (m);
					  }
					 else  {
//						 System.out.println(c1[4]+"+"+c2[4]);//n ying
						 return (n);
					 }
				 }
		 }
		 
	 }
	 else if(sc1>sc2)
	 {
//		 System.out.println(sc1+"m"+sc2);//m ying
		 return (m); 
	 }
	 else if(sc1<sc2)
	 {
//		 System.out.println(sc1+"n"+sc2);//n ying
		 return (n);
	 }
	 else
	 {
		
		  if(c1[0]>c2[0])  {
//			  System.out.println(sc1+"m"+sc2);//m ying
			 return (m);
		  }
		 else  {
//			 System.out.println(sc1+"n"+sc2);//n ying
			 return (n);
			 }
	 }
		
	 }
}

