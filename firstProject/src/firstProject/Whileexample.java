package firstProject;

import java.util.Scanner;

public class Whileexample {

	public static void main(String[] args) {
		int total = 0;
		int i = 1;
		
		while (i <= 10) {
			
			total += i;
			i++;
			
		}
		System.out.println(total);
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			//반복할 내용
			value = scan.nextInt();//정수값을 입력받아서 value에 넣어줌
			System.out.println("입력받은 값: "+value);
			
		}while(value != 10);
		
		System.out.println("반복 종료");
		int sum = 0;
		for(int j = 1; j <= 100; j++) {
			if(j % 2 != 0) {
				continue;
			}
			sum += j;
		}
		System.out.println(sum);
	}


}
