package firstProject;

public class RefernceType {

	public static void main(String[] args) {
		int i = 4;
		
		String str = new String("hello");
		
		String str1 = "hello";
		String str2 = "hello";
		
		if(str1 == str2) {
			System.out.println("same refernce");
		}
		if(str == str1) {
			System.out.println("same");
		}System.out.println("no");
		
		

	}

}
