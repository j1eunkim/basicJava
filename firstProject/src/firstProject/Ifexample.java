package firstProject;

public class Ifexample {

	public static void main(String[] args) {
		//switch, case, default, break
		int month = 11;
		String season = "";
		
		switch(month) {
		case 1:
        case 2:
        case 12:
            season = "겨울";
            break;
        case 3:
        case 4:
        case 5:
            season = "봄";
            break;
        case 6:
        case 7:
        case 8:
            season = "여름";
            break;
        case 9:
        case 10:
        case 11:
            season = "가을";
            break;
		}
		System.out.println("지금은 " + month + "월이고, " + season + "입니다.");

	}

}
