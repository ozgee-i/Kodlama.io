package javademos;

import java.util.Iterator;

public class loopDemo {

	public static void main(String[] args) {
		//i=i+1 ile i++ aynıdır
		for(int i=1;i<=10;i++)	{
			System.out.println(i);
			
		}	System.out.println("for döngüsü bitti");
		
		for(int i=1;i<=10;i+=2)	{
			System.out.println(i);
			
		}	System.out.println("for döngüsü bitti");
		
		for(int i=2;i<=10;i+=2)	{
			System.out.println(i);
			
		}	System.out.println("for döngüsü bitti");
		
		//WHİLE 
		//şart sağlanmazsa asla girmez
		int i=1;
		while(i<10) { 
			System.out.println(i);
			i++;
		}System.out.println("while döngüsü bitti");
		
		//Do-While
		//şart sağlanmazsa bile girer
		int j=100;
		do {
			System.out.println(j);
			j++;
		}while(j<10);
		System.out.println("do-while döngüsü bitti");

	}

}
