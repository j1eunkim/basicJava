package firstProject;

public class Bus extends Car {
	public void noise() {
		System.out.println("빵빵");
	}
	public void run() {
		super.run();//부모의 run을 실행하려면 super생성자를 이용
		System.out.println("자식이 run");
	} 
}
