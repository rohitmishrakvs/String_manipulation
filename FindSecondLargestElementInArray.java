import java.util.*;
class FindSecondLargestElementInArray{
	public static int secondLargest(int []arr){
		int max=Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		//System.out.println("************"+max);
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=max && arr[i]>secMax){
		
				secMax=arr[i];
				
			}
		}
		return secMax;
	}
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int []arr= new int[len];
		for(int i=0 ;i<len;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(secondLargest(arr));
		sc.close();
	}
}