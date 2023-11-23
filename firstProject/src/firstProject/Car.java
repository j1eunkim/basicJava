package firstProject;



public class Car {
	String name;
	int number;
	
	//name과 number는 field.(학생으로 치면 학번, 이름 같은 것)
	//method는 function과 비슷한 개념
	//->입력값을 매개변수(parameter) 혹은 인자(argument), 결과값을 리턴값이라 함
	public Car(String name) {
		this.name = name;
		//생성자를 추가해서 name을 초기화함 
		//그런데 이렇게 사용자가 생성자를 추가하면 Car c1 = new Car() 라고 하면 오류가 남
		//this.name은 필드 name을 말함
		//=뒤의 name은 매개변수를 의미함
	}
	
	public Car() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음", 0); //위의 두줄과 같은 효과임
		//아래에 설정한 자기 자신의 생성자를 호출하는 것임
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void run() {
		System.out.println("달려~");
	}
}
