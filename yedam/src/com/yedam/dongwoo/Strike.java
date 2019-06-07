package com.yedam.dongwoo;

public class Strike {
	int notzero;
	int b, s;
	int gamenum;
	int[] ranball = new int[3]; // 랜덤공
	int[] inputball = new int[3]; // 입력공
	boolean check = false;

	void ranmake() { // 랜덤공 만들기 중복x
		while (true) {
			for (int i = 0; i < ranball.length; i++) {
				ranball[i] = (int) (Math.random() * 10);
				
			}
			if (ranball[0] == ranball[1] || ranball[0] == ranball[2] // 중복검사
					|| ranball[1] == ranball[2] || ranball[0]==0 ||ranball[1]==0 ||ranball[2]==0)
				continue;
			break;
		}
	}

	void counter() { // 스트라이크 볼 판단 for문 안에 if문써서 같을땐 s증가 다를땐b증가
		b = 0;
		s = 0;
		for (int i = 0; i < ranball.length; i++) {
			for (int j = 0; j < inputball.length; j++) {
				if (i == j) { // 같은위치공일때 스트라이크증가
					if (ranball[i] == inputball[j])
						s++;
				} else // 다른위치공과 같을때 볼 증가
				if (ranball[i] == inputball[j])
					b++;
			}
		}
		System.out.println("볼:"+b+ "  스트라이크:"+s);
	}

	void setball(int setball, int ballnum) { // 공입력 (입력값 , 공번호)

		this.inputball[ballnum] = setball;
	}

	void check() { // 게임결과 판단 종료시 check값을 참으로 바꾼다
		if (s == 3) {
			System.out.println("end");
			System.out.println("end");
			System.out.println("end");
			System.out.println("end");

			this.check = true;

		}
	}
	void gamenum() {
		this.gamenum +=1;
	}
}
