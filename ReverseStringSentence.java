
//reverse a geiven string "india is great country"


import java.util.*;
class ReverseStringSentence{
	public static void Reverse_str(String []srr){
		int len =srr.length;
		String str = " ";
		int i =0;
		while(i<len){
			str=srr[i];
			srr[i]=srr[len-1];
			srr[len-1]=str;
			i++;
			len--;
		}
		for(int j=0;j<srr.length;j++){
			System.out.print(srr[j]+" ");
		}
		
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String []srr = str.split(" ");
		Reverse_str(srr);
		
		
	}
}