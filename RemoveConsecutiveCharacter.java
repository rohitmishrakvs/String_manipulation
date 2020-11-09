import java.util.*;
class RemoveConsecutiveCharacter{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		String s="";
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int count=0;
		char []arr=str.toCharArray();
		for(int i=0;i<arr.length-1;i++){
			if(count<num && arr[i]==arr[i+1]){
				s+=str.charAt(i);
				count++;
			}
			else if(arr[i]!=arr[i+1]){count=0;}
		}
		System.out.println(s);
	}
}