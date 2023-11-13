package firstProject;

public class MyClassEx {

	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.method1();
		myclass.method2(10);
		int value = myclass.method3();
		System.out.println("m3의 값 "+value);
		myclass.method4(2,4);
		int value2 = myclass.method5(5);
		System.out.println("m5의 값 "+value2);
	}

}
