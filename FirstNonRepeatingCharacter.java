import java.util.*;
class FirstNonRepeatingCharacter{
	public static int countCharacter(String str, char c ){
		int count = 0;
		for(int i = 0 ;i<str.length();i++){
			if(str.charAt(i)==c){
				count++;
			}
		}
		return count;
		
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++){
			if(countCharacter(str,str.charAt(i))==1){
				System.out.println(str.charAt(i));
				break;
			}
		}
		
	}
}