import java.util.*;
class TestToken{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers seperated by space:");
		StringTokenizer token = new StringTokenizer(sc.nextLine()," ");
		int sum=0;
		while(token.hasMoreTokens()){
			String num = token.nextToken();
			System.out.println(num);
			sum += Integer.parseInt(num);
		}System.out.println("sum="+sum);
	}
}
