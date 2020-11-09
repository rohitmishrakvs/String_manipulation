import java.util.*;
class FindsumOfDigits{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		int remainder=0;
		while(num!=0){
			remainder=num%10;
			sum+=remainder;
			num=num/10;
		}
		System.out.println(sum);
	}
}