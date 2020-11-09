import java.util.*;
class RemoveCharacterFromString{
	public static void removeString(String str ,char ch){
		char []arr= str.toCharArray();
		char c = ' ';
		int j ;
		for(int i =0;i<arr.length;i++){
			if(arr[i]==ch){
				for(j=i;j<arr.length-1;j++){
					arr[j]=arr[j+1];
				}
			arr[j]=c;
			}
		}
		str = String.valueOf(arr);
		str= str.trim();
		System.out.println(str);
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		removeString(str,ch);
		sc.close();
	}
}