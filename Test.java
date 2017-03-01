package com.interview;

public class Test {
	
	public static void main(String[] args) {

		int i=10 , j=20;
		System.out.println("i-->"+i+" "+"j-->"+j);
		
		int a =i;
		int b=j;
		
		//swapInt swaping1 = (a,b)->System.out.println("arg one"+a+" "+b);
		
		swapInt swaping = new swapInt() {
			
			@Override
			public void swap(int i, int j) {
				
				int temp = i;
				i = j;
				j = temp;
				System.out.println("i-->"+i+"j-->"+j);
				
			}
		};

	}

	public interface swapInt{
		void swap(int a,int b);
		
	}
}
