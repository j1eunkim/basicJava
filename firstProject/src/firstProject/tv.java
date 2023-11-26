package firstProject;

public interface tv {
	//인터페이스는 객체를 설정하기 전에 가지고 있을 기능을 정의해줌
	//그래서 인터페이스를 따로 구현하는 과정을 거쳐줘야 함 
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
