package firstProject;

public class ArrayEx {

	public static void main(String[] args) {
//	1차원 배열 만들기	
		int[] array1 = new int[100];
		
		array1[0] = 1;
		array1[99] = 100;
		
		int[] array2 = new int[]{1,2,3,4};
		
		int[] array3 = {1,2,3,4};
		
		System.out.println(array3[0]);
		int value = array3[0];
		
		System.out.println(value);
//for문을 이용해서 값 넣기
		int[] iarray = new int[100];
		for(int i = 0; i<iarray.length; i++) {
			iarray[i]=i+1;
		}
		
		int total = 0;
		for(int i=0; i<iarray.length; i++) {
			total += iarray[i];
		}
		System.out.println(total);
		
//2차원 배열 만들기
		int[][] array4 = new int[3][4];
		array4[0][0] = 10;
		
		int[][] array5 = new int[3][];
		array5[0] = new int[1];
		array5[1] = new int[2];
		array5[2] = new int[3];
		array5[0][0] = 10;
		int[][] array6 = {{1}, {1,2}, {1,2,3}};
		System.out.println(array6[2][2]);
		
		int[] iarr = {10,20,30,40,50};
		for(int i =0; i<iarr.length; i++) {
			int value1 = iarr[i];
			System.out.println(value1);
		}
		for(int i:iarr) {
			System.out.println(i);
		}
	}

}
