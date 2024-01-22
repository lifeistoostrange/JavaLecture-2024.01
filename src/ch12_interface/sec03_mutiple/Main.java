package ch12_interface.sec03_mutiple;

import ch12_interface.sec02_interface.RemoteControllable;

public class Main {

	public static void main(String[] args) {
		RemoteControllable rc = new SmartTV();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		Serchable sc = new SmartTV();
		sc.serch("www.youtube.com");
		
		SmartTV  stv = new SmartTV();
		stv.turnOn();
		stv.setVolume(12);
		stv.serch("www.naver.com");
		stv.turnOff();
		
		sc = new Serchable() {
			@Override
			public void serch(String url) {
				System.out.println("익명 구현체가 " + url + "을/를 검색 합니다");
			}
		};
		sc.serch("kakao");
	}

}
