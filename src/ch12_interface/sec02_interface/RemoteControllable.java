package ch12_interface.sec02_interface;

public interface RemoteControllable {
	// 상수만 사용
	public static final int MIN_VOLUME = 0;		// public static final 생략
	int MAX_VOLUME = 10;
	
	// 추상 메소드
	public abstract void turnOn();
	public abstract void turnOff();
	void setVolume(int volume);			//public abstract 생략
	
}
