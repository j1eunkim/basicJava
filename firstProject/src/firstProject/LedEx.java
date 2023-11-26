package firstProject;

public class LedEx {

	public static void main(String[] args) {
	//인터페이스가 갖고 있는 메소드만 사용가능
	tv tv1 = new LedTV();
	tv1.turnOn();
	tv1.changeChannel(20);
	tv1.changeVolume(23);

	}

}
