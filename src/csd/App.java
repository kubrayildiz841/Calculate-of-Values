package csd;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);	
		int val,choose;
		int sum=0;
		int count=0;
		int max=0 ,min=0,temp=0;
	
		LOOP:
		for(;;) 
		{
			System.out.println("Yeni  bir  deger  girmek  istiyor  musunuz? "
			+ " [Evet  için  1(bir)  Hayir  için  0(sifir)  degerlerinden  birini  giriniz]");
		
			choose=Integer.parseInt(kb.nextLine());
			
			switch(choose) 
				{
			case 1:
				System.out.println("Bir tamsayi giriniz");
				val=Integer.parseInt(kb.nextLine());
				if(val>=0 && val<=100) 
				{
					if(count==0) 
					{
						temp=val;
						max=temp;
						min=temp;
					}
				count++;
		
				if(val>max)
					max=val;
				else if(val<min)
					min=val; 
					sum+=val;
				}
			else 
				System.out.printf("Gecersiz deger!%nYeni bir deger giriniz%n");
			break;
			case 0:
				System.out.printf("toplam:%d%n",sum);
				System.out.printf("%d adet sayi girildi%n",count);
				System.out.printf("Maximum:%d%n",max);
				System.out.printf("Minimum:%d%n",min);
			break LOOP;
			
				}
		}
		kb.close();		
	}
	
}