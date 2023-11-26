package firstProject;

public class PracticeQ {
	public PracticeQ(int n) {
		
		int answer = 0;
	      int i = 0;
	      for(i=1;i<n+1;){
	          if(n%i == 0){
	              answer += i;
	              i += 1;
	          }else{
	              i += 1;
	          }
	      }
	      
	     System.out.println(answer);
		
	}
}
