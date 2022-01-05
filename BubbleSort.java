import java.util.Scanner;

class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Scanner risk =new Scanner(System.in);
		System.out.println("enter your number");
		for(int i =0;i<arr.length;i++){
			 arr[i]= risk.nextInt();
		}		
		for (int j=0;j<arr.length;j++){
		System.out.println(arr[j]);
		}
	}
}