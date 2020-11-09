import java.util.*;
class FirstRepeatingCharacter{
	public static int CountChar(String str , char c){
		int count =0;
		for(int i =0;i<str.length();i++){
			if(str.charAt(i)==c){
				count++;
			}
		}
		return count;
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i =0;i<str.length();i++){
			char c = str.charAt(i);
			if(CountChar(str,c)!=1){
				System.out.println(c);
				break;
			}
		}
	}
}