package com.interview;

public class Test {
	
	public static void main(String[] args) {

		/*Integer a = null;
		int b = a;
		System.out.println(b);*/
		
		try {
		    int c = 1/0;
		} catch (Exception e) {
		    System.out.println("E");
		} finally {
		    System.out.println("F");
		}
		
		Test t = new Test();
		Test u = new Test();
		
		
		System.out.println(m(t,u));
		
		int i=10 , j=20;
		System.out.println("i-->"+i+" "+"j-->"+j);
		
		//int a =i;
		//int b=j;
		
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
	public static String m(Test o1, Test o2) {
	    String s1 = o1 == o2 ? "0" : "1";
	    String s2 = o1.equals(o2) ? "0" : "1";
	    String s3 = o1.hashCode() == o2.hashCode() ? "0" : "1";
	    return s1 + s2 + s3;
	}
}
