import java .util.*;
class MaximumAppearencInArray{
	public static  int ElementAppereanceCount(int []arr, int n){
		int count=0;
		for(int i =0;i<arr.length;i++){
			if(n==arr[i]){
				count++;
			}
		}
		return count;
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int max=Integer.MIN_VALUE,element=0;
		int []arr= new int[size];
		for(int i =0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i =0;i<arr.length;i++){
			
			if(max<ElementAppereanceCount(arr,arr[i])){
				max=ElementAppereanceCount(arr,arr[i]);
				element = arr[i];
			}
		}
		System.out.println(element);
	}
}