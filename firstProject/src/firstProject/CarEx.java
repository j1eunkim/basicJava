package firstProject;

public class CarEx {

	public static void main(String[] args) {
		//Car c1 = new Car();
		Car c2 = new Car("구급차");
		Car c3 = new Car();
		Car c4 = new Car("자가용", 1111);
		
		//c1.name = "my first car";
		//c1.number = 1111;
		c2.number = 2222;
		
		System.out.println(c3.name);
	}

}
