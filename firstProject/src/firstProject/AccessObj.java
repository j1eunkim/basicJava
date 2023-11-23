package firstProject;

public class AccessObj {
	public int p = 3; 
	protected int p2 = 4; //같은 패키지이거나 상속받은 자만 접근 가능
	int k = 2; //default는 같은 패키지에서만 접근 가능
	private int i = 1; //자기 자신만 접근 가능
	
}
