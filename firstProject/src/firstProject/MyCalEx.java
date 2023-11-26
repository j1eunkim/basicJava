package firstProject;

public class MyCalEx {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		cal.plus(1, 3);
		cal.multiple(3, 7);
		int i = cal.exec(5, 3);
		System.out.println(i);
		
		int a = Calculator.exec2(2, 3);
		System.out.println(a);

	}

}
