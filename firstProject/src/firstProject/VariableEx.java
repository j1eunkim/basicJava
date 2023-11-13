package firstProject;

public class VariableEx {
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2 (int value2) {
		System.out.println(globalScope);
//		System.out.prinln(localScope);
//		System.out.println(value1);
		System.out.println(value2);
		System.out.println(staticVal);
	}

	public static void main(String[] args) {
//		System.out.println(globalScope);
		System.out.println(staticVal);
		
		VariableEx v1 = new VariableEx();
		System.out.println(v1.globalScope);
		VariableEx v2 = new VariableEx();
		v2.globalScope=20;
		v1.globalScope=10;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		v1.staticVal=50;
		v2.staticVal=100;
		System.out.println(v1.staticVal);
		//static한 field는 값을 저장할 수 있는 공간이 하나밖에 없는 , 클래스 변수이므로 레퍼런스.변수명 으로 쓰기보다는 
		//클래스.변수명 -> VariableEx.staticVal이렇게 쓰는게 바람직함 
		System.out.println(v2.staticVal);
		
		

	}

}
