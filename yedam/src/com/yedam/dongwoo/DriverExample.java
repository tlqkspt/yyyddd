package com.yedam.dongwoo;

class Vehicle {
	void run() {
		System.out.println("Vehicle run");
	}
}
class Bus extends Vehicle{
	@Override
	void run() {
		System.out.println("Bus run");
	}
}
class Taxi extends Vehicle{
	@Override
	void run() {
		System.out.println("Taxi run");
	}
}
class Driver{
	
}

public class DriverExample {

}
