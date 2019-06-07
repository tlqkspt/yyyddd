package com.yedam;

public class Bus {
	String busNo;
	String busColor;
	int busLength;
	boolean door = false;
	
	void run() {
		System.out.println("버스 달린다");
	}
	void stop() {
		System.out.println("버스 선다");
	}
	void openDoor() {
		door = true;
		
	}
	void closeDoor() {
		door = false;
	}
	
	boolean cardCheck(int busFee) {
		if(busFee>= 1000)
			return true;
		else
			return false;
	}
}

