import java.util.*;
class AccurenceOfCharacterInString{
	public static void countCharacter(char []arr,char ch){
		int count=0;
		for(int i =0;i<arr.length;i++){
			if(arr[i]==ch){
				count++;
				arr[i]='*';
			}
		}
		System.out.println(ch +"-----"+count);
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char []arr = str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]!='*'){
			countCharacter(arr,arr[i]);
			}
		}
	}
}