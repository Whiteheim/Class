package com.sh.aug22.main;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class SCMain2 {
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("203.252.32.189", 7777); // 상대 아이피와 포트
			System.out.println("연결됨");
			Scanner k = new Scanner(System.in);
			
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			Robot r = new Robot();
			while (true) {
				String msg = br.readLine();
				if (msg.contains(",")) {
					String[] xy = msg.split(",");
					int x = Integer.parseInt(xy[0]);
					int y = Integer.parseInt(xy[1]);
					r.mouseMove(x, y);
				} else if (msg.equals("l")) {
					r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				} else if (msg.equals("r")) {
					r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
					r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
				} else {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
