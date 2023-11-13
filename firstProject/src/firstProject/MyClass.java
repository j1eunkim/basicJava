package firstProject;

public class MyClass {
	//public 리턴타입 메소드명 (매개변수 등) {구현}
	
	public void method1 () {
	//void는 return type이 없다는 것
		System.out.println("m1 ing...");
	}
	
	public void method2(int x) {
		System.out.println("m2의 "+x);
	}
	
	public int method3() {
		System.out.println("m3실행");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println("m4의 "+(x+y));
	}
	public int method5(int x) {
		System.out.println("m5의 "+x);
		return x*2;
	}

}
