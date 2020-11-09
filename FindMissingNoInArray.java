import java.util.*;
class FindMissingNoInArray{
	public static void findMissing(int []arr){
		int total =0;
		for(int i =0;i<arr.length-1;i++){
			total=arr[i+1]-arr[i];
			
			if(total!=1){
				System.out.println(arr[i]+1);
				break;
			}
		}
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int []arr= new int[num];
		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		findMissing(arr);
		sc.close();
	}
}