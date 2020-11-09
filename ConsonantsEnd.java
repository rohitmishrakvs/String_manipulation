import java.util.*;
class ConsonantsEnd{
	public static String changeStr(String str){
		char []arr=str.toCharArray();
		int j;
		char k=' ' ;
		for(int i =0;i<arr.length;i++){
			char ch = arr[0];
			for(j=0;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[j]=ch;
			k=arr[0];
			if(k=='a' || k=='e' || k=='i' ||k=='o' || k=='u' ){
				break;
			}
		}
		String strr = String.valueOf(arr);
		return strr;
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		String s =" ";
		 
		char ch = str.charAt(0); 
		if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u' ){
			s =str+"way";			
		}
		else{
			s = changeStr(str)+"ay";
		}
		System.out.println(s);
		sc.close();
	}
}