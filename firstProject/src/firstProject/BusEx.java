package firstProject;

public class BusEx {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run(); //Car로부터 상속받은 메소드
		bus.noise();
		
		Car car = new Car();
		car.run();
		//car.noise();는 안됨. 부모클래스가 자삭이 갖고있는 메소드는 사용할 수 없어서
	}
}
