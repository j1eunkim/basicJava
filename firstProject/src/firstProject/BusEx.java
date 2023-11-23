 package firstProject;

public class BusEx {
	public static void main(String[] args) {
		Bus bus = new Bus();
		Car c = new Bus();//이렇게 가리키는 것도 가능 
		bus.run(); //Car로부터 상속받은 메소드
		bus.noise();
		
		Car car = new Car();
		car.run();
		//car.noise();는 안됨. 부모클래스가 자삭이 갖고있는 메소드는 사용할 수 없어서
		
		Bus bus2 = (Bus)c; //클래스 형변환
		bus2.noise();
	}
}
