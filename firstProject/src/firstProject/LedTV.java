package firstProject;

public class LedTV implements tv {
//tv라는 인터페이스가 가진 기능을 LedTV클래스가 구현하도록 하겠다는 것
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끄다");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println(volume+"으로 볼륨을 조정합니다.");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println(channel+"번 채널로 조정합니다.");
	}

}
