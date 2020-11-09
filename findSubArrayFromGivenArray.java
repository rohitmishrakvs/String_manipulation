import java.util.*;
class findSubArrayFromGivenArray{
	public static void NoOfarrays(int []atr,int n, int sum){
		ArrayList<Integer> al = new ArrayList<Integer>();
		int temp = 0 ;
		for(int i=n,j=0 ; i<atr.length ; i++,j++){
			al.add(atr[i]);
			temp+=atr[i];
			if(temp==sum){
				for(int k=0;k<al.size();k++){
					System.out.print(al.get(k)+" ");
				}
				break;
				}
		}
		
		System.out.println();
	}
		
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the number:  ");
		int num=sc.nextInt();
		System.out.println("Enter array element:  ");
		int []arr = new int[10];
		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			NoOfarrays(arr,i,num);
		}
		
	}
}