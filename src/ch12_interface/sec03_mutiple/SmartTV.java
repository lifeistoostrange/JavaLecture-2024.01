package ch12_interface.sec03_mutiple;

import ch12_interface.sec02_interface.RemoteControllable;

public class SmartTV implements RemoteControllable, Serchable {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("SmartTV를 킵니다");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControllable.MAX_VOLUME) {
			this.volume = RemoteControllable.MAX_VOLUME;
		} else if (volume < RemoteControllable.MIN_VOLUME) {
			this.volume = RemoteControllable.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

	@Override
	public void serch(String url) {
		System.out.println("SmartTv가" + url + "을 검색합니다");
	}

}
