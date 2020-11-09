import java.util.*;
class IntroductionOfSymbolAfterSeveralCharacterInString{
	public static void main(String []args){
		Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine();
		String s=" ";
		int count=1;
		for(int i=0;i<str.length();i++){
			if(i!=0 && i%6==0){
				s+="#";
			}
			char ch = str.charAt(i);
			s+=String.valueOf(ch);
		}
		System.out.println(s);
	}
}