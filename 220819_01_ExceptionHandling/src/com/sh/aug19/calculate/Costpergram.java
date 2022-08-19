package com.sh.aug19.calculate;

import java.util.Scanner;

public class Costpergram {

	public int cost() {
		Scanner k = new Scanner(System.in);
		System.out.print("가격 : ");
		return k.nextInt();
	}
	public int gram() {
		Scanner k = new Scanner(System.in);
		System.out.print("무게 : ");
		return k.nextInt();
	}
	
	public void costpergram(int cost, int gram) {
		int costpergram;
		costpergram = cost / gram; 
		System.out.printf("g당 가격은 : %d원\n", costpergram);
	}
	
	
}
