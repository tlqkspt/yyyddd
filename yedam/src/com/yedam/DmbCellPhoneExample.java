package com.yedam;
class CellPhone{
	String model;
	String color;
	
	CellPhone(){
		
	}
	CellPhone(String model, String color){
		this.model = model;
		this.color = color;
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {
		System.out.println("자신: " + message);
	}
	void reciveVoice(String message) {
		System.out.println("상대방: "+ message);
	}
	void handUp() {
		System.out.println("전화를 끊습니다.");
	}
}
class DmbCellPhone extends CellPhone {
	int channel;
	DmbCellPhone(){
		
	}
	DmbCellPhone(String model,String color, int channel){
		super(model, color);
		this.channel = channel;	
	}
	
	
	void turnOnDmb() {
		System.out.println("채널: "+ channel);
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널을"+ channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}
	void handUp() {
		System.out.println("DMB 방송 종료");
	}
}

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("SMT-300","red",10);
		dcp.bell();
		dcp.turnOnDmb();
		dcp.changeChannelDmb(55);
		
		System.out.println(dcp.model+" "+ dcp.color + " "+ dcp.channel);
		
		dcp.handUp();
	}
}
