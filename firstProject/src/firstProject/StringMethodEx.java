package firstProject;

public class StringMethodEx {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.length());
		System.out.println(str.concat(" world!"));
		str = str.concat(" World!");
		System.out.println(str);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 8));

	}

}
