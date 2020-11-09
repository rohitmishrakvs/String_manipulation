import java.util.*;

class AnagramCheck{
	public static boolean CheckAnagra(String str1, String str2){
		boolean flag =false;
		if(str1.length()!=str2.length()){
			return false;
		}
		char []arr=str2.toCharArray();
		for(int i=0;i<str1.length();i++){
			for(int j=0;j<arr.length;j++){
				if(str1.charAt(i)==arr[j]){
					flag=true;
					arr[j]='*';
					break;
				}
			}
			if(flag==false){
				break;
			}
		}
		return flag;
	
	}	
	public static void main(String []args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter first String:-");
		String str1=sc.nextLine();
		System.out.println("Enter Second String:-");
		String str2=sc.nextLine();
		if(CheckAnagra(str1,str2)== true){
			System.out.println("Anagram");
		}
		else{
			System.out.println("Not a Anagram");
		}
	}
}