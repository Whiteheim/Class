package com.sh.aug18.main;

// Wrapper Class : (자료형) 기본형들의 객체형 (포장객체)
//		Integer, Double, Long, Void, Boolean, ......
//		기본 자료형을 객체로 다루기 위해 사용하는 Class
//		Java의 기본형은 값을 가지고 있는 객체 생성이 가능
//		기본형이 가지고 있는 값을 내부에 두고 그 위를 포장하는 방식
//	Boxing (포장하다) : 기본형 -> 래퍼클래스  
//	UnBoxing (포장을 뜯어내는것) : 래퍼클래스 -> 기본형

// 1. 객체나 클래스가 제공하는 method를 사용할 때 
// 2. 클래스가 제공하는 상수를 사용할 때 (MIN_VALUE, MAX_AVLUE)
// 3. 숫자, 문자로 형변환을 할 떄 (주로 사용)

public class Aug_19_Main {
	public static void main(String[] args) {
		int a = 10;
		String a1 = "100";
		double bb = (double) a;
		
		// Integer 객체를 생성 -> 정수값을 넣어서 -> int형으로 return
		Integer b = new Integer(a1);
		System.out.println(b.getClass());
		b.intValue();	
		System.out.println(b);
		System.out.println(b.TYPE);
		
		// 기본형 -> 객체형
		double c = 123.456;
		Double d = new Double(c);
		System.out.println(d);
		
		// 객체형 -> 기본형
		Boolean e = new Boolean(true);
		boolean f = e.booleanValue();
		System.out.println(f);

		// 객체형 -> 기본형 (위의 과정을 자동으로 해주기 때문에 일일이 사용하지 않아도 됨.  
		//						: AutoUnBoxing)
		Integer g = 10;
		
		// 기본형 -> 객체형 (위의 과정을 자동으로 해줌 : AutoBoxing) 
			int h = g;
			
			int max = Integer.MAX_VALUE;
			System.out.println(max);
			int min = Integer.MIN_VALUE;
			System.out.println(min);
			
		// int 자료형 -> String (문자형)
			String num1 = Integer.toString(123);
			System.out.println(num1);
		// int 자료형 -> 2진수 (String)
			String num2 = Integer.toBinaryString(123);
			System.out.println(num2);
			
		// String -> 기본형 (직접적인 변환은 어려움. 객체형을 거쳐야함)
		// String -> 객체형 -> 기본형
			String k = "345.67";
			Double k2 = Double.parseDouble(k);
			double k3 = k2.doubleValue();
			
			String m = "150";
			int m2 = Integer.parseInt(m); // AutoUnBoxing이 되므로 요약 가능
			
		
	}
}

























