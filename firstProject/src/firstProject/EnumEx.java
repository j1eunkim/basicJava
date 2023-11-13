package firstProject;

public class EnumEx {
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumEx.FEMALE;
		gender1 = EnumEx.MALE;
		
		gender1 = "boy";

		Gender gender2;
		gender2 = Gender.FEMALE;
		gender2 = Gender.MALE;
//		gender2 = "girl"; 오류발생
	}

}

enum Gender{
	FEMALE, MALE
}
