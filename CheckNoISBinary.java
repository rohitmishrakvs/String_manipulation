import java.util.*;
class CheckNoIsBinary{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		long num=sc.nextLong();
		boolean flag=true;
		long remainder=0;
		if(num==0 || num ==1 || num<0){
			flag=false;
		}else{
			while(num!=0){
				remainder = num%10;
				if(remainder>1){
					flag=false;
					break;
				}
				num=num/10;
			}
		}
		if(flag==true){
			System.out.println("Binary.");
		}
		else{
			System.out.println("Not binary no.");
		}
		sc.close();
	}
}